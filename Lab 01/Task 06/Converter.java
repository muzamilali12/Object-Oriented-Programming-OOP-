import java.util.Scanner;
class Converter {

public static void main(String [] args){

Scanner scanner = new Scanner(System.in);
System.out.println("Enter the value in Dollor:");
int dollor = scanner.nextInt();
System.out.println("Converted value : " + (dollor * 280.0));
System.out.println("Bulid Successful");
scanner.close();
}

}

