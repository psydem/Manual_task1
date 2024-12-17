package poly;

public class JerrryTheMouse extends Animal{
	public void display() {
		System.out.println("My name is Jerry");
	}
	public static void main(String[] args) {
		JerrryTheMouse aJerrryTheMouse= new JerrryTheMouse();
		aJerrryTheMouse.display();
		aJerrryTheMouse.eat();
		
	}
}
