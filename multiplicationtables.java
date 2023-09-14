import java.io.*;
import java.util.*;

public class multiplicationtables{
    public static void main(String []args){
        try{
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number : ");
            int n = s.nextInt();
            int temp = 1;
            int i;
            for(i=1;i<=10;i++){
                temp = n * i;
                System.out.println(+n+" * "+i+" = "+temp);
            }
        }
        catch(Exception e){
        }
    }
}
