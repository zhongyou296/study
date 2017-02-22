package aop.perform;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * <p>文件名称：Audience </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：观众定义作为一个切面</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/14 </p>
 *
 * @author wangqiming
 */
//@Aspect
public class Audience {

//    @Pointcut("execution(* aop.perform.Performance.perform(..))")
//    public void myPointCut() {
//    }

    /**
     * 表演开始之前
     */
//    @Before("myPointCut()")
    public void silenceCellPhones() {
        System.out.println("演出要开始了,请将手机调成静音模式");
    }

    /**
     * 表演开始之前
     */
//    @Before("myPointCut()")
    public void takeSeat() {
        System.out.println("演出要开始了,请就坐");
    }

    /**
     * 表演结束之后
     */
//    @AfterReturning("myPointCut()")
    public void applause() {
        System.out.println("表演已经结束,请观众鼓掌");
    }

    /**
     * 表演失败
     */
//    @AfterThrowing("myPointCut()")
    public void demandRefund() {
        System.out.println("表演失败了,观众要求退款");
    }

//    @Around("myPointCut()")
    public void around(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("环绕通知: 表演要开始了,请观众就坐,并将手机调成静音模式");
            joinPoint.proceed(); // 调用被通知的方法
            System.out.println("环绕通知: 表演已经结束,请观众鼓掌");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("环绕通知: 表演失败了,观众要求退款");
        }
    }
}
