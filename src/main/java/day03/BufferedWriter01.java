package day03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter01 {

    public static void main(String[] args) {
        String adress="e:\\news2.txt";
        try {
            BufferedWriter bw =new BufferedWriter(new FileWriter(adress,true));
             bw.write("nihao");
             bw.newLine();//换行
             bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}
