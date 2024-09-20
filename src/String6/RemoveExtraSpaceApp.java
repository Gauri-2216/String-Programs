package String6;
import java.util.*;
public class RemoveExtraSpaceApp {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.nextLine();
		char ch[]=str.toCharArray();
		int i,j,len;
		len=ch.length;
		for(i=0;i<ch.length;i++)
		{
			if(ch[i]==' '&&ch[i+1]==' ')
			{
				for(j=i;j<ch.length-1;j++)
				{
					ch[j]=ch[j+1];
				}
				i--;
			}
		}
		System.out.println("String after removing extra space");
		for(i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
	}

}
