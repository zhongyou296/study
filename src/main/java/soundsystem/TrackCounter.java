package soundsystem;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>文件名称：TrackCounter </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：记录读取磁道的信息</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/14 </p>
 *
 * @author wangqiming
 */
public class TrackCounter {

    /**
     * 记录磁道播放的次数
     */
    private Map<Integer, Integer> trackCounts = new HashMap<Integer, Integer>();

//    @Pointcut("execution(* soundsystem.BlankDisc.playTrack(int)) && args(trackNumber))")
//    public void myPointCut(int trackNumber) {
//
//    }

    /**
     * 在每次播放前记录该磁道播放的次数
     *
     * @param trackNumber
     */
//    @Before("myPointCut(trackNumber)")
    public void countTrack(int trackNumber) {
        int currCount = getPlayCount(trackNumber);
        int newTrackCount = currCount + 1;
        trackCounts.put(trackNumber, newTrackCount);
        System.out.println("trackNumber: " + trackNumber + ",newTrackCount: " + newTrackCount);
    }

    /**
     * 获取磁道播放的次数
     *
     * @param trackNumber
     * @return
     */
    private int getPlayCount(int trackNumber) {
        if (trackCounts.containsKey(trackNumber)) {
            return trackCounts.get(trackNumber);
        } else {
            return 0;
        }
    }
}
