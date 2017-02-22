package thread.threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * <p>文件名称：ScheduleThreadPoolTarget </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/9 </p>
 *
 * @author wangqiming
 */
public class ScheduleThreadPoolTarget implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; ++i) {
            System.out.println("threadName: " + Thread.currentThread().getName() + ",i: " + i);
        }
    }

    public static void main(String[] args) throws Exception {
        ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(10);
        ScheduleThreadPoolTarget target = new ScheduleThreadPoolTarget();
        ScheduledFuture<?> future = threadPool.scheduleWithFixedDelay(target, 1,1, SECONDS);
        System.out.println("boolean: " + future.isDone());
        System.out.println("result: " + future.get());
    }
}
