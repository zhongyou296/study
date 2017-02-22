package mock11;

/**
 * <p>文件名称：Class1Mocked </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/14 </p>
 *
 * @author wangqiming
 */
public class Class1Mocked {

    public String hello(String name) {
        System.out.println("hello " + name);
        return "hello " + name;
    }

    public void show() {
        System.out.println("Class1Mocked.show()");
    }
}
