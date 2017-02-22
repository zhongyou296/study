package thread.deadlock;

/**
 * <p>文件名称：B </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：B对象依赖A资源</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/9 </p>
 *
 * @author wangqiming
 */
public class B {

    public synchronized void bar(A a) {
        System.out.println("currentThreadName: " + Thread.currentThread().getName() + "进入了B实例的bar()方法");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("currentThreadName: " + Thread.currentThread().getName() + "企图调用A实例的last()方法");
        a.last();
    }

    public synchronized void last() {
        System.out.println("进入B实例的last()方法内部");
    }
}
