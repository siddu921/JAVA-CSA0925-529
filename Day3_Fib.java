import java.util.*;
class Day3_Fib
{
public static void main(String[] args)
{
int n1=0,n2=1,n3,num,i;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
num=sc.nextInt();
System.out.println(n1);
System.out.println(n2);
for(i=1;i<=num;i++)
{
n3=n1+n2;
System.out.println(n3);
n1=n2;
n2=n3;
}
}
}