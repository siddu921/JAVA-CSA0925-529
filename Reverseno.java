import java.util.*;
class Reverseno{
public static void main(String[] args){
	int rev=0,rem,n;
	Scanner s=new Scanner(System.in);
System.out.println("Entre the     number");
	n=s.nextInt();
	while(n!=0){
	rem=n%10;
	rev=rev*10+rem;
	n=n%10;
	}
System.out.println("Reverse number is "+rev);
}
}