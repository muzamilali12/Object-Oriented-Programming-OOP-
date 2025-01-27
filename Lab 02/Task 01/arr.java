import java.util.Scanner;
public class arr{
public static void main(String[] args){
char [] cons_arr = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
Scanner scanner = new Scanner (System.in);
System.out.println("Enter the character do you want : ");
char user_inp = scanner.next().charAt(0);
boolean check = false;
for (int i = 0; i<cons_arr.length; i++){
	if (user_inp == cons_arr[i]){
		check = true;
		break;
	}
}
if (check){
	System.out.println("consonants");
}
else{
	System.out.println("not a consonants");
}
}
}