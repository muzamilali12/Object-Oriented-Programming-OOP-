	class Employe{
	
	int calculateBouns (int salary){
	return (int) (salary*0.10);
	}
	int calculateBouns (int salary , int extraHours){
	return (int) (salary*0.10) + (extraHours * 500);
	}
	public static void main (String [] args){
	Employe emply = new Employe();
	System.out.println(emply.calculateBouns(50000));
	System.out.println(emply.calculateBouns(50000 , 3));
	}
	}
	