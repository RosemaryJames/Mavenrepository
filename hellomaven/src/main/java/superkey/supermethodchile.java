package superkey;

public class supermethodchile extends Superkeymethod {
	public void add()
	{
		super.add();
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		supermethodchile obj=new supermethodchile();
		obj.add();

	}

}
