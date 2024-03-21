import java.util.*;
class Fabevenno{
public static void main(String[] args){
	int n1=0,n2=1,n3=0,n4,n,sum=0,i;
	Scanner s=new Scanner(System.in);
System.out.println("Enter the number: ");
	n=s.nextInt();
	System.out.println(" "+n1);
	System.out.println(" "+n2);
	for(i=0;i<=n;i++){
	n3=n1+n2;
	System.out.print(" "+n3);
	n4=n1;
	n1=n2;
	n2=n3;
	if(i%2==0){
	sum=sum+n4;
	}
	}
   
System.out.print("the sum is"+sum);
}
}