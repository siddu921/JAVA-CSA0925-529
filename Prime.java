import java.util.*;
class Prime{
    public static void main(String[] args)
    {
     int num,i, prime=0;
      Scanner s=new Scanner(System.in);
     System.out.println("enter the number:");
     num=s.nextInt();
    for(i=2;i<num;i++)
	{
		if(num%i==0)
		prime=1;
		break;
		}
   		if(prime==0)
		{
   	 	System.out.println("given number is prime");
  	 	}
  	 	else
  		 {
   	 	System.out.println("given number is not prime");
    		 }
    	
   }
 }