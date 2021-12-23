package day01;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 1 stream 无法读取汉字
 *
 * 返回结果：
 nihao嗷嗷
 * 
 * ·
 */
public class FileInputStream02 {

    public static void main(String[] args) {

        String adress="e:\\news2.txt";
        int readBody=0;
        byte[] bt = new byte[7];
        FileInputStream fs=null;
        try {//读取文件到内存
             fs=new FileInputStream(adress);
            //每次读取n个字节，返回-1表示读取完毕
            while ((readBody=fs.read(bt)) != -1) {
             //   System.out.println((char)readBody);
                System.out.print(new String(bt,0,readBody));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭文件流，释放资源
            try {
                fs.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }




}
