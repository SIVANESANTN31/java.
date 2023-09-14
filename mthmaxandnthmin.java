import java.io.*;
import java.util.*;

public class mthmaxandnthmin{
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int arr[] = new int[]{14,16,87,36,25,89,34};
        int m,n,sum,diff,i,j,max,min;
        int l = arr.length;
        Arrays.sort(arr);
        System.out.println("Enter the value of m : ");
        m = s.nextInt();
        System.out.println("Enter the value of n : ");
        n = s.nextInt();
        max = arr[l-m];
        min = arr[n-1];
        sum = max + min;
        diff = max - min;
        System.out.println(m+"th maximum number is : "+max);
        System.out.println(n+"th maximum number is : "+min);
        System.out.println("Sum of the two numbers is : "+sum);
        System.out.println("Difference between the two numbers is : "+diff);
    }
}