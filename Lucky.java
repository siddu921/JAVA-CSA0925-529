import java.util.*;
class Lucky
{
public static void main(String[] args)
{
int option;
Scanner s=new Scanner(System.in);
System.out.println("Enter option");
option=s.nextInt();
switch(option){
case 1:
System.out.println("Unlucky");
break;
case 2:
System.out.println("Unlucky");
break;
case 3:
System.out.println("Lucky");
break;
case 4:
System.out.println("Unlucky");
break;
case 5:
System.out.println("Unlucky");
break;
default:
System.out.println("Please option between 1 and 5");
}
}
}