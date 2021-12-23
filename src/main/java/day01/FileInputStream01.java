package day01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 1 stream 原始读取一个字节会出现乱码 ，无法读取汉字
 *
 * 返回结果：
 * n
 * i
 * h
 * a
 * o
 * å
 * 
 * ·
 * å
 * 
 * ·
 */
public class FileInputStream01 {

    public static void main(String[] args) {

        String adress="e:\\news2.txt";
        int readBody=0;
        FileInputStream fs=null;
        try {//读取文件到内存
             fs=new FileInputStream(adress);
            //每次读取一个字节，返回-1表示读取完毕
            while ((readBody=fs.read()) != -1) {
                System.out.println((char)readBody);
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
