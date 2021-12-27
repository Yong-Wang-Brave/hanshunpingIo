package day04;

import java.io.*;

//以指定字符集的方式，写入到文件中
public class demo03 {
    public static void main(String[] args) {
        String adress="e:\\news2.txt";

        try {
            OutputStreamWriter ow =new OutputStreamWriter(new FileOutputStream(adress),"utf-8");
            ow.write("你就是个大刷币");
            ow.close();
        }  catch (IOException e) {
            e.printStackTrace();
        }

    }



}
