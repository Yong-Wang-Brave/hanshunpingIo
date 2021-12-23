package day02;

/**
 * 做成处理流   包装流  装饰者模式是为了增强功能 ，代理模式是为了加以控制
 */
public class BufferedReader_ extends Reader_{

    private Reader_ reader_;//属性是Reader类型

    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }

    //让方法更加灵活，多次读取文件
  public   void readFiles(int num){
      for (int i = 0; i <num; i++) {
          reader_.readFile();
      }
    }

    //扩展 readString ,批量处理字符串数据

    public void readStrings(int  num){
        for(int i=0;i<num;i++){

            reader_.readString();
        }
    }




}
