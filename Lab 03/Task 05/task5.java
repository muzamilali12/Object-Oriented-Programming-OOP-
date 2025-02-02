import java.util.Scanner;
class task5{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter number of Rows : ");
int rows = input.nextInt();
System.out.print("Enter number of Colomns : ");
int Colomns = input.nextInt();
boolean [][] seats = new boolean [rows][Colomns];
int choise;
do{
System.out.println("Display Avalaible Seats: 1");
System.out.println("Reserve a Seat: 2");
System.out.println("Exit : 3");
System.out.print("Enter your Choise : ");
choise = input.nextInt();
switch(choise){
case 1:
System.out.println("Avalaible Seats (False means Avalaible, and True Means Reserved): ");
for(int i =0; i<rows; i++){
for(int j =0; j<Colomns; j++){
System.out.print(seats[i][j]+ "   ");
}
System.out.println();
}
break;
case 2:
System.out.print("Enter Row Number (0 to " + (rows - 1) + "): ");
int row = input.nextInt();
System.out.print("Enter Colomns Number (0 to " + (Colomns - 1) + "): ");
int col = input.nextInt();
if(row>=0 && row<rows && col>=0 && col<Colomns){
if (!seats[row][col]){
seats[row][col]=true;
System.out.println("You Have reserved your Seats Succesfully");
}
else{
System.out.println("This seat Already Reserved ");
}
}
break;
case 3:
System.out.println("Exiting the program Bye Bye Enjoy " );
break;
default:
System.out.println("Invalid choise plz enter you choise between 1 from 3: ");
break;
}
}
while (choise!=3);
}
}


