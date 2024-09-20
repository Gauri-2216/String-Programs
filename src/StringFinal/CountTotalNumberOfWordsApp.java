package StringFinal;
import java.util.*;
public class CountTotalNumberOfWordsApp {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter any string 1:");
		String str=s.nextLine();
		System.out.println("Enter any string 2:");
		String str2=s.nextLine();
		
		char ch[]=str.toCharArray();
		char ch1[]=str2.toCharArray();
		int word=1;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' '&&ch[i+1]!=' ') {
				word++;
			}
		}
		System.out.println("Total number of words "+word);
	}

}
