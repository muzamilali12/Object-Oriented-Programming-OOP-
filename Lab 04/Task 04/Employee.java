class Employee {
String name;
int yearOfJoining;
String salary;
Employee(String name, int yearOfJoining, String salary) {
this.name = name;
this.yearOfJoining = yearOfJoining;
this.salary = salary;
}
public static void main(String[] args) {
Employee E1 = new Employee("Robert", 1994, "Wallstreat");
Employee E2 = new Employee("Sam", 2000, "Wallstreat");
Employee E3 = new Employee("John", 1999, "Wallstreat");
System.out.println(E1.name + " " + E1.yearOfJoining + " " + E1.salary);
System.out.println(E2.name + " " + E2.yearOfJoining + " " + E2.salary);
System.out.println(E3.name + " " + E3.yearOfJoining + " " + E3.salary);
    }
}