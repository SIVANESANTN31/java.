import java.io.*;
import java.util.*;

class mthmaximum_and_nthminimum_in_an_array{
    public static void main(String[] args){
        try{
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number of values : ");
            int n = s.nextInt();
            int[] arr = new int[n];
            for(int i=1; i<=n; i++){
                System.out.println("Enter value "+i+" : ");
                arr[i-1] = s.nextInt();
            }
            Arrays.sort(arr);
            System.out.println("Enter the value of m : ");
            int mth = s.nextInt();
            System.out.println("Enter the value of n : ");
            int nth = s.nextInt();
            mth = n - mth;
            nth = nth - 1;
            System.out.println("Mth maximum number : "+(arr[mth]));
            System.out.println("Nth minimum number : "+(arr[nth]));
        }
        catch(Exception e){
            System.out.println("You have given a wrong input, please recheck");
        }
    }
}
