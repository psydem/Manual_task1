package poly;

public class Class_Game extends Game{

	@Override
	public void mushroom() {
		System.out.println("Enemy");
	}
	public static void main(String[] args) {
		Class_Game aClass_Game= new Class_Game();
		aClass_Game.name();
		aClass_Game.mushroom();
	}
}