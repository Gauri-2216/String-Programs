package FullStackPDFstringSolution;

import java.util.Scanner;

public class solution3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		   String str=s.nextLine();
		   
		   char ch[]=str.toCharArray();
		   int i,len = 0;
		   boolean flag=false;
		   len=ch.length;
		   for(i=0;i<len;i++)
		   {
			   if(ch[i]!=ch[len-i-1])
			   {
				   flag=true;
				   break;
			   }
		   }
		   if(flag==true)
		   {
			   System.out.println("String is not palindrome");
		   }else {
			   System.out.println("String is palindrome");
		   }
	}

}
