package day04;


import day02.main;

import java.io.*;
import java.util.Properties;

//从properties中读取属性，并复制给实体类，然后把实体类，在序列化到文件,反序列化到内存
public class HomeWork03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String adress="C:\\Users\\king\\IdeaProjects\\hsplo\\src\\main\\java\\day04\\text.properties";
        String adress2="C:\\Users\\king\\IdeaProjects\\hsplo\\src\\main\\java\\day04\\text2.dat";
        Properties p =new Properties();
        //指定字符集的方式去读取
        p.load(new InputStreamReader(new FileInputStream(adress),"utf8"));

        String name=p.getProperty("name");
        String age=p.getProperty("age");
        String color=p.getProperty("color");
      Person p1 =new Person(name,age,color);
//ObjectOutputStream
        ObjectOutputStream o =new ObjectOutputStream(new FileOutputStream(adress2));
        o.writeObject(p1);
        o.close();
/*ObjectInputStream oi  =new ObjectInputStream(new FileInputStream(adress2));
        System.out.println(((Person)oi.readObject()).getColor());
        oi.close();*/

    }
}
