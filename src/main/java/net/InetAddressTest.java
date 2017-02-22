package net;

import java.net.InetAddress;

/**
 * <p>文件名称：InetAddressTest </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/13 </p>
 *
 * @author wangqiming
 */
public class InetAddressTest {

    public static void main(String[] args) throws Exception {
        // 根据主机名来获取对应的ip地址对象
        InetAddress ip = InetAddress.getByName("www.crazyit.org");
        // 判断是否可达
        System.out.println("www.crazyit.org是否可达: " + ip.isReachable(2000));
        System.out.println("crazyit的全限定域名: " + ip.getCanonicalHostName());
        System.out.println("crazyit的主机名: " + ip.getHostName());
        System.out.println("crazyit的ip地址: " + ip.getHostAddress());

        System.out.println("********************************");

        // 根据ip地址来获取ip地址对象
        InetAddress local = InetAddress.getByAddress(
                new byte[]{127, 0, 0, 1});
        System.out.println("本机是否可达: " + local.isReachable(5000));
        System.out.println("本机的全限定域名: " + local.getCanonicalHostName());
        System.out.println("本机的主机名: " + local.getHostName());
        System.out.println("本机的ip地址: " + local.getHostAddress());
    }
}
