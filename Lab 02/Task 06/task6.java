import java.util.Scanner;
class task6{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter Age: ");
int num = input.nextInt();
System.out.print((num<=18)? "Yes Eligible for voting" : "Not Eligible for voting");
}
}