import java.io.*;
import java.util.*;

public class pattern1{
    public static void main(String []args){
        int i,j,n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        n = s.nextInt();
        for(i=1;i<=n;i++){
            for(j=0;j<i;j++){
                System.out.print(j+1);
            }
            System.out.println("");
        }
    }
}