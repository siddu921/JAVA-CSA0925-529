import java.util.*;
class Rev{
	public static void main(String[] args){
	String str,nstr=" ";
	char ch;
	Scanner s=new Scanner(System.in);
	System.out.println("Word=");
	str=s.nextLine();
	for(int i=0;i<str.length();i++){
	ch=str.charAt(i);
        nstr=ch+nstr;
	}	
	System.out.println("Reverse word=" +nstr);
	}
}
	
	
	
	
	