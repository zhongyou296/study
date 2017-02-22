//package beanlife;
//
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.config.BeanPostProcessor;
//
///**
// * <p>文件名称：MyBeanPostProcessor </p>
// * <p>文件描述：</p>
// * <p>版权所有：版权所有(C)2011-2099 </p>
// * <p>公   司：口袋购物 </p>
// * <p>内容摘要：</p>
// * <p>其他说明：</p>
// * <p>完成日期：2017/2/6 </p>
// *
// * @author wangqiming
// */
//public class MyBeanPostProcessor implements BeanPostProcessor {
//
//    public MyBeanPostProcessor() {
//        super();
//        System.out.println("[BeanPostProcessor构造器]");
//    }
//
//    @Override
//    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("[BeanPostProcessor的postProcessBeforeInitialization]");
//        System.out.println("bean: " + bean + ",beanName: " + beanName);
//        return bean;
//    }
//
//    @Override
//    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("[BeanPostProcessor的postProcessAfterInitialization]");
//        System.out.println("bean: " + bean + ",beanName: " + beanName);
//        return bean;
//    }
//}
