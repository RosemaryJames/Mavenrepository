package superkey;

public class Supersubclass extends Superkey {
	
	int a=6;
	public void display()
	{
		System.out.println(super.a);
		System.out.println(a);
	}

	public static void main(String[] args) {
		Supersubclass obj=new Supersubclass();
		obj.display();

	}

}
