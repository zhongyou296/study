package guava;

import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>文件名称：MapTest </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/17 </p>
 *
 * @author wangqiming
 */
public class MapTest {

    public static void main(String[] args) {
        Map<String, Map<String, String>> mapMap = new HashMap<String, Map<String, String>>();
        Map<String, String> map = new HashMap<String, String>();
        map.put("10", "10");
        mapMap.put("10", map);

        Map<String, String> map1 = new HashMap<String, String>();
        map.put("20", "20");

        for (String str : mapMap.keySet()) {
            Map<String,String> tmp = mapMap.get(str);
            for (String string : tmp.keySet()) {
                System.out.println("key: " + string + ", value: " + tmp.get(string));
            }
        }

    }
}
