import java.io.*;
import java.util.*;

public class reversenum{
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        String str = s.nextLine();
        int i;
        int l = str.length();
        for(i=(l-1);i>=0;i--){
                System.out.print(str.charAt(i));
            }
        }
    }
           
            