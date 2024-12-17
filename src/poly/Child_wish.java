package poly;

public class Child_wish extends Parent_wish {
	public void wish() {
		System.out.println("Car");
		super.wish();
		
	}
	public static void main(String[] args) {
		Child_wish aChild_wish= new Child_wish();
		aChild_wish.wish();
		//Parent_wish bParent_wish= new Parent_wish();
		//bParent_wish.wish();
	}

}
