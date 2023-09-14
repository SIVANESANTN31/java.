import java.io.*;
import java.util.*;

public class lcmgcd{
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int lcm=1, gcd=0, n, i, j;
        System.out.println("Enter the number of values : ");
        n = s.nextInt();
        int arr[] = new int[n];
        int temp = 0;
        for(i=0;i<n;i++){
            System.out.println("Enter number "+(i+1)+" : ");
            arr[i] = s.nextInt();
        }
        for(i=1;i<=arr[0];i++){
            temp = 0;
            for(j=0;j<n;j++){
                if((arr[j]%i)!=0){
                    temp = temp + 1;
                }
            }
            if(temp==0){
                if(gcd<i){
                    gcd = i;
                }
            }
        }
        for(i=0;i<n;i++){
            lcm = lcm*(arr[i]);
        }
        lcm = lcm / gcd;
        System.out.println("LCM of the given numbers : "+lcm);    
        System.out.println("GCD of the given numbers : "+gcd);
    }
}
    