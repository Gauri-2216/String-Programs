package string2;
import java.util.*;
public class StringRemoveDuplicateCharApp {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int i,j;
		String res="";
		System.out.println("Enter the string");
		String str=s.nextLine();
		
		for(i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			for(j=0;j<str.length();j++)
			{
				char c=str.charAt(j);
				if(ch==c)
				{
					break;
				}
						
			}
			if(i==j)
			{
				res+=ch;
			}
		}
		System.out.println("String after removing duplicate character  "+res);
	}

}
