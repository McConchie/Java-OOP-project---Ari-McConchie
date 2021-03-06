package quizPackage;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class QuizUI extends JFrame {

	private static final long serialVersionUID = 1L;

	//Method which creates the JFrame
	public QuizUI() {
		
		//Makes it impossible to resize the window and creates a spring layout for the content pane
		setResizable(false);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		// Create a new object which will contain the quiz results
		Quiz query = new Quiz();
		
		// Create button which starts the quiz when clicked.
		JButton btnNewButton = new JButton("Start Quiz");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				//Go through all the quiz questions by calling their methods in the Quiz class with the Quiz object. 
				//If the method returns null, which means that cancel or close was clicked, return from the mouseClicked() method.
				query.question1();
				if (query.q1 == "Cancel") {
					return;
				}
				
				query.question2();
				if (query.q2 == "Cancel") {
					return;
				}
				
				query.question3();
				if (query.q3 == "Cancel") {
					return;
				}
				
				query.question4();
				if (query.q4 == "Cancel") {
					return;
				}
				
				query.question5();
				if (query.q5 == "Cancel") {
					return;
				}

				query.question6();
				if (query.q6 == "Cancel") {
					return;
				}

				query.question7();
				if (query.q7 == "Cancel") {
					return;
				}
				
				query.question8();
				if (query.q8 == "Cancel") {
					return;
				}

				query.question9();
				if (query.q9 == "Cancel") {
					return;
				}

				query.question10();
				if (query.q10 == "Cancel") {
					return;
				}
				
			}
		});
		
		//The UI elements for the window
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 110, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 150, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -150, SpringLayout.EAST, getContentPane());
		getContentPane().add(btnNewButton);
		
		JLabel lblTheAwesomeQuiz = new JLabel("The Awesome Quiz");
		springLayout.putConstraint(SpringLayout.NORTH, lblTheAwesomeQuiz, 45, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblTheAwesomeQuiz, 0, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblTheAwesomeQuiz, -6, SpringLayout.NORTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.EAST, lblTheAwesomeQuiz, 0, SpringLayout.EAST, getContentPane());
		lblTheAwesomeQuiz.setHorizontalAlignment(SwingConstants.CENTER);
		lblTheAwesomeQuiz.setFont(new Font("Arial", Font.PLAIN, 20));
		getContentPane().add(lblTheAwesomeQuiz);
		
		JButton btnNewButton_1 = new JButton("Results");
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1, 0, SpringLayout.WEST, btnNewButton);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -110, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1, 0, SpringLayout.EAST, btnNewButton);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				//When button results button is clicked, calls the Print() method in Results class with the Quiz object created earlier. 
				//The Print() method will show the user the results stored in the object
				Results results = new Results();
				results.Print(query);
				
			}
		});
		getContentPane().add(btnNewButton_1);
		
		//Simple button to open a message box with the instructions for using the quiz
		JButton btnInstructions = new JButton("Instructions");
		btnInstructions.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JOptionPane.showMessageDialog(null, "The answers to this quiz may not be obvious.. Unless you're awesome.\n\nClick the Start Quiz button to start the quiz. Once you answer all the questions, you can see your score by clicking the Results button.\nYou have to answer all the questions to be able to see the results.\nClicking the Start Quiz button will erase the previous results and save the results of the new quiz.");
				
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnInstructions, 0, SpringLayout.SOUTH, btnNewButton_1);
		springLayout.putConstraint(SpringLayout.WEST, btnInstructions, 0, SpringLayout.WEST, btnNewButton);
		springLayout.putConstraint(SpringLayout.EAST, btnInstructions, 0, SpringLayout.EAST, btnNewButton);
		getContentPane().add(btnInstructions);
		
	}
	
	
	//main method
	public static void main(String[] args) {
		
		//Initialize the JFrame, center it, and set an appropriate size
		QuizUI frame = new QuizUI();
		frame.setVisible(true);
		frame.setSize(500, 300);
		frame.setLocationRelativeTo(null);

	}
}
