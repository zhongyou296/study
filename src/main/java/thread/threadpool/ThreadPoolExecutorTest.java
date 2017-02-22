package thread.threadpool;


import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * <p>文件名称：ThreadPoolExecutorTest </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/9 </p>
 *
 * @author wangqiming
 */
public class ThreadPoolExecutorTest implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; ++i) {
            System.out.println("threadName: " + Thread.currentThread().getName() + ",i: " + i);
        }
    }

    public static void main(String[] args) {
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(20, Integer.MAX_VALUE, 60L,
                TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
        ThreadPoolExecutorTest target = new ThreadPoolExecutorTest();
        threadPool.submit(target);
        threadPool.submit(target);
        threadPool.submit(target);
        threadPool.submit(target);
        threadPool.submit(target);
    }
}
