package aop.perform;

/**
 * <p>文件名称：EncoreableImpl </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：Encoreable接口的实现类</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/15 </p>
 *
 * @author wangqiming
 */
public class EncoreableImpl implements Encoreable {

    @Override
    public void performEncore() {
        System.out.println("这是performEncore()方法");
    }
}
