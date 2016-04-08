
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * Created by Archer on 2016/4/8.
 */
public class WriteByteStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream=new FileOutputStream("textw.txt");

            String outString="write 123456 写出数据";
            byte outPut[]=outString.getBytes("UTF-8");

            //写入
          fileOutputStream.write(outPut);
        fileOutputStream.close();



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
