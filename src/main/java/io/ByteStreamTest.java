package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * <p>文件名称：ByteStreamTest </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/22 </p>
 *
 * @author wangqiming
 */
public class ByteStreamTest {

    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream bOutPut = new ByteArrayOutputStream(12);
        while (bOutPut.size() != 10) {
            bOutPut.write(System.in.read());
        }

        byte[] b = bOutPut.toByteArray();
        System.out.println("Print the content");
        for (int i = 0; i < b.length; ++i) {
            System.out.print((char) b[i] + " ");
        }
        System.out.println(" ");

        int c;
        ByteArrayInputStream bInput = new ByteArrayInputStream(b);
        System.out.println("Converting characters to Upper case ");
        for (int i=0;i<1;++i) {
            while((c = bInput.read()) != -1) {
                System.out.println(Character.toUpperCase((char)c));
            }
            bInput.reset();
        }
    }
}
