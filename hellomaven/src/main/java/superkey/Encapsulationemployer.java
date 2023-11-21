package superkey;

public class Encapsulationemployer {

	public static void main(String[] args) {
		Encapsulationemployee obj=new Encapsulationemployee();
		obj.setName("Rose");
		obj.setSalary(10000);
		System.out.println(obj.getName());
		System.out.println(obj.getSalary());

	}

}
