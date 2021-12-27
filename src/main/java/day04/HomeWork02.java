package day04;

import day02.main;

import java.io.*;
//读取文件 加 行号  并指定字符集输出
public class HomeWork02 {
    public static void main(String[] args) throws IOException {
        String adress="C:\\Users\\king\\IdeaProjects\\hsplo\\src\\main\\java\\day04\\text.properties";
     BufferedReader br =new BufferedReader(new InputStreamReader(new FileInputStream(adress),"utf8"));
       int line=0;
       String content;
        while ((content=br.readLine() )!= null) {
            System.out.println(line++ +"      "+content);
        }
        br.close();

    }




}
