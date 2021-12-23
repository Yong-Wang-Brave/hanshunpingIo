package day01;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {



    public static void main(String[] args) {
        String adress="e:\\news2.txt";
          char[] cha ={'c','s'};
        FileWriter fw =null;
        try {
            fw=new FileWriter(adress);

            fw.write("你好123");
            fw.write('A');
            fw.write(cha);
            fw.write(cha,0,1);
            fw.write("王勇你好",0,2);
            fw.write("王勇你好".toCharArray(),0,2);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if ((fw!=null)) {
                try {
                    //关闭文件流 等价于关闭+flush
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }



        }


    }





}
