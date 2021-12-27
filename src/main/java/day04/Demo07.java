package day04;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

//保存属性key -value到文件properties
public class Demo07 {
    public static void main(String[] args) throws IOException {
        String adress="C:\\Users\\king\\IdeaProjects\\hsplo\\src\\main\\java\\day04\\text.properties";

        Properties ps =new Properties();
        ps.setProperty("charset","gbk");
        ps.setProperty("name","你好");//保存的是中文的unicode编码
        //文件上方的评论
        ps.store(new FileWriter(adress),"文件上方的评论");


    }




}
