package poly;

public class Circle {
public void draw() {
	System.out.println("Drawing a Circle");
}
public static void main(String[] args) {
	Circle aCircle=new Circle();
	Shape aShape=new Shape();
	aCircle.draw();
	aShape.draw();
}
}