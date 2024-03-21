import java.util.*;
class Posneg
{
public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
n=s.nextInt();
if(n>0){
	System.out.println("It is positive");}
else if(n<0){
	System.out.println("it is Neagative");
	}
else	{
	System.out.println("It is neutral");
	}
}
}