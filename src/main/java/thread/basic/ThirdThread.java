package thread.basic;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * <p>文件名称：ThirdThread </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：实现Callable接口来创建线程</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/8 </p>
 *
 * @author wangqiming
 */
public class ThirdThread implements Callable<Integer> {

    private int i;

    /**
     * 带有返回值的线程执行体
     *
     * @return
     * @throws Exception
     */
    @Override
    public Integer call() throws Exception {
        for (; i < 100; ++i) {
            System.out.println(Thread.currentThread().getName() + ",i: " + i);
        }
        return 0;
    }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 100; ++i) {
            System.out.println("currentThreadName: " + Thread.currentThread().getName() + ",i: " + i);

            if (i == 20) {
                ThirdThread thirdThread = new ThirdThread();
                FutureTask<Integer> target = new FutureTask<Integer>(thirdThread);
                new Thread(target, "第一个线程").start();
                System.out.println("returnValue: " + target.get());
                new Thread(target, "第二个线程").start();
                System.out.println("returnValue: " + target.get());
            }
        }
    }
}
