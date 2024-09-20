package string;
import java.util.*;
public class PalindromeStringApp {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);

System.out.println("Enter the string");
String str=s.nextLine();
char ch[]=str.toCharArray();
int len=ch.length,flag=0;

for(int i=0;i<ch.length;i++)
{
	if(ch[i]!=ch[len-i-1])
	{
		flag=1;
		break;
	}
}

if(flag==1)
{
	System.out.println("String is not palindrome");
}else {
	System.out.println("String is palindrome");
}
	}

}
