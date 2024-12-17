package poly;

public class Dog1 extends Anima{
public void makesound() {
	System.out.println("Woof!");
}
public static void main(String[] args) {
	Dog1 aDog1=new Dog1();
	aDog1.makesound();
}
}