import java.util.*;
class Temp
{
public static void main(String[] args)
{
double cel,far,celsius,farh;
Scanner s=new Scanner(System.in);
System.out.println("Enter the celsius");
cel=s.nextDouble();
System.out.println("Enter the Fahrenheit");
far=s.nextDouble();
farh=((9/5)*cel)+32;
celsius=(far-32)*5/9;
System.out.println("Celsius to farh="+farh);
System.out.println("Fahrenheit to celsius"+celsius);
}
}
