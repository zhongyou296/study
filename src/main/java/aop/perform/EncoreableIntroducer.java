package aop.perform;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * <p>文件名称：EncoreableIntroducer </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：为Performance接口的所有子类型引入该接口,该接口的实现类是EncoreableImpl</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/15 </p>
 *
 * @author wangqiming
 */
//@Aspect
public class EncoreableIntroducer {

//    @DeclareParents(value = "aop.perform.Performance+", defaultImpl = EncoreableImpl.class)
    public static Encoreable encoreable;
}
