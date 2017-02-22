package net;

import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * <p>文件名称：URLDecoderTest </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/13 </p>
 *
 * @author wangqiming
 */
public class URLDecoderTest {

    public static void main(String[] args) throws Exception {
        String normalStr = "疯狂Android讲义";
        // 将普通字符转化为GBK编码格式的字符
        String keyWord = URLEncoder.encode(normalStr, "GBK");
        System.out.println("keyWord: " + keyWord);

        // 将GBK格式编码的字符转化为UTF-8格式编码的字符
        normalStr = URLDecoder.decode("https://www.google.co.jp/search?q=%E7%96%AF%E7%8B%82Java&oq=%E7%96%AF%E7%8B%82Java&aqs=chrome..69i57j69i65j0l4.2986j0j7&sourceid=chrome&ie=UTF-8","UTF-8");
        System.out.println("normalStr: " + normalStr);
    }
}
