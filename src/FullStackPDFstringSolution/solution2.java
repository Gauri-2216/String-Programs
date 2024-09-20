package FullStackPDFstringSolution;

import java.util.Scanner;

public class solution2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		   
		   System.out.println("Enter the string");
		   String str=s.nextLine();
		   
		   char ch[]=str.toCharArray();
		   int start=0,end=ch.length-1;
		   while(start<end)
		   {
			   char temp=ch[start];
			   ch[start]=ch[end];
			   ch[end]=temp;
			   start++;
			   end--;
		   }
		   System.out.println("String after reversing  ");
		   for(int i=0;i<ch.length;i++)
		   {
			   System.out.print(ch[i]);
		   }
	}

}
