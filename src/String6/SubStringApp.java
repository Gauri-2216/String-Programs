package String6;

import java.util.Scanner;

public class SubStringApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.println("Enter the main string");
        String str = s.nextLine();
        System.out.println("Enter the sub string");
        String str2 = s.nextLine();
        boolean flag=false;
        
        int a=str.length();
        int b=str2.length();
        
        for(int i=0;i<=a-b;i++)
        {
        	int j;
        	for(j=0;j<b;j++)
        	{
        		if(str.charAt(i+j)!=str2.charAt(j))
        		{
        			break;
        		}
        	}
        	if(j==b)
        	{
                System.out.println("The substring is present between index " + i + " and index " + (i + b - 1));
        		flag=true;
        	}
        }
        if(flag==false)
        {
        	System.out.println("Sub string not present");
        }
	}

}
