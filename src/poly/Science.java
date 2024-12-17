package poly;

public class Science extends DA{
public float bonus() {
	return 2000;
}
public static void main(String[] args) {
	Science aScience= new Science();
	float Total_salary= aScience.salary()+aScience.hra()+aScience.da()+aScience.bonus();
	System.out.println(Total_salary);
}
}
