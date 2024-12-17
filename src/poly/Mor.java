package poly;

public class Mor {
	public void name(int a) {
		System.out.println(a);
	}
	public void name(String b) {
		System.out.println(b);
	}
	public void name(int c, int d) {
		System.out.println(c);
	}
	public void name() {
		System.out.println( );
	}
public static void main(String[] args) {
	Mor refMor= new Mor();
	refMor.name(4);
	refMor.name("bdc");
	refMor.name(4, 5);
	refMor.name();

}
}
