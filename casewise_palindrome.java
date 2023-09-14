import java.io.*;
import java.util.*;

public class casewise_palindrome{
    public static void main(String[] args){
        try{
            Scanner s = new Scanner(System.in);
            System.out.println("Enter 1 for string palindrome.");
            System.out.println("Enter 2 for number palindrome.");
            System.out.println("Enter your choice : ");
            int ch = s.nextInt();
            s.nextLine();
            int temp = 0;
            switch(ch){
                case 1 : System.out.println("Enter the string : ");
                         String str = s.nextLine();
                         int len = str.length();
                         for(int i=0; i<len; i++){
                            if(str.charAt(i)!=str.charAt(len-1-i)){
                                temp = temp + 1;
                            }
                         }
                         if(temp==0){
                            System.out.println("Given string is a palindrome");
                         }
                         else{
                            System.out.println("Given string is not a palindrome");
                         }
                         break;
                case 2 : System.out.println("Enter the number : ");
                         String str2 = s.nextLine();
                         int len2 = str2.length();
                         for(int j=0; j<len2; j++){
                            if(str2.charAt(j)!=str2.charAt(len2-1-j)){
                                temp = temp + 1;
                            }
                         }
                         if(temp==0){
                            System.out.println("Given number is a palindrome");
                         }
                         else{
                            System.out.println("Given number is not a palindrome");
                         }
                         break;
                default : System.out.println("You have given a wrong input, please recheck");
                          break;
            }
        }
        catch(Exception e){
            System.out.println("You have given a wrong input, please recheck");
        }
    }
}
