package day01;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader01 {




    public static void main(String[] args) {
        String adress="e:\\news2.txt";
        FileReader fr = null;
        int len=0;
        char[]  ca = new char[8];


          try {
            fr =new FileReader(adress);

        /*    while ((len=fr.read() )!= -1) {
                //读取的是单个字符，所以char可以输出来
                System.out.println((char)len);
            }*/
              while ((len=fr.read(ca) )!= -1) {
                //只会显示读取到的char数组的长度，说的是每次读取8个，但是只剩3个就会只读取3个。
                System.out.println(new String(ca,0,len));
            }



        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fr!=null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }



}
