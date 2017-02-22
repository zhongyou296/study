package mock11;

import org.junit.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

/**
 * <p>文件名称：MockTest </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：mock框架的使用</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/14 </p>
 *
 * @author wangqiming
 */
public class MockTest {

    @Test
    public void testMockMethod() {
        // 使用mockito生成Mock对象
        Class1Mocked obj = mock(Class1Mocked.class);

        // 定义Mock对象的行为和输出(expectations部分)
        when(obj.hello("z3")).thenReturn("hello l4");

        // 调用mock对象进行单元测试
        String actual = obj.hello("z3");
        System.out.println("actual: " + actual);
        assertEquals(actual, "hello l4");

        // 对Mock对象的行为进行验证
        verify(obj).hello("z3");
        verify(obj, times(1)).hello("z3");
    }

    @Test
    public void testMockMethodInOrder() {
        Class1Mocked obj1 = mock(Class1Mocked.class);
        Class1Mocked obj2 = mock(Class1Mocked.class);

        when(obj1.hello("z3")).thenReturn("hello l4");
        when(obj2.hello("z3")).thenReturn("hello 张三");

        String obj1Out = obj1.hello("z3");
        System.out.println("obj1Out: " + obj1Out);
        assertEquals("hello l4", obj1Out);

        String obj2Out = obj2.hello("z3");
        System.out.println("obj2Out: " + obj2Out);
        assertEquals("hello 张三", obj2Out);

        InOrder inOrder = inOrder(obj1, obj2);
        inOrder.verify(obj1).hello("z3");
        inOrder.verify(obj2).hello("z3");
    }

    @Test
    public void testSkipExpect() {
        Class1Mocked obj = mock(Class1Mocked.class);

        assertEquals(null, obj.hello("z3"));
        obj.show();

        verify(obj).hello("z3");
        verify(obj).show();
    }

    @Test
    public void testCallRealMethod() {
        Class1Mocked obj = mock(Class1Mocked.class);

        doCallRealMethod().when(obj).hello("z3");
        doCallRealMethod().when(obj).show();
        assertEquals("hello z3", obj.hello("z3"));
        assertEquals(null, obj.hello("l4"));
        obj.show();

        verify(obj).hello("z3");
        verify(obj).hello("l4");
        verify(obj).show();
    }

    @Test
    public void testSpy() {
        Class1Mocked obj = spy(new Class1Mocked());
        doNothing().when(obj).show();
        assertEquals("hello z3",obj.hello("z3"));
        obj.show();

        verify(obj).hello("z3");
        verify(obj).show();
    }

    @Test
    public void testSpy2() {
        Class1Mocked obj = spy(new Class1Mocked());

        when(obj.hello("z3")).thenReturn("hello l4");

        assertEquals("hello l4",obj.hello("z3"));

        verify(obj).hello("z3");
    }

    @Test
    public void testSpy3() {
        Class1Mocked obj = spy(new Class1Mocked());

        doReturn("hello l4").when(obj).hello("z3");

        assertEquals("hello l4",obj.hello("z3"));

        verify(obj).hello("z3");
    }
}
