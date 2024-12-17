package poly;

public class Person {
String nameString;
int age;
public void introduce() {
	nameString= "Mani";
	age= 19;
	System.out.println("Hi, my name is"+" "+nameString+" "+"and I am"+" "+age+" "+"years old");
}
public static void main(String[] args) {
	Person aPerson= new Person();
	aPerson.introduce();
}
}