import java.util.Scanner;
public class Pyramid{
   public static void main(String args[]){
    try{
      int i, j, my_input;
     
      Scanner my_scanner = new Scanner(System.in);
     
      System.out.print("Enter the number of rows : ");
      my_input = my_scanner.nextInt();
      System.out.println("The pyramid star pattern : ");
      for (i=0; i<my_input; i++){
         for (j=my_input-i; j>1; j--){
            System.out.print(" ");
         }
         for (j=0; j<=i; j++ ){
            System.out.print("* ");
         }
         System.out.println();
      }
       }catch(Exception e){
            System.out.println("You have given a wrong input, please recheck");
        }
   }
}