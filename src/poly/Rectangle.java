package poly;

public class Rectangle implements Shape1{
public void calculateArea() {
	int L=9;
	int W=7;
	int A= L*W;
	System.out.println("Area is: "+A);
}
public static void main(String[] args) {
	Rectangle aRectangle=new Rectangle();
	aRectangle.calculateArea();
}
}