import java.io.*;
import java.util.*;

public class squareandcubeofdecimal{
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the decimal value : ");
        float n = s.nextFloat();
        float square = n*n;
        float cube = n*n*n;
        System.out.println("Square of "+n+" is : "+square);
        System.out.println("Cube of "+n+" is : "+cube);
    }
}