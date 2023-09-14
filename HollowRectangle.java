import java.util.Scanner;

public class HollowRectangle{
	private static Scanner sc;
	
	public static void main(String[] args) {
        try{
		sc = new Scanner(System.in);
		
		System.out.print("Enter Hollow Rectangle Rows  = ");
		int rows = sc.nextInt();
        System.out.print("Enter Hollow Rectangle Columns = ");
		int columns = sc.nextInt();
		
		System.out.println("Printing Hollow Rectangle Star Pattern");
		
		for (int i = 0; i < rows; i++ ) 
		{
			for (int j = 0 ; j < columns; j++ ) 
			{
				if (i == 0 || i == rows - 1 || j == 0 || j == columns - 1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
    catch(Exception e){
            System.out.println("You have given a wrong input, please recheck");
        }
    }
}