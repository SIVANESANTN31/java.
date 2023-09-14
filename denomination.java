import java.util.*;
public class denomination{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the 1st denomination: 2000");
        System.out.println("Enter the number of notes: ");
        int n1= s.nextInt();
        System.out.println("Enter the 2st denomination: 500");
        System.out.println("Enter the number of notes: ");
        int n2= s.nextInt();
        System.out.println("Enter the 3st denomination: 200");
        System.out.println("Enter the number of notes: ");
        int n3= s.nextInt();
        System.out.println("Enter the 4st denomination: 100");
        System.out.println("Enter the number of notes: ");
        int n4= s.nextInt();
        
        int tot = (n1*2000)+(n2*500)+(n3*200)+(n4*100);
        System.out.println("Total amount = "+tot);
    }
}