import java.util.*;
class Perfectno
{
	public static void main(String[] args){
	int n,i,per=0,x;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
x=n;
	for(i=1;i<n;i++){
		if(n%i==0){
			per=per+i;
		}
	}
	if(per==x){
		System.out.println("perfect");
	}
	else{
	System.out.println(" not perfect");
	}
	}	
}
		