import java.io.*;
import java.util.*;

public class valid{
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string 1 : ");
        String s1 = s.nextLine();
        System.out.println("Enter string 2 : ");
        String s2 = s.nextLine();
        int i,temp=0;
        int l = s1.length();
        for(i=0;i<l;i++){
        if(s1.charAt(i)==s2.charAt(i)){
           continue;
        }else{
            temp = temp + 1;
        }}
        if(temp==0){
            System.out.println("The username is valid");}
            else{
                System.out.println("The username is not valid");
            }
    }
}