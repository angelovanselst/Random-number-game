import javax.swing.JOptionPane;

public class Numbers {

	public static void main(String[] args) {
		
		int randomNum = (int)(Math.random()*100 + 1);
		int userAnswer = 0;
		System.out.println("The correct guess would be " + randomNum);
		int count = 1;
		
		while (userAnswer != randomNum)
		{
			String response = JOptionPane.showInputDialog(null,
					"Guess between 1 and 100", "Guessing Game", 3);
			userAnswer = Integer.parseInt(response);
			JOptionPane.showMessageDialog(null, ""+ determineGuess(userAnswer, randomNum, 
			count));
						count++;
		}
	}
	
	public static String determineGuess(int userAnswer, int randomNum, int count) {
		if (userAnswer <=0 || userAnswer >100) {
				return "your gues is invalid";
		}
		else if (userAnswer == randomNum) {
			return "Correct!\nTotal Guesses:" + count;
		}
		else if (userAnswer > randomNum) {
			return "Your guess is to high, try again. \nTry Number: " + count;
		}
		else if (userAnswer < randomNum) {
			return"Your guess is to low, try again. \nTry Number; " + count;
		}
		return null;
		
	}

}
