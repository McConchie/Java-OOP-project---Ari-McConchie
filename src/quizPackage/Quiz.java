package quizPackage;

import javax.swing.*;

public class Quiz extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	//The fields of the object which contain the question results
	String q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;
	//Field used to display the user's score
	int score = 0;
	//Boolean field to prevent displaying results if the quiz has been cancelled
	boolean isNull = true;
	
	//All the question methods follow the same structure. They return void and simply set the object attributes to either "Correct" or "Incorrect"
	public void question1() {
		
		//Displays the quiz question as an input dialog 
		String[] values = {"To eat pizza and drink beer", "The open steppe, fleet horse, falcons at your wrist, and the wind in your hair.", "To crush your enemies, see them driven before you and hear the lamentations of their women."};
		String q1 = (String) JOptionPane.showInputDialog(null, "What is best in life?", "", JOptionPane.QUESTION_MESSAGE, null, values, "0");    

		//Check if cancel or close is clicked to stop the quiz and set isNull to true to stop the user from viewing the incomplete results
		if(q1 == null) {
			this.q1 = "Cancel";
			this.isNull = true;
		//The correct answer. Sets the attribute to "Correct", adds 1 to the score and sets isNull to true so that results can be viewed
		} else if(q1 == "To crush your enemies, see them driven before you and hear the lamentations of their women.") {
			this.q1 = "Correct";
			this.score++;
			this.isNull = false;
		//Wrong answer. Sets attribute to "Incorrect" and isNull to false so that results can be viewed
		} else
			this.q1 = "Incorrect";
		this.isNull = false;
	}
	
	public void question2() {
		
		JPanel q2 = new JPanel();
		
		JRadioButton button1 = new JRadioButton("to the drug store");
        JRadioButton button2 = new JRadioButton("to the kitchen");
        JRadioButton button3 = new JRadioButton("TO DA CHOPPAH!");
        JRadioButton button4 = new JRadioButton("to the police station");
        
		ButtonGroup group = new ButtonGroup();
        group.add(button1);
        group.add(button2);
        group.add(button3);
        group.add(button4);
        
        Box vArrange = Box.createVerticalBox();

        vArrange.add(new JLabel("In case of a hazardous jungle situation, where should you go?\n"));
        vArrange.add(button1);
        vArrange.add(button2);
        vArrange.add(button3);
        vArrange.add(button4);
        
        q2.add(vArrange);
        
        int n = JOptionPane.showConfirmDialog(null, q2, null, JOptionPane.OK_CANCEL_OPTION);
        
		if(n == JOptionPane.CLOSED_OPTION || n == JOptionPane.CANCEL_OPTION) {
			this.q2 = "Cancel";
			this.isNull = true;
		} else if(button3.isSelected()) {
			this.q2 = "Correct";
			this.score++;
		} else
			this.q2 = "Incorrect";	
	}

	public void question3() {
		
		JPanel q3 = new JPanel();
		
		JCheckBox button1 = new JCheckBox("A cat");
		JCheckBox button2 = new JCheckBox("A dog");
		JCheckBox button3 = new JCheckBox("Yo mama");
		JCheckBox button4 = new JCheckBox("A Honda Monkey");
        
        Box vArrange = Box.createVerticalBox();

        vArrange.add(new JLabel("Which of the following are animals?"));
        vArrange.add(button1);
        vArrange.add(button2);
        vArrange.add(button3);
        vArrange.add(button4);
        
        q3.add(vArrange);
        
        int n = JOptionPane.showConfirmDialog(null, q3, null, JOptionPane.OK_CANCEL_OPTION);
        
        if(n == JOptionPane.CLOSED_OPTION || n == JOptionPane.CANCEL_OPTION) {
			this.q3 = "Cancel";
			this.isNull = true;
		} else if(button1.isSelected() && button2.isSelected()) {
			this.q3 = "Correct";
			this.score++;
		} else
			this.q3 = "Incorrect";
	}
	
	public void question4() {
		
		String q4 = JOptionPane.showInputDialog(null, "Say hello to my little friend!", "", JOptionPane.QUESTION_MESSAGE);
		
		if(q4 == null) {
			this.q4 = "Cancel";
			this.isNull = true;
		} else if(q4.equalsIgnoreCase("hello to my little friend") || q4.equalsIgnoreCase("hello to my little friend!") || q4.equalsIgnoreCase("hello to my little friend.")) {
			this.q4 = "Correct";
			this.score++;
		} else
			this.q4 = "Incorrect";
	}
	
	public void question5() {
		
		String[] values = {"God", "Your wife", "The Emperor of Mankind"};
		String q5 = (String) JOptionPane.showInputDialog(null, "For whom is it better to die for than to live for yourself?", "", JOptionPane.QUESTION_MESSAGE, null, values, "0");    
		
		if(q5 == null) {
			this.q5 = "Cancel";
			this.isNull = true;
		} else if(q5 == "The Emperor of Mankind") {
			this.q5 = "Correct";
			this.score++;
		} else
			this.q5 = "Incorrect";
	}
	
	public void question6() {

		JPanel q6 = new JPanel();
		
		JRadioButton button1 = new JRadioButton("Milk");
        JRadioButton button2 = new JRadioButton("Beer");
        JRadioButton button3 = new JRadioButton("Wine");
        JRadioButton button4 = new JRadioButton("Water");
        
		ButtonGroup group = new ButtonGroup();
        group.add(button1);
        group.add(button2);
        group.add(button3);
        group.add(button4);
        
        Box vArrange = Box.createVerticalBox();

        vArrange.add(new JLabel("Which drink tastes the best with pizza?"));
        vArrange.add(button1);
        vArrange.add(button2);
        vArrange.add(button3);
        vArrange.add(button4);
        
        q6.add(vArrange);
        
        int n = JOptionPane.showConfirmDialog(null, q6, null, JOptionPane.OK_CANCEL_OPTION);
        
		if(n == JOptionPane.CLOSED_OPTION || n == JOptionPane.CANCEL_OPTION) {
			this.q6 = "Cancel";
			this.isNull = true;
		} else if(button2.isSelected()) {
			this.q6 = "Correct";
			this.score++;
		} else
			this.q6 = "Incorrect";
	}
	
	public void question7() {

		JPanel q7 = new JPanel();
		
		JCheckBox button1 = new JCheckBox("ESP");
		JCheckBox button2 = new JCheckBox("GSM");
		JCheckBox button3 = new JCheckBox("Ibanez");
		JCheckBox button4 = new JCheckBox("IPv6");
        
        Box vArrange = Box.createVerticalBox();

        vArrange.add(new JLabel("Which of the following are guitar brands?"));
        vArrange.add(button1);
        vArrange.add(button2);
        vArrange.add(button3);
        vArrange.add(button4);
        
        q7.add(vArrange);
        
        int n = JOptionPane.showConfirmDialog(null, q7, null, JOptionPane.OK_CANCEL_OPTION);
        
        if(n == JOptionPane.CLOSED_OPTION || n == JOptionPane.CANCEL_OPTION) {
			this.q7 = "Cancel";
			this.isNull = true;
		} else if(button1.isSelected() && button3.isSelected()) {
			this.q7 = "Correct";
			this.score++;
		} else
			this.q7 = "Incorrect";
	}
	
	public void question8() {

		String q8 = JOptionPane.showInputDialog(null, "Continue this sentence: Put that cookie...", "", JOptionPane.QUESTION_MESSAGE);
		
		if(q8 == null) {
			this.q8 = "Cancel";
			this.isNull = true;
		} else if(q8.equalsIgnoreCase("down, now!") || q8.equalsIgnoreCase("down now!") || q8.equalsIgnoreCase("down, now")) {
			this.q8 = "Correct";
			this.score++;
		} else
			this.q8 = "Incorrect";
	}
	
	
	public void question9() {

		String[] values = {"Tomato", "Potato", "Cyberdyne Systems model 101", "Carrot"};
		String q9 = (String) JOptionPane.showInputDialog(null, "Which one is not a vegetable?", "", JOptionPane.QUESTION_MESSAGE, null, values, "0");    
		
		if(q9 == null) {
			this.q9 = "Cancel";
			this.isNull = true;
		} else if(q9 == "Cyberdyne Systems model 101") {
			this.q9 = "Correct";
			this.score++;
		} else
			this.q9 = "Incorrect";
	}
	
	public void question10() {

		JPanel q10 = new JPanel();
		
		JRadioButton button1 = new JRadioButton("Metropolia");
        JRadioButton button2 = new JRadioButton("Laurea");
        JRadioButton button3 = new JRadioButton("Haaga-Helia");
 
		ButtonGroup group = new ButtonGroup();
        group.add(button1);
        group.add(button2);
        group.add(button3);
        
        Box vArrange = Box.createVerticalBox();

        vArrange.add(new JLabel("Which one is the best UAS?"));
        vArrange.add(button1);
        vArrange.add(button2);
        vArrange.add(button3);

        q10.add(vArrange);
        
        int n = JOptionPane.showConfirmDialog(null, q10, null, JOptionPane.OK_CANCEL_OPTION);
        
		if(n == JOptionPane.CLOSED_OPTION || n == JOptionPane.CANCEL_OPTION) {
			this.q10 = "Cancel";
			this.isNull = true;
		} else if(button2.isSelected()) {
			this.q10 = "Correct";
			this.score++;
		} else
			this.q10 = "Incorrect";
	}
	
}

