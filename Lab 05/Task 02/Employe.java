class Employe{
	String name;
	int EmplyID;
	int Salary;
	Employe(String name, int EmplyID, int Salary ){
	this.name = name;
	this.EmplyID = EmplyID;
	this.Salary = Salary;
	}
	void increaseSalary(int amount){
	Salary +=amount;
	}
	void calculateAnnualSalary(){
	System.out.println("Annual Salary " + (Salary*12));
	}
	void DisplayDetails(){
	System.out.println("Employe Name : " + name);
	System.out.println("Employe Id : " + EmplyID);
	System.out.println("Employe Salary : " + Salary);
	}
	public static void main (String [] args){
	Employe E1 = new Employe ("Muzamil Ali" , 16 , 6000);
	E1.increaseSalary(3000);
	E1.calculateAnnualSalary();
	E1.DisplayDetails();
	}
	}
	
	
	