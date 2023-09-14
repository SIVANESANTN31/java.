import java.io.*;
import java.util.*;

public class simpleinterest 
     {  
       public static void main (String args[])  
        {   float p, r, t, si; 
                  Scanner s = new Scanner(System.in);
                  System.out.println("Enter the principal amount : ");
                  p = s.nextFloat();
                  System.out.println("Enter the rate of interest : ");
                  r = s.nextFloat();
                  System.out.println("Enter ttime period : ");
                  t = s.nextFloat();
                  si  = (p*r*t)/100;   
                  System.out.println("Simple Interest is: " +si);  
        }
}