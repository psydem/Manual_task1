package poly;

public class Car_1 extends Vechicle_1 {
public void accelerate() {
	System.out.println("Increase speed");
}
public static void main(String[] args) {
	Car_1 aCar_1= new Car_1();
	aCar_1.accelerate();
	aCar_1.displayspeed();
}
}