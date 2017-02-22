package thread.basic;

/**
 * <p>文件名称：SecondThread </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：实现Runnable接口来创建线程</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/8 </p>
 *
 * @author wangqiming
 */
public class SecondThread implements Runnable {

    private int i;

    /**
     * 线程执行体
     */
    @Override
    public void run() {
        for (; i < 100; ++i) {
            System.out.println(Thread.currentThread().getName() + ",i: " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; ++i) {
            System.out.println("threadName: " + Thread.currentThread().getName() + ",i: " + i);

            if (i == 20) {
                SecondThread target = new SecondThread();
                new Thread(target, "第一个线程").start();
                new Thread(target, "第二个线程").start();
            }
        }
    }
}
