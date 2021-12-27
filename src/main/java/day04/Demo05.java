package day04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//读取properties文件 并输出属性
public class Demo05 {
    public static void main(String[] args) {
        String adress="C:\\Users\\king\\IdeaProjects\\hsplo\\src\\main\\java\\day04\\text.properties";
        BufferedReader br;
        String  s =null;

        {
            try {
                br = new BufferedReader(new FileReader(adress));

                while ((s = br.readLine())!=null){
                    String[] split = s.split("=");
                    System.out.println(split[0]+"="+split[1]);
                }
                br.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
