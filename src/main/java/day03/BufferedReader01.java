package day03;

import java.io.*;

public class BufferedReader01 {
    public static void main(String[] args) {
        String adress="e:\\news2.txt";

        BufferedReader  bf;
        String line="";
        {
            try {
                bf = new BufferedReader(new FileReader(adress));

                while ((line=bf.readLine()) != null) {
                    System.out.println(line);
                }

bf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



}
