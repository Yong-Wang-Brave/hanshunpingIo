package day01;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class File01 {

   //new File（）的使用
    @Test
    public void createFile(){
        String filePath="e://news1.txt";
        File file =new File(filePath);
        try {
            //该句代码会把流文件从内存写入到硬盘
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //new File(parent,child)的使用
    @Test
    public void createFile2(){
        String parentFilePath="e://";
        String childFile="news2.txt";
        File file =new File(parentFilePath,childFile);
        try {
            //该句代码会把流文件从内存写入到硬盘
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
