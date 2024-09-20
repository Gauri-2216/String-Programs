package StringFinal;
import java.util.*;
class countWordsVowelConsonentsApp {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter any string");
String str=s.nextLine();
int v=0,w=1,c=0;

char ch[]=str.toCharArray();
for(int i=0;i<ch.length-1;i++)
{
	if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U') {
		v++;
	}else if(ch[i]==' '&&ch[i+1]!=' ')
	{
		w++;
	}else {
		c++;
	}
}
System.out.println("vowel "+v);
System.out.println("consonet "+c);
System.out.println("total words "+w);
	}

}
