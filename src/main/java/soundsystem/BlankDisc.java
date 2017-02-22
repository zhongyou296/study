package soundsystem;

import java.util.List;

/**
 * <p>文件名称：BlankDisc </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：磁道列表</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/7 </p>
 *
 * @author wangqiming
 */
public class BlankDisc implements CompactDisc {

    /**
     * 艺术家
     */
    private String artist;

    /**
     * 主题
     */
    private String title;

    /**
     * 磁道列表
     */
    private List<String> tracks;

    public BlankDisc() {}

    public BlankDisc(String artist, String title, List<String> tracks) {
        this.artist = artist;
        this.title = title;
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println("artist: " + artist + ",title: " + title);
        for (int i = 0; i < tracks.size(); ++i) {
            playTrack(i);
        }
    }

    /**
     * 读取某一个磁道内容
     */
    public void playTrack(int trackNumber) {
        System.out.println("track: " + tracks.get(trackNumber));
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getTracks() {
        return tracks;
    }
}
