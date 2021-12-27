package day04;

//ObjectInputStream 是序列化 读取到内存
//InputStreamReader 以指定字符集的方式读取到内存
import java.io.*;
import java.util.Properties;

//从properties中读取属性，并复制给实体类，然后把实体类，在序列化到文件,反序列化到内存
public class HomeWork031 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String adress2="C:\\Users\\king\\IdeaProjects\\hsplo\\src\\main\\java\\day04\\text2.dat";

ObjectInputStream oi  =new ObjectInputStream(new FileInputStream(adress2));
        System.out.println(((Person)oi.readObject()));
        oi.close();

    }
}
