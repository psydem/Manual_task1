package poly;

public class Smartphone extends Mobilephone{
public void playvideo() {
	System.out.println("Playing video");
}
public static void main(String[] args) {
	Smartphone aSmartphone= new Smartphone();
	aSmartphone.playvideo();
	aSmartphone.makecall();
	aSmartphone.getcharge();
	
}
}
