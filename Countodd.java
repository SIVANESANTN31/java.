
import java.util.Scanner;

public class Countodd{
	private static Scanner sc;
	public static void main(String[] args) 
	{
        try{
		int Size, i = 0, j = 0, evenCount = 0;
		sc = new Scanner(System.in);
	 
		System.out.print(" Please Enter Number of elements in an array : ");
		Size = sc.nextInt();	
		
		int [] a = new int[Size];
		
		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		while (i < Size)
		{
			a[i] = sc.nextInt();
			i++;
		}   
		System.out.print("\n List of Even Numbers in this Array are :");
		while(j < Size)
		{
			if(a[j] % 2 != 0)
			{
				System.out.print(a[j] +" ");
				evenCount++;
			}
			j++;
		}		
		System.out.println("\n Total Number of Even Numbers in this Array = " + evenCount);
	}
catch(Exception e){
            System.out.println("Invalid Input Recheck the inputs");
        }
    
    }
}