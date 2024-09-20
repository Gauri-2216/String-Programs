package string;

import java.util.Scanner;

public class removeDuplicateCharacterInStringApp {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.print("\nEnter the string");
		String str=s.nextLine();
		int i,j;
		String res="";
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
		System.out.println("String after remove duplicate charcter   "+res);
	}


}
