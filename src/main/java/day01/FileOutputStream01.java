package day01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//输出到硬盘
public class FileOutputStream01 {
    public static void main(String[] args) {
        FileOutputStream fs =null;
        String adress="e:\\news2.txt";
        int length=0;
        try {
             fs =new FileOutputStream(adress);
             //追加到文件末尾
          //  fs =new FileOutputStream(adress,true);

            String hello="hello  world";
            // fs.write(hello.getBytes());
            //输入指定的长度
            fs.write(hello.getBytes(),0,3);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fs.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
