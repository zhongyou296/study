package thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * <p>文件名称：ThreadPoolTarget </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/9 </p>
 *
 * @author wangqiming
 */
public class ThreadPoolTarget implements Runnable {

    private volatile int i;

    @Override
    public void run() {
        for (; i < 100; ++i) {
            System.out.println("threadName: " + Thread.currentThread().getName() + ",i: " + i);
        }
    }

    public static void main(String[] args) throws Exception {
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        ThreadPoolTarget target = new ThreadPoolTarget();
        Future<?> future = threadPool.submit(target);
        System.out.println("boolean: " + future.isDone());
        System.out.println("result: " + future.get());
        threadPool.submit(target);
        threadPool.shutdown();
    }
}
