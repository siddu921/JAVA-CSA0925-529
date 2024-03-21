import java.util.*;
class Fact{
public static void main(String[] args){
	int n,i,fact=1;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	for(i=n;i>0;i--){
	fact=fact*i;
	}
	System.out.print("factorial of "+n+" "+fact);
}
}