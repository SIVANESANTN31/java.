import java.io.*;
import java.util.*;

public class atm_denomination{
    public static void main(String[] args){
        try{
            Scanner s = new Scanner(System.in);
            System.out.println("Enter 1st Denomination : ");
            int d1 = s.nextInt();
            if((d1!=2000)&&(d1!=500)&&(d1!=200)&&(d1!=100)){
                System.out.println("Invalid Denomination !");
            }
            else{
                System.out.println("Enter No Of Notes For "+d1+" : ");
                int n1 = s.nextInt();
                System.out.println("Enter 2nd Denomination : ");
                int d2 = s.nextInt();
                if((d2!=2000)&&(d2!=500)&&(d2!=200)&&(d2!=100)){
                    System.out.println("Invalid Denomination !");
                }
                else{
                    System.out.println("Enter No Of Notes For "+d2+" : ");
                    int n2 = s.nextInt();
                    System.out.println("Enter 3rd Denomination : ");
                    int d3 = s.nextInt();
                    if((d3!=2000)&&(d3!=500)&&(d3!=200)&&(d3!=100)){
                        System.out.println("Invalid Denomination !");
                    }
                    else{
                        System.out.println("Enter No Of Notes For "+d3+" : ");
                        int n3 = s.nextInt();
                        System.out.println("Enter 4th Denomination : ");
                        int d4 = s.nextInt();
                        if((d2!=2000)&&(d2!=500)&&(d2!=200)&&(d2!=100)){
                            System.out.println("Invalid Denomination !");
                        }
                        else{
                            System.out.println("Enter No Of Notes For "+d4+" : ");
                            int n4 = s.nextInt();
                            double total = (d1*n1)+(d2*n2)+(d3*n3)+(d4*n4);
                            System.out.println("Total Amount Balance In ATM Is : "+total);
                        }
                    }
                }
            }
        }
        catch(Exception e){
            System.out.println("You have given a wrong input, please recheck");
        }
    }
}
