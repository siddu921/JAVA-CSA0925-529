import java.util.*;
class Reverseword
{
	public static void main(String[] args)
	{
		String str=" ",nstr="";
		char ch;
		Scanner s=new Scanner(System.in);
			str=s.nextLine();
		System.out.println("Original WOrd:"+" "+str);
		for(int i=0;i<str.length();i++){
		ch=str.charAt(i);
		nstr=ch+nstr;
		}
		System.out.println("Reversed word:"+" "+nstr);
	}
}
		