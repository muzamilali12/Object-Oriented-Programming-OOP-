class BankAccount{
	String bankAccount;
	double balance;
	BankAccount(double balance){
	this.balance = balance;
	}
	void displayBalance(){
	System.out.println("Balance : " + balance);
	}
	void withdraw(double amount){
	if (amount<=balance){
	balance = balance - amount;
	}
	else{
	System.out.println("Withdraw amount is larger than balance");
	}
	}
	void deposit(double amount){
		balance = balance+amount;
	}
	public static void main(String[] args){
		BankAccount acc1 = new BankAccount(1000.0);
		BankAccount acc2 = new BankAccount(500.0);
		acc1.displayBalance();
		acc2.displayBalance();
		
		acc1.deposit(500.0);
		acc2.withdraw(1500);
}
}