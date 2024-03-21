import java.util.*;
class Leapyear
{
public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the year");
n=s.nextInt();
if(n%4==0){
	System.out.println("It is leap year");
	}
else {
	System.out.println("It is not Leap year");
	}
}
}