import java.util.*;
class Elligible
{
public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter age");
n=s.nextInt();
if(n>=18){
	System.out.println("Elligible for vote");}
else {
	System.out.println("Not elligible for vote");
	}
}
}