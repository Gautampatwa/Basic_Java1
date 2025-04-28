package StringExample;

import java.util.Scanner;

public class CaptitaltoSmallAndSmallToCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        StringBuilder s = new StringBuilder(sc.nextLine());
        for (int i = 0; i < s.length(); i++) {
            boolean flag = true;//Capital Character
            char ch = s.charAt(i);
            if (s.charAt(i) == ' ')
                continue;
            int ascii = (int) ch;
            if (ascii >= 97) {
                flag = false;
            }
            if (flag == true) {
                ascii += 32;
                char dh = (char) ascii;
                s.setCharAt(i, dh);
            } else {
                ascii -= 32;
                char dh = (char) ascii;
                s.setCharAt(i, dh);
            }
        }
        System.out.println(s);
        System.out.println("======================Converting again to upper case lower case============================");
        for(int i=0;i<s.length();i++)
        {
            boolean flag=true;
            char c=s.charAt(i);
            if(s.charAt(i)==' ')
            {
                continue;
            }
            int v=(int) c;
            if(v>=97)
            {
                flag=false;
            }
            if(flag==true)
            {
                v+=32;
                char v1=(char)v;
                s.setCharAt(i,v1);
            }
            else {
                v-=32;
                char v1=(char)v;
                s.setCharAt(i,v1);
            }
        }
        System.out.println(s);
    }
}
