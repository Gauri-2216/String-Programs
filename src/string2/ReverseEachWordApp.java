package string2;
import java.util.*;
public class ReverseEachWordApp {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);

System.out.println("Enter the string");
String str=s.nextLine();

char ch[]=str.toCharArray();
reverseChar(ch,0,ch.length-1);


int start=0;

for(int i=0;i<ch.length;i++)
{
	if(i==ch.length||ch[i] ==' ')
	{
		reverseChar(ch,start,i-1);
		start=i+1;
	}
}
for(char c:ch)
{
	System.out.print(c);
}
	}
	
	
	
	
	public static void reverseChar(char ch[],int start,int end)
	{
	   while(start<end)
	   {
		   char temp=ch[start];
		   ch[start]=ch[end];
		   ch[end]=temp;
		   start++;
		   end--;
	   }
	}

}
