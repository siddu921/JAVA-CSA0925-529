import java.util.*;
class Week
{
public static void main(String[] args)
{
int option;
Scanner s=new Scanner(System.in);
System.out.println("Enter option");
option=s.nextInt();
switch(option){
case 1:
System.out.println("Sunday");
break;
case 2:
System.out.println("Monday");
break;
case 3:
System.out.println("Tuesday");
break;
case 4:
System.out.println("Wednseday");
break;
case 5:
System.out.println("thursday");
break;
case 6:
System.out.println("Friday");
break;
case 7:
System.out.println("Saturday");
break;
}
}
}