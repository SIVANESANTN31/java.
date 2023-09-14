import java.io.*;
import java.util.*;

public class pattern3{
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of rows : ");
        n = s.nextInt();
        int i,j,m=n;
        for(i=1;i<=n;i++){
            for(j=0;j<m;j++){
                System.out.print(" ");
            }
            m = m - 1;
            for(j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}