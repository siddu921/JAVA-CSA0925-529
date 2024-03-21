import java.util.*;
class Triarea
{
public static void main(String[] args)
{
double area,a,b;
Scanner s=new Scanner(System.in);
System.out.println("Enter the breadth");
a=s.nextDouble();
System.out.println("Enter the height");
b=s.nextDouble();
area=0.5*a*b;
System.out.println("Area of triangle is"+area);
}
}
