import java.io.*;
import java.util.*;

public class yeardaysweek{
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of days : ");
        int n = s.nextInt();
        int year, week, days;
        year = n/365;
        n = n - (year*365);
        int temp = year/4;
        if(year>3){
            n = n - temp;
        }
        week = n/7;
        n = n - (week*7);
        days = n;
        System.out.println("Number of years : "+year);
        System.out.println("Number of week : "+week);
        System.out.println("Number of days : "+days);
        }
    }


                
                
                
                    
                        
                
            
            
            
        