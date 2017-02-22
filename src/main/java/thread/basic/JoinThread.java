package thread.basic;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * <p>文件名称：JoinThread </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：主线程通过join方法等待子线程执行完后返回</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/8 </p>
 *
 * @author wangqiming
 */
public class JoinThread implements Callable<String> {

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; ++i) {
            System.out.println(Thread.currentThread().getName() + ",i: " + i);
        }
        return "我执行完啦";
    }

    public static void main(String[] args) throws Exception {
        JoinThread joinThread = new JoinThread();
        FutureTask<String> target = new FutureTask<String>(joinThread);
        Thread goodThread = new Thread(target, "好线程");

        for (int i = 0; i < 100; ++i) {
            System.out.println("currentThreadName: " + Thread.currentThread().getName() + ",i: " + i);

            if (i == 20) {
                goodThread.start();
                System.out.println("returnValue: " + target.get());
                goodThread.join();
            }
        }
    }
}
