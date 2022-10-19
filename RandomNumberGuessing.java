import java.util.Scanner;

public class RandomNumberGuessing {

	public static void main(String[] args) {		
		
		int randomNum = (int)(Math.random() *100 + 1);
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Gues between 0 and 100: ");
		int guesRandomNumber = scanner.nextInt();
		
		
		if (guesRandomNumber == randomNum) {
			System.out.println("You where right");
		} else if (guesRandomNumber > randomNum) {
			System.out.println("Go lower");
		} else{
			System.out.println("Go higher");
		}
		
		
		
		
	}	
}