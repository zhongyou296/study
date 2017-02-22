package net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/**
 * <p>文件名称：GetPostTest </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/13 </p>
 *
 * @author wangqiming
 */
public class GetPostTest {
    public static String sendGet(String url, String param) throws Exception {
        String result = "";
        String urlName = url + "?" + param;

        URL realUrl = new URL(urlName);
        // 打开和URL之间的连接
        URLConnection conn = realUrl.openConnection();
        conn.setRequestProperty("accept", "*/*");
        conn.setRequestProperty("connection", "Keep-Alive");
        conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
        // 建立实际的连接
        conn.connect();
        Map<String, List<String>> map = conn.getHeaderFields();
        for (String key : map.keySet()) {
            System.out.println("key: " + key + ",value: " + map.get(key));
        }

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));

        String line;
        while ((line = in.readLine()) != null) {
            result += "\n";
            result += line;
        }

        return result;
    }

    public static void main(String[] args) {
        try {
            String s = GetPostTest.sendGet("http://localhost:8888/abc/MultimapTest.jsp", null);
            System.out.println("s: " + s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
