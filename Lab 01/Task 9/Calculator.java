import java.util.Scanner;
class Calculator{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter any opreation ");
char signs = scanner.next().charAt(0);
System.out.print("Enter first number:");
double num1 = scanner.nextInt();
System.out.print("Enter second number:");
double num2 = scanner.nextInt();
switch(signs){
case'+':
System.out.println(num1+num2);
break;
case'-':
System.out.println(num1-num2);
break;
case'/':
System.out.println(num1/num2);
break;
case'*':
System.out.println(num1*num2);
break;
default:
System.out.println("Error Invalid operator ");
}
scanner.close();
}
}




