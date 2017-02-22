package thread.threadgroup;

/**
 * <p>文件名称：MyThread </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/9 </p>
 *
 * @author wangqiming
 */
public class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; ++i) {
            System.out.println(Thread.currentThread().getName() + ",i: " + i + ",当前线程组: " + Thread.currentThread().getThreadGroup());
        }
    }

    public static void main(String[] args) {
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup(); // 获取主线程所在线程组
        System.out.println("主线程组名为: " + Thread.currentThread().getName());

        MyThread target = new MyThread();
        new Thread(threadGroup, target, "线程1").start();

        ThreadGroup newThreadGroup = new ThreadGroup("新线程组");
        newThreadGroup.setDaemon(true);
        new Thread(newThreadGroup, target, "线程2").start();
    }
}
