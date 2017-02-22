package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * <p>文件名称：CDplayer </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：满足CD播放的影像设备</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/7 </p>
 *
 * @author wangqiming
 */
@Component
public class CDPlayer implements MediaPlayer {

    /**
     * 满足播放CD的需求
     */
    @Resource(name = "sgtPeppers")
    private CompactDisc compactDisc;

    @Override
    public void play() {
        compactDisc.play();
    }
}
