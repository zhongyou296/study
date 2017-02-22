package thread.basic;

/**
 * <p>文件名称：StartDeadThread </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：线程死亡后不可重新启动,否则会抛出IllegalThreadStateException</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/8 </p>
 *
 * @author wangqiming
 */
public class StartDeadThread extends Thread {

    private int i;

    @Override
    public void run() {
        for (; i < 100; ++i) {
            System.out.println(getName() + ",i: " + i);
        }
    }

    public static void main(String[] args) throws Exception {
        Thread newThread = new StartDeadThread();
        for (int i = 0; i < 100; ++i) {
            System.out.println("currentThreadName: " + Thread.currentThread().getName() + ",i: " + i);


            if (i == 20) {
                newThread.start();
            }

            Thread.sleep(100);
            if (i == 30 && !newThread.isAlive()) {
                newThread.start();
            }
        }
    }
}
