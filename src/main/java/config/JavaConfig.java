package config;

import aop.perform.Audience;
import org.springframework.beans.factory.config.PreferencesPlaceholderConfigurer;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import soundsystem.BlankDisc;
import soundsystem.CompactDisc;
import soundsystem.TrackCounter;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>文件名称：JavaConfig </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：Java配置类</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/7 </p>
 *
 * @author wangqiming
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"soundsystem","aop.perform"})
public class JavaConfig {

    @Bean
    public Audience audience() {
        return new Audience();
    }

    @Bean
    public BlankDisc blankDisc() {
        BlankDisc blankDisc = new BlankDisc();
        blankDisc.setArtist("林宥嘉");
        blankDisc.setTitle("说谎专辑");
        List<String> list  = new ArrayList<String>();
        list.add("你是我的眼");
        list.add("说谎");
        list.add("眼前的黑不是黑");
        blankDisc.setTracks(list);
        return blankDisc;
    }

    @Bean
    public TrackCounter trackCounter() {
        return new TrackCounter();
    }

    @Bean(name = "commonProp")
    public PropertiesFactoryBean propertiesFactoryBean() {
        PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
        propertiesFactoryBean.setLocation(new FileSystemResource("/Users/wangqiming/project/study/src/main/resources/common.properties"));
        propertiesFactoryBean.setFileEncoding("UTF-8");
        return new PropertiesFactoryBean();
    }

    @Bean(name = "propertyPlaceholderConfigurer")
    public PreferencesPlaceholderConfigurer preferencesPlaceholderConfigurer() {
        PreferencesPlaceholderConfigurer preferencesPlaceholderConfigurer = new PreferencesPlaceholderConfigurer();
        preferencesPlaceholderConfigurer.setLocation(new FileSystemResource("/Users/wangqiming/project/study/src/main/resources/common.properties"));
        preferencesPlaceholderConfigurer.setFileEncoding("UTF-8");
        return preferencesPlaceholderConfigurer;
    }
}
