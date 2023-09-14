import java.util.Arrays;
import java.util.*;

public class arraysort{
	public static void main(String[] args) 
	{
        try{
        Scanner sc=new Scanner(System.in);
		int Size, i,choice;
		sc = new Scanner(System.in);
	 
		System.out.print(" Please Enter Number of elements in an array : ");
		Size = sc.nextInt();	
		
		int [] a = new int[Size];
		
		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}
        System.out.println("Press 1:Ascending ");
        System.out.println("Press 2.Descending");
        System.out.println("Enter your choice");
        choice=sc.nextInt();
		
		Arrays.sort(a);
        
        switch(choice){
            case 1:

		System.out.println("Result of a Sorted Array in Ascending :  ");
		for (int Number: a)
		{
			System.out.print(Number + "  ");
		}
        break;
        case 2:
        System.out.println("Result of a Sorted Array in Descending:  ");
        for (int k=Size-1;k>=0;k--){
            System.out.print(a[k]+ "  ");
        }
        break;
        default:
        System.out.println("Invalid Choice ");

        }
        }catch(Exception e){
            System.out.println("You have given a wrong input, please recheck");
        }
	}
}