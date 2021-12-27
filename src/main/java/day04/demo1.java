package day04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//读取文件到内存
public class demo1 {
    public static void main(String[] args) {
        String adress="e:\\news2.txt";
        BufferedReader br;
        String  s =null;

        {
            try {
                br = new BufferedReader(new FileReader(adress));

                while ((s = br.readLine())!=null){
                    System.out.println(s);
                }
                       br.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
