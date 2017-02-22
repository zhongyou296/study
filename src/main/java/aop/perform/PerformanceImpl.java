package aop.perform;

import org.springframework.stereotype.Component;

/**
 * <p>文件名称：PerformanceImpl </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：表演接口的实现类</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/14 </p>
 *
 * @author wangqiming
 */
@Component
public class PerformanceImpl implements Performance {

    @Override
    public void perform() {
        System.out.println("演员开始表演啦...");
    }
}
