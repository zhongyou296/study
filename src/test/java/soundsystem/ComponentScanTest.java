package soundsystem;

import aop.advice.AdviceManager;
import aop.perform.Encoreable;
import aop.perform.Performance;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * <p>文件名称：ComponentScanTest </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：自动扫描机制的测试</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/7 </p>
 *
 * @author wangqiming
 */
public class ComponentScanTest extends BaseSpringTest {

    @Resource(name = "blankDisc")
    private BlankDisc blankDisc;

    @Resource
    private MediaPlayer mediaPlayer;

    @Resource
    private Performance performance;

    @Resource
    private AdviceManager adviceManager;

    @Test
    public void testBlankDiscPlay() {
        assertNotNull(blankDisc);
        blankDisc.play();
    }

    @Test
    public void testMediaPlay() {
        assertNotNull(mediaPlayer);
        mediaPlayer.play();
    }

    @Test
    public void testPerformance() {
        performance.perform();
        ((Encoreable) performance).performEncore();
    }

    @Test
    public void testManyAdvices() {
        adviceManager.manyAdvices("11", "22");
    }
}
