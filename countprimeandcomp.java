import java.io.*;
import java.util.*;

public class countprimeandcomp{
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of values : ");
        int n = s.nextInt();
        int i,j,temp=0,prime=0,comp=0,temp1=0;
        for(i=1;i<=n;i++){
            temp1 = 0;
            temp = 0;
            System.out.println("Enter number "+i+" : ");
            temp = s.nextInt();
            if(temp==1){
                prime = prime - 1;
            }
            if(temp==2){
                prime = prime + 1;
            }
            else{
                for(j=2;j<temp;j++){
                    if((temp%j)==0){
                        temp1 = temp1 + 1;
                    }
                }
                if(temp1==0){
                    prime = prime + 1;
                }
                else{
                    comp = comp + 1;
                }
            }
        }
        System.out.println("Number of prime values : "+prime);
        System.out.println("Number of composite values : "+comp);
    }
}
                        
                