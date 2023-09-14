import java.io.*;
import java.util.*;
import java.math.*;

public class prime{
    public static void main(String[] args){
        try{
            Scanner s = new Scanner(System.in);
            int a,b,f;
            System.out.println("Enter the value of a : ");
            a = s.nextInt();
            System.out.println("Enter the value of b : ");
            b = s.nextInt();
            if(a<=0||b<=0||b<=a){
                System.out.println("Invalid ,Check Given Inputs");
            }else{
                System.out.println("Prime number between "+a+" and "+b+" is:");
            for(int i=a;i<=b;i++){
                if(i==1){
                    System.out.println("1 is neither prime or composite number");

                }else{
                f=0;
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        f++;
                    }
                    
                }
                if(f==0){
                        System.out.println(i);
                    }
                
            }
            }

            }

            
            
            
        }catch(Exception e){
            System.out.println("Invalid Input Recheck the inputs");
        }
    }}