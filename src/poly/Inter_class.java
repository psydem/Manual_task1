package poly;

public class Inter_class implements Inter_1,Inter_2,Inter_3{

	@Override
	public void method_3() {
		// TODO Auto-generated method stub
		System.out.println("This is from 3rd Parent");
	}

	@Override
	public void method_2() {
		// TODO Auto-generated method stub
		System.out.println("This is from 2nd Parent");
	}

	@Override
	public void method_1() {
		// TODO Auto-generated method stub
		System.out.println("This is from 1st Parent");
	}
	public static void main(String[] args) {
			Inter_class aClass= new Inter_class();
			aClass.method_1();
			aClass.method_2();
			aClass.method_3();
	}

}
