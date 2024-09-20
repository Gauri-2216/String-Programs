package StringImportant;
import java.util.*;
public class FirstUniqueCharacterApp {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.nextLine();
		int index=-1,count=0,flag=0,i,j;
		char ch[]=str.toCharArray();
		String str2=new String();
		char ch2[]=str2.toCharArray();
		for(i=0;i<ch.length;i++)
		{
			count=0;
			for(j=0;j<ch.length-1;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				ch2[i]=ch[i];
				index=i;
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("No first");
		}else {
			System.out.println("First unique  "+ch2[i]+" found at index   "+index);
		}
	}

}
