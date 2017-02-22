//package beanlife;
//
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.*;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;
//import soundsystem.CompactDisc;
//
///**
// * <p>文件名称：BeanLife </p>
// * <p>文件描述：</p>
// * <p>版权所有：版权所有(C)2011-2099 </p>
// * <p>公   司：口袋购物 </p>
// * <p>内容摘要：bean自身的方法和bean级生命周期的方法</p>
// * <p>其他说明：</p>
// * <p>完成日期：2017/2/6 </p>
// *
// * @author wangqiming
// */
//public class BeanLife implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {
//
//    private int MultimapTest;
//    private int b;
//    private String name;
//    private BeanFactory beanFactory;
//    private ApplicationContext applicationContext;
//
//    // (1)构造方法
//    public BeanLife(int MultimapTest, int b) {
//        System.out.println("[BeanLife构造器]BeanLife的初始化方法");
//        this.MultimapTest = MultimapTest;
//        this.b = b;
//        System.out.println("MultimapTest: " + MultimapTest + ",b: " + b);
//    }
//
////    // (2)属性注入
////    public void setA(int MultimapTest) {
////        this.MultimapTest = MultimapTest;
////        System.out.println("[注入属性]初始化了a变量,MultimapTest:" + MultimapTest);
////        System.out.println("MultimapTest: " + MultimapTest + ",b: " + b);
////    }
////
////    public void setB(int b) {
////        this.b = b;
////        System.out.println("[注入属性]初始化了b变量,b:" + b);
////        System.out.println("MultimapTest: " + MultimapTest + ",b: " + b);
////    }
//
//    // (3)传入bean的id
//    @Override
//    public void setBeanName(String name) {
//        this.name = name;
//        System.out.println("[BeanNameAware接口]bean的name:" + name);
//    }
//
//    // (4)传入beanFactory的实例
//    @Override
//    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
//        this.beanFactory = beanFactory;
//        System.out.println("[BeanFactoryAware接口]初始化了beanFactory");
//    }
//
//    // (5)传入applicationContext的实例
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        this.applicationContext = applicationContext;
//        System.out.println("[ApplicationContextAware接口]初始化了applicationContext");
//    }
//
//    // (7)调用BeanPost
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("[InitializingBean接口]调用了afterPropertiesSet()方法");
//    }
//
//    // (8)调用自定义的初始化方法
//    public void myInit() {
//        System.out.println("[init-method]调用了myInit()方法");
//    }
//
//    // (10)调用该bean的相关方法
//    public void service() {
//        System.out.println("[service方法]调用了service()方法");
//        System.out.println("MultimapTest: " + MultimapTest + ",b: " + b);
//    }
//
//    // (11)调用销毁方法
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("[Disposable接口]调用了destroy()方法");
//    }
//
//    // (12)调用自定义的销毁方法
//    public void myDestory() {
//        System.out.println("[destroy-method]调用了myDestory()方法");
//    }
//}
