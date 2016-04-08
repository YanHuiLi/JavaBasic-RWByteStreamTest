import java.io.FileInputStream;

import java.io.IOException;

/**
 * 一个汉字两个字节
 *
 * Created by Archer on 2016/4/8.
 */
public class ReadByteStream {
    public static void main(String[] args) {

        //相对路径之下
        try {
            FileInputStream fileInputStream=new FileInputStream("test.txt");

            //创建数组
            byte input []=new byte[21];
            fileInputStream.read(input);


            String inputString=new String(input,"UTF-8");
            System.out.println(inputString);
            fileInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
