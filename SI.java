import java.util.*;
class SI
{
public static void main(String[] args)
{
double p,t,r,si;
Scanner s=new Scanner(System.in);
System.out.println("Enter the amount");
p=s.nextDouble();
System.out.println("Enter the Time");
t=s.nextDouble();
System.out.println("Enter the rate of intrest");
r=s.nextDouble();
si=(p*t*r)/100;
System.out.println("Simple Intrest="+si);
}
}