import java.util.Arrays;
import java.util.*;

public class alphasort{
	public static void main(String[] args) 
	{
        try{
        Scanner sc=new Scanner(System.in);
		int Size,choice;
		sc = new Scanner(System.in);
	 
		System.out.print(" Please Enter Number of elements in an array : ");
		Size = sc.nextInt();	
		
		String[] a = new String[Size];
		
		System.out.println(" Please Enter " + Size + " elements of an Array  : ");
        sc.nextLine();
		for (int i =1;i<=Size;i++)
		{
            System.out.println("Enter elements: ");
			a[i-1]= sc.nextLine();
           
          
		}
        
        System.out.println("Press 1:Ascending ");
        System.out.println("Press 2.Descending");
        System.out.println("Enter your choice");
        choice=sc.nextInt();
		
		Arrays.sort(a);
        
        switch(choice){
            case 1:

		System.out.println("Result of a Sorted Array in Ascending :  ");
		for (String str: a)
		{
			System.out.print(str+ "  ");
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