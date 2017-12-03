package quizPackage;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Results extends JFrame {

	private static final long serialVersionUID = 1L;

	public void Print(Quiz query) {
		
		//Checks if the quiz has been cancelled at any point and doesn't display the results in that case
		if (query.isNull == true || query.q1 == "Cancel") {
			return;
		} else
		//Displays the user score and the results as a list
		JOptionPane.showMessageDialog(null, "Your score is " + query.score + " out of 10" + "\n\nQuestion 1: " + query.q1 + "\nQuestion 2: " + query.q2 + "\nQuestion 3: " + query.q3 + "\nQuestion 4: " + query.q4 + "\nQuestion 5: " + query.q5 + "\nQuestion 6: " + query.q6 + "\nQuestion 7: " + query.q7 + "\nQuestion 8: " + query.q8 + "\nQuestion 9: " + query.q9 + "\nQuestion 10: " + query.q10);
	
	}
	
}
