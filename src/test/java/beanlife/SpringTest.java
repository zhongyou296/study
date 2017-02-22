//package beanlife;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
///**
// * <p>文件名称：beanlife.SpringTest </p>
// * <p>文件描述：</p>
// * <p>版权所有：版权所有(C)2011-2099 </p>
// * <p>公   司：口袋购物 </p>
// * <p>内容摘要：</p>
// * <p>其他说明：</p>
// * <p>完成日期：2017/2/5 </p>
// *
// * @author wangqiming
// */
//public class SpringTest {
//
//    public static void main(String[] args) {
//        System.out.println("***************开始初始化容器***************");
//        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean-all.xml");
//        System.out.println("***************容器初始化成功***************");
//
//        BeanLife beanLife = context.getBean(BeanLife.class);
//        System.out.println("beanLife: " + beanLife);
//
//        System.out.println("***************现在开始关闭容器***************");
//        ((ClassPathXmlApplicationContext)context).registerShutdownHook();
//    }
//}
