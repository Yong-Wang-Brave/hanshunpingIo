package day04;

import java.io.*;

//判断是否有文件加www ,没有就创建
//文件夹下是否有文件  有提示已经创建 ，没有就创建
public class HomeWork01 {
    public static void main(String[] args) throws IOException {
        String file1="e://www";
        File file =new File(file1);
        if (file.isDirectory()) {
            System.out.println("文件夹已经存在");
        }else{
            file.mkdir();
        }
        String file2="e://www//aa.txt";
        File file22 =new File(file2);
        if (file22.exists()) {
            OutputStreamWriter bf =new OutputStreamWriter(new FileOutputStream(file22));
            bf.write("我来了");
            bf.close();
        }else{
            file22.createNewFile();
            System.out.println("文件已经创建");
        }

    }
}
