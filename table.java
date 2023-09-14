import java.io.*;
import java.util.*;

public class table{
    public static void main(String[] args){
        try{
            int m,
            n;
            Scanner s = new Scanner(System.in);
            System.out.print("M:");
            m=s.nextInt();
            System.out.print("N:");
            n=s.nextInt();
            if(m<=0||n<=0){
                System.out.print("Invalid Check The Given Inputs");
            }else{
            for(int i=1;i<=n;i++){
                System.out.println(i+"*"+m+"="+i*m);
            }}

        }
        catch(Exception e){
            System.out.println("You have given a wrong input, please recheck");
        }
    }
}
