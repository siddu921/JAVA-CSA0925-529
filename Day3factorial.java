import java.util.*;
class Day3factorial
{
  public static void main(String arg[])
   {
     int num,i,fact=1;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the num:");
     num=sc.nextInt();
     for(i=1;i<=num;i++)
      {
         fact=fact*i;
       }
     System.out.println("The factorial of a number is:"+fact);
    }
}