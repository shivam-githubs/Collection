package Collection.generic;

public class Non_Generics <t>{
	private t a;

	public t getA() {
		return a;
	}

	public void setA(t a) {
		this.a = a;
	}
	public static void main(String args[])
	{
		Non_Generics generics = new Non_Generics();
		
		generics.setA("Shivam");
		System.out.println(generics.getA());
		
		generics.setA(705);
		System.out.println(generics.getA());
		
		generics.setA(true);
		System.out.println(generics.getA());
		
	}

}
