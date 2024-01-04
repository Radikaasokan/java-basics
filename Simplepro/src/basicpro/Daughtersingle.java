package basicpro;

public class Daughtersingle extends Mothersingle {
	public void education() {
		System.out.println("IT");
	}
public static void main(String[]args) {
	Daughtersingle obj = new Daughtersingle();
	obj.business();
	obj.vehicle();
	obj.education();
}
}
