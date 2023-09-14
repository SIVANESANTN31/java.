import java.io.*;
import java.util.*;
class voting_eligibility{
    public static void main(String[] args){
        try{
            Scanner s = new Scanner(System.in);
            System.out.println("Enter your age : ")ing
            int age = s.nextInt();
            if(age<=0){
                System.out.println("Invalid Age.");
            }
            else if(age>=18){
                System.out.println("Eligible To Vote !");
            }
            else{
                age = 18 - age;
                System.out.println("Eligible To Vote After "+age+" Years.");
            }
        }
        catch(Exception e){
            System.out.println("You have given a wrong input, please recheck");
        }
    }
}
