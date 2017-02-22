package thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p>文件名称：NewCacheThreadExecutorTest </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/9 </p>
 *
 * @author wangqiming
 */
public class NewCacheThreadExecutorTest implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; ++i) {
            System.out.println(Thread.currentThread().getName() + "正在执行。。。");
        }
    }

    public static void main(String[] args) {
        //创建一个可重用固定线程数的线程池
        ExecutorService pool = Executors.newCachedThreadPool();
        //创建实现了Runnable接口对象，Thread对象当然也实现了Runnable接口

        NewCacheThreadExecutorTest target = new NewCacheThreadExecutorTest();
        pool.submit(target);
        pool.submit(target);
        pool.submit(target);
        pool.submit(target);
        pool.submit(target);

        //关闭线程池
        pool.shutdown();
    }
}
