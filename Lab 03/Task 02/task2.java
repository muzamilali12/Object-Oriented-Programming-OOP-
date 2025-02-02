import java.util.Scanner;
class task2{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
String text = scanner.nextLine();
String rev = "";
for (int i=text.length()-1; i>=0; i--){
	rev = rev + text.charAt(i);
}
if (rev.equals(text)){
System.out.print("Palindrome");
}
else{
System.out.print("Not Palindrome");
}

}
}
 
   