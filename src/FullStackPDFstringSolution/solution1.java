package FullStackPDFstringSolution;

import java.util.Scanner;

public class solution1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		   
		   System.out.println("Enter the string");
		   String str=s.nextLine();
		   
		   char ch[]=str.toCharArray();
		   int i,word=1;
		   for(i=0;i<ch.length;i++)
		   {
			   if(ch[i]==' '&&ch[i+1]!=' ')
			   {
				   word++;
			   }
		   }
		   System.out.println("Total number of words in string "+word);
	}

}
