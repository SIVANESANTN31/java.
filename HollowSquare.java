import java.util.Scanner;

public class HollowSquare{
	private static Scanner sc;
	
	public static void main(String[] args) {
        try{
		sc = new Scanner(System.in);
		
		System.out.print("Enter Hollow Square Side = ");
		int side = sc.nextInt();
		
		System.out.println("Printing Hollow Square Star Pattern");
		
		for (int i = 0; i < side; i++ ) 
		{
			for (int j = 0 ; j < side; j++ ) 
			{
				if (i == 0 || i == side - 1 || j == 0 || j == side - 1) 
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}}
        catch(Exception e){
            System.out.println("You have given a wrong input, please recheck");
        }
	}
}