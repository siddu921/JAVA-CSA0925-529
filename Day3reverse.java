import java.util.*;
class Day3reverse
{
  public static void main(String arg[])
  {
    int num,rev=0,rem;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the input:");
    num=sc.nextInt();
    while(num!=0)
     {
       rem=num%10;
       rev=rev*10+rem;
       num=num/10;
     }
   System.out.println("The reverse of a number is:"+rev);
  }
}

    
