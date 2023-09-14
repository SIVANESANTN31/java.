import java.io.*;
import java.util.*;

public class palinromenum{
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        String str = s.nextLine();
        String str1 = "";
        int i,temp = 0;
        int l = str.length();
        for(i=(l-1);i>=0;i--){
                str1 = str1 + str.charAt(i);
            }
        for(i=0;i<l;i++){
            if(str.charAt(i)!=str1.charAt(i)){
                temp = temp + 1;
            }
        }
        if(temp==0){
            System.out.println("Given number is a palindrome");
        }else{
            System.out.println("Given number is not a palindrome");
        }
    }
}
            