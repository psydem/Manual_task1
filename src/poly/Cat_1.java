package poly;

public class Cat_1 extends Animal_1{
public void makesound() {
	System.out.println("Meow!");
}
public static void main(String[] args) {
	Animal_1 a= new Animal_1();
	a.makesound();
	Cat_1 b= new Cat_1();
	b.makesound();
}
}