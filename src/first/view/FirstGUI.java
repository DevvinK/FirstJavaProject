package first.view;

import javax.swing.JOptionPane;
import first.model.PMFriend;
import first.model.Thingy;

public class FirstGUI
{
//	 Declaration section
	private Thingy myGUIThingy;
	private PMFriend berryFriend;
	private PMFriend samFriend;
	private PMFriend jackFriend;
	private PMFriend nathanFriend;
	private PMFriend makeFriend;
	

	public FirstGUI()
	{
//		 Initialized the data member for the class
		myGUIThingy = new Thingy();
		makeFriend = new PMFriend();
		

	}

	public void start()
	{
//		makeAFriend();
		meetMyFriends();
//		 checkWrapper();
//		meetTheGUIThingy();
//		 interact();

	}

	private void meetTheGUIThingy()
	{
		String answer;
		JOptionPane.showMessageDialog(null, "Let's meet our Thingy object");
		// If you press the Red X or cancel on the input dialog you will return
		// a null value
		answer = JOptionPane
				.showInputDialog("Our Thingy object has a name, it is ");
		answer = JOptionPane.showInputDialog("Our Thingy name is " + answer
				+ "?");
		if (answer.equalsIgnoreCase("no"))
		{
			// If you press the Red X or cancel on the input dialog you will
			// return a null value
			answer = JOptionPane
					.showInputDialog("What do you want my name to be?");
			answer = JOptionPane
					.showInputDialog("Really, my name should be this: "
							+ answer);
			if (answer.equalsIgnoreCase("no"))
			{
				meetTheGUIThingy();
			}

		}

		else
		{
			JOptionPane.showMessageDialog(null,
					"Our Thingy object has a new name! It is " + answer);
		}
	}

	private void interact()
	{
		String answer;
		JOptionPane.showMessageDialog(null, "Hi, let's talk");
		// If you press the Red X or cancel on the input dialog you will return
		// a null value
		answer = JOptionPane.showInputDialog("Who am I talking to?");
		JOptionPane.showMessageDialog(null, "Hey " + answer + " wassup?");
		answer = JOptionPane.showInputDialog(answer);
		JOptionPane.showMessageDialog(null,
				"I'm good, just sitting here with a box of chocolate...");

	}

	private void checkWrapper()
	{
		int age;
		boolean isImaginary;

		String answer;
		JOptionPane.showMessageDialog(null, "Hi, let's talk");
		// If you press the Red X or cancel on the input dialog you will return
		// a null value
		answer = JOptionPane.showInputDialog("How old are you?");

		age = Integer.parseInt(answer);
		// Look in the Integer class to read an int from a String parameter
		JOptionPane.showMessageDialog(null, "So you are " + age
				+ " years old? Next year you will be " + (age + 1)
				+ " years old!");

	}
	
	private void makeAFriend()
	{
		String answer;
		String personality;
		String hobby;		
		int age;
		boolean isImaginary;
		double weight; 
		
		answer = JOptionPane.showInputDialog("Hello, welcome to the machine, what is your name?");
		JOptionPane.showMessageDialog(null, "Hello " + answer + " it is nice to meet you! ^_^");
		answer = JOptionPane.showInputDialog("How old are you?");
		age = Integer.parseInt(answer);
		JOptionPane.showMessageDialog(null, "If you are " + age + " then you be " + (age + 1) + " next year! O-O");
		answer = JOptionPane.showInputDialog("Are you real? (Yes or No)");
		if (answer.equalsIgnoreCase ("yes"))
		{
			JOptionPane.showMessageDialog(null, "I'm glad to know that you know that you are real then! ^_^");
			answer = JOptionPane.showInputDialog("Since you are real, how much do you weigh? O-o");
			age = Integer.parseInt(answer);
			if ((makeFriend.getAge()>= 101) && makeFriend.getAge() <= 100)
			{
				JOptionPane.showMessageDialog(null, "I'm glad I'm not human! ^_^");
				JOptionPane.showMessageDialog(null, "I would work out but I'm as buff as I deem to be.");
			}
			
			else
			{
				JOptionPane.showMessageDialog(null, "Time to eat because you need some meat on them bones!");
				JOptionPane.showMessageDialog(null, "My weight? That doesn't matter right now because, well, I'm a computer.");
			}
			
			
		}
		
		else
		{
			JOptionPane.showMessageDialog(null, "If you aren't real then how are you talking to me? O_O" );
			JOptionPane.showMessageDialog(null, "Also, that means you are lying if you are reading this. >:(");
			JOptionPane.showMessageDialog(null, "Please go back and retry this little survey and maybe nextime you'll learn something new. >_>");
			makeAFriend();
		}
		
		
		answer = JOptionPane.showInputDialog("Since we have established that you are real, you must have some king of hobby, can you tell me what it is? ");
		JOptionPane.showMessageDialog(null, "Really " + answer + " is your hobby? That's incredible! Maybe...");
	}
	
	private void meetMyFriends()
	{
		String answer;
		String personality;
		String hobby;		
		int age;
		boolean isImaginary;
		double weight;

		
		answer = JOptionPane.showInputDialog("Who would you like to learn about Jake, Berry, Sam, Nathan? ");
		if (answer.equalsIgnoreCase("Jake"))
		{
			JOptionPane.showMessageDialog(null, "My friend Jake is a 11th grader and goes to Bingham High school. Jake is friends with Nathan");
			JOptionPane.showMessageDialog(null, "");
		} 
		
		else if(answer.equalsIgnoreCase("Berry"))
		{
			JOptionPane.showMessageDialog(null, "My friend Berry is a 12th grader and goes to Herriman High school.");
		}
		
		else if(answer.equalsIgnoreCase("Sam"))
		{
			JOptionPane.showMessageDialog(null, "My friend Sam is a 12th grader and goes to Riverton High school.");	
		}
		
		else if(answer.equalsIgnoreCase("Nathan"))
		{
			JOptionPane.showMessageDialog(null, "My friend Nathan is a 11th grader and goes to Bingham High school. Nathan is friends with Jake");
		}
		
		else
		{
			answer = JOptionPane.showInputDialog("Are you sure that you don't want to learn about anyone?");
			
			if(answer.equalsIgnoreCase("yes"))
			{
				JOptionPane.showMessageDialog(null, "Goodbye");
			}
			
			else
			{
				meetMyFriends();
			}
		}
	}
	
}
