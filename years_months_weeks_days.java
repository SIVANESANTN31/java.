import java.io.*;
import java.util.*;

class years_months_weeks_days{

    static int days=0;
    static int leapcount=0;

    public static int noofyears(){
        int years=0, leapyears=0;
        while(days>=365){
            leapcount = leapcount + 1;
            if((leapcount%4)==0){
                days = days - 366;
                leapyears = leapyears + 1;
            }
            else{
                days = days - 365;
                years = years + 1;
            }
        }
        System.out.println("No of years : "+years);
        System.out.println("No of leapyears : "+leapyears);
        return 0;
    }

    public static int noofmonths(){
        int monthcount=0;
        int months=0;
        while(days>=28){
            monthcount = monthcount + 1;
            if((monthcount==2)&&(((leapcount+1)%4)==0)){
                days = days - 29;
                months = months + 1;
            }
            else if(monthcount==2){
                days = days - 28;
                months = months + 1;
            }
            else if((monthcount%2)==0){
                days = days - 30;
                months = months + 1;
            }
            else{
                days = days - 31;
                months = months + 1;
            }
        }
        System.out.println("No of remaining months : "+months);
        return 0;
    }

    public static int noofweeks(){
        int weeks=0;
        while(days>=7){
            weeks = weeks + 1;
            days = days - 7;
        }
        System.out.println("No of remaining weeks : "+weeks);
        return 0;
    }


    public static void main(String[] args){
        try{
            Scanner s = new Scanner(System.in);
            System.out.println("Enter no of days : ");
            days = s.nextInt();
            if()
            noofyears();
            noofmonths();
            noofweeks();
            System.out.println("No of remaining days : "+days);
        }
        catch(Exception e){
            System.out.println("You have given a wrong input, please recheck");
        }
    }
}
