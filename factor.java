import java.util.*;
class factor
{
public static void main(string[] args)
{
int fact,n;
System.out.println("enter the value");
Scanner s=new scanner(System.in);
n=s.nextInt();
for(i=0;i<n;i++)
{
if(n%i==0)
{
fact++;
System.out.println(" "+1);
}
}
System.out.println("no of factor is:"+fact);
}
}