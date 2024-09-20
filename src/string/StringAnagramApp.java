package string;

import java.util.Scanner;

public class StringAnagramApp {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String str1=new String();
		String str2=new String();
		
		System.out.println("Enter the first string");
		str1=s.nextLine();
		System.out.println("Enter the Second string");
		str2=s.nextLine();
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		
		
		int i,j;
		sort(ch1);
		sort(ch2);
		camp(ch1,ch2);
		
		
		
		
		
	}
	
	
	public static void sort(char ch[])
	{
		int i,j;
		
		for(i=0;i<ch.length-1;i++)
		{
			for(j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
	}
	
	public static void camp(char ch[],char ch2[])
	{
		int i,j;
		boolean flag=false;
		for(i=0;i<ch.length;i++)
		{
			if(ch[i]!=ch2[i])
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("strign is not same");
		}
		else {
			System.out.println("string is same");
		}
	}

}
