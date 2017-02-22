package aop.advice;

import org.springframework.stereotype.Component;

/**
 * <p>文件名称：AdviceManager </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/15 </p>
 *
 * @author wangqiming
 */
@Component
public class AdviceManager {

    public String manyAdvices(String param1, String param2) {
        System.out.println("方法：manyAdvices");
        return param1 + " 、" + param2;
    }
}
