package guava;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

/**
 * <p>文件名称：MultimapTest </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/17 </p>
 *
 * @author wangqiming
 */
public class MultimapTest {

    public static void main(String[] args) {
        Multimap<String, String> customersByType = ArrayListMultimap.create();

        customersByType.put("abc", "1");
        customersByType.put("abc", "2");
        customersByType.put("abc", "2");
        customersByType.put("abcd", "0");
        customersByType.put("abcde", "1");

        System.out.println("size: " + customersByType.size());
        for (String key: customersByType.keySet()) {
            System.out.println("key: " + key + ", value: " + customersByType.get(key));
        }
    }
}
