package thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * <p>文件名称：Boss </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：老板任务实体</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/13 </p>
 *
 * @author wangqiming
 */
public class Boss implements Runnable {

    private CountDownLatch downLatch;

    public Boss(CountDownLatch downLatch){
        this.downLatch = downLatch;
    }

    public void run() {
        System.out.println("老板正在等所有的工人干完活......");
        try {
            this.downLatch.await();
        } catch (InterruptedException e) {
        }
        System.out.println("工人活都干完了，老板开始检查了！");
    }
}
