import java.io.*;
import java.util.*;

public class maxofthreeintegers{
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int temp,max=0,i;
        System.out.println("Enter three integers : ");
        for(i=1;i<=3;i++){
            temp = s.nextInt();
            if(temp>=max){
                max = temp;
            }
        }
        System.out.println("Maximum of the three given numbers is : "+max);
    }
}