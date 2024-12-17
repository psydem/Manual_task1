package poly;

public class Employee {
String nameString;
int id;
double salary;
public Employee(String name, int id, double salary)
{
	this.nameString= name;
	this.id= id;
	this.salary= salary;
}
public void displayemployee() {
	System.out.println("Name: "+nameString);
	System.out.println("ID: "+id);
	System.out.println("Salary: "+salary);
}
public static void main(String[] args) {
	Employee aEmployee= new Employee("Krishna", 192211171, 25000);
	aEmployee.displayemployee();
}
}
