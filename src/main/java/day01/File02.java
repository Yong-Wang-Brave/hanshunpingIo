package day01;


import java.io.File;

//常见文件操作  getName getAbsolutePath getParent length  exists isFile isDirectory
public class File02 {
    public static void main(String[] args) {
        File file =new File("e://news1.txt");

        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParent());
        System.out.println(file.length());//utf8 汉字占用3个字节 英文一个字节
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
/*        news1.txt
        e:\news1.txt
        e:\
        0
        true
        true
        false*/
    }
}
