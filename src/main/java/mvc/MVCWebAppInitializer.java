package mvc;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * <p>文件名称：MVCWebAppInitializer </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：web.xml配置的替代方案</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/16 </p>
 *
 * @author wangqiming
 */
public class MVCWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * 会将一个或多个路径映射到DispatcherServlet
     *
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    /**
     * 用来定义DispatcherServlet应用上下文中的bean
     *
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    /**
     * 用来配置ContextLoaderListener创建的应用上下文
     *
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }
}
