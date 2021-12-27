package day04;

import java.io.*;
import java.nio.charset.Charset;

/**
 * 1 读取文件 并到指定读取的字符集
 *
 * 2 返回结果  idea默认是按utf8格式读取的
 * nihaonihaonihao
 * nihao
 * nihao
 *
 * 浣犲ソ
 *
 * 浣犲
 *
 *3 防止乱码的方式 就是要读取的文件 与读取字符集保持一致
 *
 */
public class demo02 {


    public static void main(String[] args) {
        String adress="e:\\news2.txt";
        String s=null;
        try {
            //Inputstream 与reader  是字符与字节的顶层 可以指定读取的样式。
            BufferedReader br =new BufferedReader(new InputStreamReader(new FileInputStream(adress),"gbk"));
            while ((s = br.readLine())!=null){
                System.out.println(s);
            }
            br.close();


        }  catch (IOException e) {
            e.printStackTrace();
        }

    }

}
