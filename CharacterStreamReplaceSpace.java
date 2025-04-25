import java.io.*;
public class CharacterStreamReplaceSpace {
    public static void main(String[] args) throws Exception{
        FileReader fr=new FileReader("file1.txt");
        FileWriter fw= new FileWriter("file3.txt");
        int ch;
        while((ch=fr.read())!=-1){
            if(ch==' '){
                fw.write('-');

            }
            else{
                fw.write(ch);
            }
            fw.flush();

        }
        System.out.println("removed space successfully");
        
    }
}
