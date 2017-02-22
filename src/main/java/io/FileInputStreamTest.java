package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * <p>文件名称：FileInputStreamTest </p>
 * <p>文件描述：</p>
 * <p>版权所有：版权所有(C)2011-2099 </p>
 * <p>公   司：口袋购物 </p>
 * <p>内容摘要：</p>
 * <p>其他说明：</p>
 * <p>完成日期：2017/2/21 </p>
 *
 * @author wangqiming
 */
public class FileInputStreamTest {

    public static void main(String[] args) throws Exception {
        // 从文件中读取数据到内存中
        InputStream inputStream = new FileInputStream("/Users/wangqiming/Desktop/a.txt");
//        File file = new File("/Users/wangqiming/Desktop/a.txt");
//        InputStream inputStream1 = new FileInputStream(file);
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = inputStream.read(buffer)) != -1) {
            System.out.println("len: " + len + ",buffer: " + buffer);
        }
        inputStream.close();
    }
}
