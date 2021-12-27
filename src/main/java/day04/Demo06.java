package day04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Demo06 {
    public static void main(String[] args) throws IOException {
        String adress="C:\\Users\\king\\IdeaProjects\\hsplo\\src\\main\\java\\day04\\text.properties";
        Properties pt =new Properties();
        pt.load(new FileReader(adress));
        //k-v展示在控制台
       pt.list(System.out);
        String xingming = pt.getProperty("xingming");
        String age =pt.getProperty("age");
        System.out.println(xingming+age
        );

    }

}
