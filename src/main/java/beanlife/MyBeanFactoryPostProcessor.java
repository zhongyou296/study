//package beanlife;
//
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.config.BeanDefinition;
//import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
//import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
//
///**
// * <p>文件名称：MyBeanFactoryPostProcessor </p>
// * <p>文件描述：</p>
// * <p>版权所有：版权所有(C)2011-2099 </p>
// * <p>公   司：口袋购物 </p>
// * <p>内容摘要：</p>
// * <p>其他说明：</p>
// * <p>完成日期：2017/2/6 </p>
// *
// * @author wangqiming
// */
//public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
//
//    public MyBeanFactoryPostProcessor() {
//        super();
//        System.out.println("这是BeanFactoryPostProcessor实现类构造器！！");
//    }
//
//    @Override
//    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//        System.out.println("BeanFactoryPostProcessor调用postProcessBeanFactory方法");
//        BeanDefinition bd = beanFactory.getBeanDefinition("beanLife");
//        bd.getPropertyValues().addPropertyValue("MultimapTest", "1000");
//    }
//}
