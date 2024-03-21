import java.util.Scanner; 
 
class vowel { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        System.out.print("Enter a string: "); 
        String str = scanner.nextLine(); 
        str = str.toLowerCase(); 
 
        int count = 0,cons=0; 
        for (int i = 0; i < str.length(); i++) { 
            char ch = str.charAt(i); 
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { 
                count++; 
              System.out.println("Vowels are" +ch);
            } 
else{
 System.out.println("Consonat s are" +ch);
 cons++;
}
        } 
 
        System.out.println("Total number of vowels in the string are: " + count); 
System.out.println("Total number of vowels in the string are: " + cons); 
        scanner.close(); 
    } 
} 