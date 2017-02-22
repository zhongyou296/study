package thread.customthreadpool;

/**
 * <p>文件名称：ThreadPoolTest </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/10 </p>
 *
 * @author wangqiming
 */
public class ThreadPoolTest {

    public static void main(String[] args) {
        // 创建3个线程的线程池
        ThreadPool t = ThreadPool.getThreadPool(3);
        t.execute(new Runnable[] { new Task(), new Task(), new Task() });
        t.execute(new Runnable[] { new Task(), new Task(), new Task() });
        System.out.println(t);
        t.destroy();// 所有线程都执行完成才destory
        System.out.println(t);
    }

    // 任务类
    static class Task implements Runnable {
        private static volatile int i = 1;

        @Override
        public void run() {// 执行任务
            System.out.println("任务 " + (i++) + " 完成");
        }
    }
}
