package thread.deadlock;

/**
 * <p>文件名称：DeadLock </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：发生死锁</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/9 </p>
 *
 * @author wangqiming
 */
public class DeadLock implements Runnable {

    private A a = new A();
    private B b = new B();

    @Override
    public void run() {
        a.foo(b);
        System.out.println("run()方法执行完啦");
    }

    public void init() {
        b.bar(a);
        System.out.println("init()方法执行完啦");
    }

    public static void main(String[] args) {
        DeadLock target = new DeadLock();
        new Thread(target, "线程1").start();
        target.init();
    }
}
