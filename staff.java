import java.io.*;
import java.util.*;

public class staff{
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the total number of users : ");
        int tot = s.nextInt();
        if(tot<=0){
            System.out.println("Invalid number of users");
        }else{
        System.out.println("Enter the number of staff users : ");
        int staff = s.nextInt();
        if(staff>=tot){
            System.out.println("Invalid number of users");}
            else{
        int nonstaff = staff/3;
        int student = tot - staff - nonstaff;
        System.out.println("Number of student users : "+student);}}
    }
}