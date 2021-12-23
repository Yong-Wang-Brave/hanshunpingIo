package day01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//从磁盘的一个文件输出到磁盘的另一个文件
public class FileOutputStream02 {

    public static void main(String[] args) {
        String readFile ="e:\\1.mp3";
        String goalFile ="e:\\news22.mp3";
        int len=0;
        byte[] bt =new byte[1024];
        FileInputStream fs=null;
        FileOutputStream fo =null;
        try {
            fs =new FileInputStream(readFile);
            fo =new FileOutputStream(goalFile);
            while ((len=fs.read(bt)) != -1) {

                fo.write(bt,0,len);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if ((fs!=null)) {
                    fs.close();
                }
                if ((fo!=null)) {
                    fo.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
