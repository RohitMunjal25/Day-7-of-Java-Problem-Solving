import java.io.*;
import java.util.*;


public class ByteStreamToUpper{
    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream("file1.txt");
        FileOutputStream fos=new FileOutputStream("file2.txt");
        int c;
        while((c=fis.read())!=-1){
            if(Character.isLowerCase(c)){
                c=Character.toUpperCase(c);
            }
            fos.write(c);
        }
        System.out.println("file converted successfully");

    }
}