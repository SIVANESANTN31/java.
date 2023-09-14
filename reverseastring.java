import java.io.*;
import java.util.*;

public class reverseastring{
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = s.nextLine();
        int l = str.length();
        int i;
        for(i=(l-1);i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}