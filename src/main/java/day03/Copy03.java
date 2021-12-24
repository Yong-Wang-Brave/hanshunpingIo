package day03;

import java.io.*;
//一个文件拷贝到另一个文件;BufferedReader与BufferedWriter是安装字符操作，不要去操作二进制文件，
// 可能造成文件损坏
public class Copy03 {
    public static void main(String[] args) {
        String srcAdress="e:\\news2.txt";
        String destAddress =   "e:\\news22.txt";

        BufferedReader br =null;
        String brContent;
        BufferedWriter bw =null;
        {
            try {
                br = new BufferedReader(new FileReader(srcAdress));
                bw = new BufferedWriter(new FileWriter(destAddress));
               //升级为处理流之后可以一次读取一行
                while (((brContent=br.readLine()) != null)) {
                    bw.write(brContent);
                    //读取一行就换一行
                    bw.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    //关闭流。不分先后顺序
                    if (br!=null) {
                        br.close();
                    }
                    if (bw!=null) {
                        bw.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }



}
