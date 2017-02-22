package soundsystem;

import aop.perform.Performance;
import config.JavaConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * <p>文件名称：JavaConfigTest </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：Java配置类的测试</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/7 </p>
 *
 * @author wangqiming
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaConfig.class)
public class JavaConfigTest {

    @Resource(name = "blankDisc")
    private CompactDisc compactDisc;

    @Resource
    private MediaPlayer mediaPlayer;

    @Resource
    private Performance performance;

    @Test
    public void testCompactPlay() {
        assertNotNull(compactDisc);
        compactDisc.play();
    }

    @Test
    public void testMediaPlay() {
        assertNotNull(mediaPlayer);
        mediaPlayer.play();
    }

    @Test
    public void testPerform() {
        performance.perform();
    }
}
