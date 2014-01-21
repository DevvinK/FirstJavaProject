package first.view;


import java.util.Scanner;

import first.model.Thingy;


public class ConsoleView
{
	//Declare section
	private Scanner wordScanner;
	private Thingy testThingy;
	

	public ConsoleView()
	{
		wordScanner = new Scanner(System.in);
		testThingy = new Thingy();
	}
	
	public void start()
	{
		//System.out.println("Hi there, let's talk!");
		//getWords();
		//questionsAndAnswers();
		//meetTheThingy();
		reallyMeetTheThingy();
	}
	
	private void meetTheThingy()
	{
		System.out.println("Let's meet our Thingy object");
		System.out.println("Our Thingy object has a name, it is " + testThingy.getName());
		
		System.out.println("What do you want to change my name to be?");
		
		String newName = wordScanner.nextLine();
		System.out.println("Really, my name should be this: " + newName);
		testThingy.setName(newName);
		System.out.println("Our Thingy object has a new name! It is " + testThingy.getName());
		
		System.out.println("Should we keep this name? Type yes or no");
		
		String answer = wordScanner.nextLine();
		
		
		if(answer.equalsIgnoreCase("yes"))
		{
			if (answer.equals("Yes"))
				{
				System.out.println("Yay you followed the directions");
				testThingy.setName(newName);
				}
			System.out.println("Out Thingy object has a new name! It is "+ testThingy.getName());
		}
		
		else if (answer.equalsIgnoreCase("no"))
		{
			meetTheThingy();
		}
		else
		{
			System.out.println("I do not like the name " + newName + "I think it is silly");
			System.out.println("Our Thingy object has the same name! It is " + testThingy.getName());
		}
	}
	private void reallyMeetTheThingy()
	{
		System.out.println("HI! What is your favorite food?");
		getFood();
		System.out.println("I myself like a good steak cooked over a wood fire with some steamed vegirables and mashed potaotes with brown gravey.");
		System.out.println("What is your favorite movie by the way?");
		getMovie();
		System.out.println("I see... sadly I don't have one, I prefer to watch and enjoy them rather than pick and chose because there are so many!");
		System.out.println("We should talk again sometime! Bye!");
	}
	
	private void questionsAndAnswers()
	{
		System.out.println("When were you born?");
		getWords();
		System.out.println("What is your favorite color?");
		getWords();
		System.out.println("What is your favoite food?");
		getWords();
		System.out.println("Can you solve a rubik's cube?");
		getWords();
		System.out.println("Thank you, this completes this questionare. Thank you!");
	}
	
	private void getWords()
	{
		String test = wordScanner.nextLine();
		System.out.print("You typed this to me:");
		System.out.println(test);
	}

	private void getFood()
	{
		String newFood = wordScanner.nextLine();
		System.out.println("Your favorite food is " + newFood + "?");
		
		String answer = wordScanner.nextLine();
		
		if(answer.equalsIgnoreCase("yes"))
		{
			
		}
		
		else if(answer.equalsIgnoreCase("no"))
		{
			
		}
	}
	
	private void getMovie()
	{
		String newMovie = wordScanner.nextLine();
		System.out.println("Is this your favorite movie " + newMovie + "?");

		String answer = wordScanner.nextLine();
		
		
	}
	
	private void getConversation()
	{
		String newtalk = wordScanner.nextLine();
	}
	
	private void show()
	{
		System.out.print("Show this on my screen");
		System.out.println("show this on my screen too");
		System.out.println("This year is going to be the best and I hope to make it worth while, if I don't die first...");
		System.out.println("I like to mess around");
		System.out.println("I like to eat a lot of cake");
	}

	
}
