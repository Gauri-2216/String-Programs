

package StringFinal;

import java.util.Scanner;

public class FirstRepeatedApp {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any string");
		String str=s.nextLine();
		char ch[]=str.toCharArray();
		int i,j,len;
		boolean flag=false;
		char FirstRepeated = 0;
		len=ch.length;
		
		for(i=0;i<len;i++)
		{
			for(j=i+1;j<len;j++)
			{
				if(ch[i]==ch[j])
				{
					FirstRepeated=ch[i];
					flag=true;
					break;
				}
			}
			if(flag==true)
			{
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("First repeated char in string  "+str+"  ----> "+FirstRepeated);
		}else {
			System.out.println("No repeated char has been found");
		}
	}

}
