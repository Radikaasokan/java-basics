package basicpro;

public class Conditionswitch {
	public static void main(String[]args) {
		int day=6;
		switch(day) {
		case 1:
			System.out.println("mon");
			break;
		case 2:
			System.out.println("tue");
			break;
		case 3:
			System.out.println("wed");
			break;
		case 4:
			System.out.println("thur");
			break;
		case 5:
			System.out.println("fri");
			break;
			default :
				System.out.println("No Day");
				break;
		}		
	}

}
