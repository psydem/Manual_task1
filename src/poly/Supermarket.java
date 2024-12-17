package poly;

public class Supermarket {
public  Supermarket(int a) {
	this();
	System.out.println(a);
}
   public  Supermarket(String b) {
	   this(6);
	System.out.println(b);
}
   public Supermarket() {
	System.out.println("This is a non parameter constructor");
}
   public static void main(String[] args) {
	Supermarket aSupermarket= new Supermarket("Hello");
}
}
