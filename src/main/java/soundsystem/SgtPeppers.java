package soundsystem;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * <p>文件名称：SgtPeppers </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：普通的CD播放器</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/7 </p>
 *
 * @author wangqiming
 */
@Component
public class SgtPeppers implements CompactDisc {

    @Value("#{commonProp['title']}")
    private String title;

    @Value("#{commonProp['artist']}")
    private String artist;

    @Override
    public void play() {
        System.out.println("artist: " + artist + ",title: " + title);
    }
}
