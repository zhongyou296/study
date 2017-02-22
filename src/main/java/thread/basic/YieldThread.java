package thread.basic;

/**
 * <p>文件名称：YieldThread </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：单核状态下验证yield的用法</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/8 </p>
 *
 * @author wangqiming
 */
public class YieldThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; ++i) {
            System.out.println(Thread.currentThread().getName() + ",i: " + i);

            // 让当前线程从运行态变为就绪态
            if (i == 20) {
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {
        YieldThread target = new YieldThread();
        Thread highThread = new Thread(target,"高级");
        highThread.setPriority(Thread.MAX_PRIORITY);

        Thread levelThread = new Thread(target,"低级");
        levelThread.setPriority(Thread.MIN_PRIORITY);

        highThread.start();
        levelThread.start();
    }
}
