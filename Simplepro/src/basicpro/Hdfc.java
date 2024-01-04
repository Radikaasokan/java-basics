package basicpro;

public class Hdfc extends Bank {
	public void salary() {
		System.out.println("salary account");
	}
	public void current() {
		System.out.println("current account");
	}
public static void main(String[]args) {
	Hdfc obj = new Hdfc();
	obj.salary();
	obj.current();
	obj.savings();
}
}
