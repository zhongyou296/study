package thread.basic;

/**
 * <p>文件名称：FirstThread </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：继承Thread类来创建线程</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/8 </p>
 *
 * @author wangqiming
 */
public class FirstThread extends Thread {

    private int i;

    /**
     * 线程执行体
     */
    @Override
    public void run() {
        for (; i < 100; ++i) {
            System.out.println(getName() + ",i: " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; ++i) {
            System.out.println("currThreadName: " + Thread.currentThread().getName() + ",i: " + i);

            if (i == 20) {
                // 创建并启动第一个线程
                FirstThread firstThread = new FirstThread();
                firstThread.setName("第一个线程");
                firstThread.start();
                // 创建并启动第二个线程
                FirstThread secondThread = new FirstThread();
                secondThread.setName("第二个线程");
                secondThread.start();
            }
        }
    }
}
