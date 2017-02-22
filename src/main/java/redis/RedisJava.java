package redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisShardInfo;

import java.util.List;
import java.util.Set;

/**
 * <p>文件名称：RedisJava </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/13 </p>
 *
 * @author wangqiming
 */
public class RedisJava {

    public static void main(String[] args) {
        // Redis连接
        JedisShardInfo jedisShardInfo = new JedisShardInfo("localhost");
        jedisShardInfo.setPassword("root");
        Jedis jedis = new Jedis(jedisShardInfo); // 连接本地的Redis服务
        System.out.println("Connection to server successfully");
        System.out.println("Server is running: " + jedis.ping());

        // Redis Java String(字符串)相关操作
        jedis.set("runoobkey", "123456"); // 设置redis字符串数据
        System.out.println("Stored string in redis:: " + jedis.get("runoobkey")); // 获取存储的数据并输出

        // Redis Java List(列表)相关操作
        jedis.lpush("tutorial-list", "Redis");
        jedis.lpush("tutorial-list", "Mongodb");
        jedis.lpush("tutorial-list", "Mysql");

        // Redis Java Keys相关操作
        List<String> list = jedis.lrange("tutorial-list", 0, 10);
        for (String str : list) {
            System.out.println("value in list: " + str);
        }

        Set<String> set = jedis.keys("*");
        for (String str : set) {
            System.out.println("value in set: " + str);
        }
    }
}
