//package beanlife;
//
//import org.springframework.beans.BeansException;
//import org.springframework.beans.PropertyValues;
//import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
//
//import java.beans.PropertyDescriptor;
//
///**
// * <p>文件名称：MyInstantiationAwareBeanPostProcessor </p>
// * <p>文件描述：</p>
// * <p>版权所有：版权所有(C)2011-2099 </p>
// * <p>公   司：口袋购物 </p>
// * <p>内容摘要：</p>
// * <p>其他说明：</p>
// * <p>完成日期：2017/2/6 </p>
// *
// * @author wangqiming
// */
//public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {
//
//    public MyInstantiationAwareBeanPostProcessor() {
//        super();
//        System.out.println("[InstantiationAwareBeanPostProcessorAdapter构造器]");
//    }
//
//    /**
//     * 实例化Bean之前调用
//     *
//     * @param beanClass
//     * @param beanName
//     * @return
//     * @throws BeansException
//     */
//    @Override
//    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
//        System.out.println("[InstantiationAwareBeanPostProcessorAdapter的postProcessBeforeInstantiation]");
//        System.out.println("beanName: " + beanName);
//        return super.postProcessBeforeInstantiation(beanClass, beanName);
//    }
//
//    @Override
//    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("[InstantiationAwareBeanPostProcessorAdapter的postProcessAfterInitialization]");
//        System.out.println("beanName: " + beanName);
//        return super.postProcessAfterInitialization(bean, beanName);
//    }
//
//    /**
//     * 设置某个属性时调用
//     *
//     * @param pvs
//     * @param pds
//     * @param bean
//     * @param beanName
//     * @return
//     * @throws BeansException
//     */
//    @Override
//    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
//        System.out.println("设置某个属性时调用,beanName: " + beanName);
//        return super.postProcessPropertyValues(pvs, pds, bean, beanName);
//    }
//}
