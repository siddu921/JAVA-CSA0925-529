import java.util.*;
class Swap
{
public static void main(String[] args)
{
int a,b,temp;
Scanner s=new Scanner(System.in);
System.out.print("Enter the both numbers");
a=s.nextInt();
b=s.nextInt();
temp=a;
a=b;
b=temp;
System.out.println("Swapped numbers" +a +" " +b);
}
}
