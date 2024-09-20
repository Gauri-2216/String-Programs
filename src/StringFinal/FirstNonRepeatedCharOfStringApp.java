package StringFinal;

import java.util.Scanner;

public class FirstNonRepeatedCharOfStringApp {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any string");
		String str=s.nextLine();
		char ch[]=str.toCharArray();
		
		int i,j,count=0;
		boolean flag=false;
		char FirstNoRepeted = 0;
		int len=ch.length;
		for(i=0;i<len;i++)
		{
			count=0;
			for(j=0;j<len;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				FirstNoRepeted=ch[i];
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("first non repeated char "+str+" is--->"+FirstNoRepeted);
		}else {
			System.out.println("All char are repeated in string ");
		}
	}

}
