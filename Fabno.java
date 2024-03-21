import java.util.*;
class Fabno{
public static void main(String[] args){
	int n1=0,n2=1,n3,n;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	System.out.println(" "+n1);
	System.out.println(" "+n2);
	for(int i=0;i<=n;i++){
	n3=n1+n2;
	System.out.println(" "+n3);
n1=n2;
n2=n3;
	}
}
}