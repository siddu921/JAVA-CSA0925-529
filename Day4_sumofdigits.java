import java.util.*;
class Day4_sumofdigits
{
    public static void main(String arg[])
     {
       int sum=0,rem,num;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       num=sc.nextInt();
       while(num!=0)
       {
       rem=num%10;
        sum=sum+rem;
        num=num/10;
       }
       System.out.println("The sum of digits is:"+sum);
      }
}
