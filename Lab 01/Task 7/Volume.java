import java.util.Scanner;
class Volume{
public static void main(String[] args){
Scanner scanner = new Scanner (System.in);
System.out.print("Enter Radius of Clynder ");
int Radius = scanner.nextInt();
System.out.print("Enter Hight of Clynder ");
int Hight = scanner.nextInt();
double result = Radius*Radius*Hight*3.14;
System.out.print("Volume of Clynder is: " + (result));
}
}