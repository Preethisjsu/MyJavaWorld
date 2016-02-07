package LearnJava;

public class IfTry {
	public static void main(String[] args) {
		int myInt = 30;
		int loop = 0;
		
		if (myInt < 10) {
			System.out.println("Yes! It's true");
		} else if (myInt < 20) {
			System.out.println("No! It's false");
		} else {
			System.out.println("None of the above");
		}
		while(true){
			System.out.println("Looging "  + loop);
			if (loop == 5){
				break;
			}
			loop++;
			System.out.println("while loop running");
		}
	}
}
