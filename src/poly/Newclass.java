package poly;

public class Newclass {
	static int a=90;
	final int r=88;
public static int name() {
	return 45;
}
public final void name1() {
	System.out.println("This");
}
public static void main(String[] args) {
	Newclass aNewclass=new Newclass();
	name();
	aNewclass.name1();
	System.out.println(a);
	System.out.println(aNewclass.r);
}
}
