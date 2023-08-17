package Notepad;

import java.io.FileInputStream;
import java.io.IOException;

public class OpenNotepad {
    public static void main(String[] args) throws IOException {
        Runtime rs=Runtime.getRuntime();
        try{
            rs.exec("notepad");
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("=================================================================");
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\hello.txt");
            int i = fileInputStream.read();
            System.out.println((char) i);
            fileInputStream.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
