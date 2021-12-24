package day03;

import java.io.*;

//序列化 就是输出到硬盘  反序列化就是输入到内存
public class ObjectOutputStream01 {
    public static void main(String[] args) throws IOException {
        //序列化后不是存文件 而是按照他的格式来保存
        String srcAdress="e:\\news2.dat";
        ObjectOutputStream oi = null;
        int len=0;


            oi = new ObjectOutputStream(new FileOutputStream(srcAdress));
           oi.writeInt(100);//int ->Integer 实现了serializable
            oi.writeBoolean(true);//boolean 到Boolean
            oi.writeChar('c');//char 到Character
           oi.writeDouble(9.5f);//double -Double
            oi.writeUTF("aa");//都实现了serializable
            oi.writeObject(new Dog("旺财",10));
            oi.close();



}}

