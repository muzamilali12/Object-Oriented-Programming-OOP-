	class Student{
	private String name;
	private int rollNumber;
	private char grade;
	
	public String getName(){
	return name;
	}
	public void setName(String name){
	this.name = name;
	}
	public int getrollNumber(){
	return rollNumber;
	}
	public void setrollNumber(int rollNumber){
	this.rollNumber = rollNumber;
	}
	public char getGrade(){
	return grade;
	}
	public void setGrade(char grade){
	this.grade = grade;
	}
	void displayDetials(){
	System.out.println("Name : " + name);
	System.out.println("Roll Number : " + rollNumber);
	System.out.println("Grade : " + grade);
	}
	public static void main(String [] args){
	Student s1 = new Student ();
	s1.setName("Muzamil Ali");
	s1.setrollNumber(16);
	s1.setGrade('G');
	s1.displayDetials();
	}
	}
	
	
	
	
	
	
	
	