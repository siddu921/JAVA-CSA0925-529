import java.util.*;
class Palindrome{
    public static void main(String[] args)
    {
     int rev=0,rem,n;
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number:");
      n=s.nextInt();
     int X=n;
      while(n!=0)
     {
      rem=n%10;
      rev=rev*10 + rem;
      n=n/10;
   }
   if(X==rev)
  {
   System.out.println("given number is a palindrome");
  }
  else
   {
    System.out.println(X+" not a palindrome");
   }
 }
}
