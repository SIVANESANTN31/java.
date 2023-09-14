import java.io.*;
import java.util.*;

public class check_valid_username{
    public static void main(String[] args){
        try{
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the username : ");
            String str1 = s.nextLine();
            System.out.println("Re-enter the username : ");
            String str2 = s.nextLine();
            int len1 = str1.length();
            int len2 = str2.length();
            if(len1!=len2){
                System.out.println("Invalid Username !");
            }
            else{
                int temp = 0;
                for(int i=0; i<len1; i++){
                    if(str1.charAt(i)!=str2.charAt(i)){
                        temp = temp + 1;
                        break;
                    }
                }
                if(temp==0){
                    System.out.println("The username is valid !");
                }
                else{
                    System.out.println("The username is invalid !");
                }
            }
        }
        catch(Exception e){
            System.out.println("You have given a wrong input, please recheck");
        }
    }
}
