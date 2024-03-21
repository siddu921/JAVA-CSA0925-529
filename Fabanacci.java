import java.util.*;
class Fibonacci{
    public static void main(String[] args)
    {
     int a=0,b=1,c,num,i;
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number of terms:");
      num=s.nextInt();
      System.out.print(a);
      System.out.print(b);
    for(i=1;i<=num;i++)
     {
       c=a+b;
       System.out.print(c);
       a=b;
       b=c;
      }
 }
}