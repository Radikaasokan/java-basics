package basicpro;

public class Methodoverload {
	public void student(int id) {
		System.out.println(id);
	}
	public void student(String name) {
		System.out.println(name);
	}
	public void student(long phoneno) {
		System.out.println(phoneno);
	}
	public static void main(String[]args) {
		Methodoverload obj = new Methodoverload();
		obj.student(2);
		obj.student("radi");
		obj.student(992483511);
	}

}
