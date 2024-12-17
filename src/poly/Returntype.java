package poly;

public class Returntype {
public static String name() {
	return "Hi";
}
public static int juice() {
	return 80;
}
public static void main(String[] args) {
	Returntype aReturntype=new Returntype();
	System.out.println(juice());
	System.out.println(name());
}
}
