import java.io.*;
import java.util.*;
public class splchar {
	public static void main(String[] args)
	{
        Scanner in=new Scanner(System.in);
		int count = 0;
		String s;
        System.out.println("Enter a String:");
        s=in.nextLine();
		int temp=s.length();
		char arr[]=new char[temp];
		
		for (int i = 0; i < s.length(); i++) {
				if (!Character.isDigit(s.charAt(i))
				&& !Character.isLetter(s.charAt(i))
				&& !Character.isWhitespace(s.charAt(i))) {
					arr[i]=s.charAt(i);
				count++;
			
			}
			
			}
		

		if (count == 0)
			System.out.println(
				"No Special Characters found.");
		else
			System.out.println(
				"String has Special Characters\n" + count + " "
				+ "Special Characters found.");
				System.out.println("Special Characters are:");
				for(char c:arr){
					if(Character.isWhitespace(c)){
							continue;
					}else{
						System.out.println(c);
					}
	}}}
