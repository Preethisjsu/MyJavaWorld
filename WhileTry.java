package LearnJava;

public class WhileTry {
	public static void main(String[] args) {
		int myNum = 1;
		boolean loop = myNum < 25;
		while(myNum<=10){
			System.out.println("Hello" + myNum);
			myNum = myNum + 1;
		}
		System.out.println(loop);
	}
}
