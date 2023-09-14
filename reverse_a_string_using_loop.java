import java.io.*;
import java.util.*;

public class reverse_a_string_using_loop{
    public static void main(String[] args){
        String str1 = "";
        try{
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the string : ");
            str1 = s.nextLine();
            int temp = Integer.parseInt(str1);
            System.out.println("You have given a wrong input, please recheck");
        }
        catch(Exception e){
            int l = str1.length();
            for (int i=(l-1); i>=0; i--){
                System.out.print(str1.charAt(i));
            }
        }
    }
}
