package basicpro;

public class Overridedog {
	public void animal() {
		System.out.println("dog is a animal");
	}
	public static void main(String[]args) {
		Overridecat obj = new Overridecat();
		obj.animal();
		}

}
