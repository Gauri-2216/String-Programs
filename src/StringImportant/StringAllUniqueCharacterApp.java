package StringImportant;

import java.util.Scanner;

public class StringAllUniqueCharacterApp {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);

System.out.println("Enter any string");
String str=s.nextLine();
char ch[]=str.toCharArray();
int count=0,c=0;
for(int i=0;i<ch.length;i++)
{
	count=0;
	for(int j=0;j<ch.length;j++)
	{
		if(ch[i]==ch[j])
		{
			count++;
		}
	}
	if(count==1)
	{
		System.out.print(ch[i]+"\t");
		c++;
	}
}
System.out.println("\nTotal Number of unique Character in string  "+c);
	}

}
