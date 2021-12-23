package day02;

/**
 * 对文件进行读取
 * 对文件进行读取
 * 对文件进行读取
 * 对文件进行读取
 * 对文件进行读取
 * 对字符串进行读取
 * 对字符串进行读取
 * 对字符串进行读取
 */
public class main {
    public static void main(String[] args) {
        BufferedReader_ bf =new BufferedReader_(new FileReader_());
   bf.readFiles(5);
      //  bf.readFile();
        BufferedReader_ bf1 =new BufferedReader_(new FileString_());
        bf1.readStrings(3);


    }
}
