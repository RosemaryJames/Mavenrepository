package finallykey;

public class Finalkey {
	final int a=5;
	public void display()
	{
		a=4;
		System.out.println(a);
	}

	public static void main(String[] args) {
		Finalkey obj=new Finalkey();
		obj.display();

	}

}
