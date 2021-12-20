package day01;

import org.junit.Test;

import java.io.File;

//常见的文件操作
public class File03 {
//mkdir创建一级目录  mkdirs创建多级目录 delete 删除空文件夹或者文件
    //判断e://news1.txt是否存在，如果存在就删除
    @Test
    public void isExists(){
        String File="e://news1.txt";
        File file =new File(File);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("文件已删除");
            }else{
                System.out.println("文件删除失败");
            }
        }else{
            System.out.println("文件不存在");
        }
    }

    //判断多级目录是否存在，存在就提示存在  不存在就提示删除
    @Test
    public void isExistsFiles(){
        String File="e://aaa//bbb//cc";
        File file =new File(File);
        if (file.exists()) {
                System.out.println("文件存在");
        }else{
            if (file.mkdirs()) {
                System.out.println("文件创建成功");
            }else{
                System.out.println("文件创建失败");

            }
        }
    }

}
