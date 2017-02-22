package io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * <p>文件名称：BufferReadTest </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/21 </p>
 *
 * @author wangqiming
 */
public class BufferReadTest {

    public static void main(String[] args) throws Exception {
        System.out.write('a');
        System.out.write('\n');
        // 验证readline()
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String str = "";
//        while(!str.equals("quit")) {
//            str = bufferedReader.readLine();
//            System.out.println("read result: " + str);
//        }

        // 验证read()
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("start to read...");
//        char c = '\0';
//        while (c != 'q') {
//            c = (char)bufferedReader.read();
//            System.out.println("read result: " + c);
//        }
    }
}
