package poly;

public class Variables1 {
	int a=9;
	static int r=88;
public void juice() {
	int a=17;
	int b=a;
	int c;
	System.out.println(a);
	System.out.println(b);
}
public static void main(String[] args) {
	Variables1 aVariables1=new Variables1();
	aVariables1.juice();
	System.out.println(r);
	System.out.println(aVariables1.r);
	System.out.println(Variables1.r);
}
}
