import java.util.*;
class  Division
{
	public static void main(String[] args)
	{
		int a,b,qu,rem;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		qu=a/b;
		rem=a%b;
		System.out.println("Quotient is "+qu);
		System.out.println("Remainder is "+rem);
	}
}