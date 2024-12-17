package poly;

public class Calculator {
public int add(int a, int b) {
	int c= a+b;
	System.out.println(c);
	return c;
}
public int add(int d, int e, int f ) {
	int r= d+e+f;
	System.out.println(r);
	return r;
}
public static void main(String[] args) {
	Calculator aCalculator= new Calculator();
	aCalculator.add(10, 20);
	aCalculator.add(1, 3, 7);
}
}
