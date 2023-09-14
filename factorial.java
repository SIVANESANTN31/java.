import java.io.*;
import java.util.*;

public class factorial{
    public static void main(String []args){
        try{
            Scanner s = new Scanner(System.in);
        int num;
        System.out.println("Enter the number : ");
        num = s.nextInt();
        int i;
        int temp = 1;
        if(num==0){
        System.out.println("0");}
        else{
            if(num>0){
        while(num!=0){
            temp = temp * num;
            num = num - 1;
        }}
        else{
            while(num!=0){
            temp = temp * num;
            num = num + 1;
        }
        }
        System.out.println("Factorial of the given number is : "+temp);
        }
        }
        catch(Exception e){
            System.out.println("Enter a valid number");
        }
    }
}