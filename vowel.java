import java.io.*;
import java.util.*;

public class vowel{
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = s.nextLine();
        int l = str.length();
        int i,j,temp = 0;
        char c[] = new char[100];
        for(i=0;i<l;i++){
            if((str.charAt(i)!='a')&&(str.charAt(i)!='e')&&(str.charAt(i)!='i')&&(str.charAt(i)!='o')&&(str.charAt(i)!='u')){
                if((str.charAt(i)!='A')&&(str.charAt(i)!='E')&&(str.charAt(i)!='I')&&(str.charAt(i)!='O')&&(str.charAt(i)!='U')){
                    c[temp]=str.charAt(i);
                }
            }
            temp = temp + 1;
        }
        for(j=0;j<100;j++){
            System.out.print(c[j]);
        }
    }
}
                