import java.io.*;
import java.util.*;

public class right_triangle_star_pattern{
    public static void main(String[] args){
        try{
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the no of rows : ");
            int n = s.nextInt();
            if(n<=0){
                System.out.println("Invalid value !");
            }
            else{
                for(int i=1; i<=n; i++){
                    for(int j=n; j>i; j--){
                        System.out.print(" ");
                    }
                    for(int k=0; k<i; k++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            }
        }
        catch(Exception e){
            System.out.println("You have given a wrong input, please recheck");
        }
    }
}
