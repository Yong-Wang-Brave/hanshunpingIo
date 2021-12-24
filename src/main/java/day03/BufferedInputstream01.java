package day03;

import java.io.*;

public class BufferedInputstream01 {
    public static void main(String[] args) {
        String srcAdress="e:\\1.mp3";
        String destAddress =   "e:\\22.mp3";
        BufferedInputStream bi =null;
        BufferedOutputStream bo =null;
        int biInt=0;
        byte[] b =new byte[1024];


            try {
                bi =new BufferedInputStream(new FileInputStream(srcAdress));
                bo=new BufferedOutputStream(new FileOutputStream(destAddress));
                while((biInt = bi.read(b)) != -1){

                    bo.write(b,0,biInt);
                };
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    if (bi!=null) {
                        bi.close();
                    }
                    if(bo!=null){
                        bo.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }




    }



}
