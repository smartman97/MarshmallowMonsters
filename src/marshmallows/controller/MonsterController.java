package marshmallows.controller;

import java.util.Scanner;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MarshmallowDisplay;
import marshmallows.view.MarshmallowOutput;

public class MonsterController
{
	private MarshmallowMonster colmMonster;
	private MarshmallowMonster userMonster;
	private MarshmallowOutput myOutput;
	private Scanner monsterScanner;
	private MarshmallowDisplay myPopups;
	
	public MonsterController()
	{
		int eyes = 5;
		int noses = 11;
		double hair = 1234.5;
		double legs = 87.5;
		boolean hasBellyButton = true;
		String name = "Jar Jar";
		
		monsterScanner = new Scanner(System.in);
		colmMonster = new MarshmallowMonster(name, eyes, noses, hair, legs, hasBellyButton);
		myOutput = new MarshmallowOutput();
		myPopups = new MarshmallowDisplay();
	}
	
	public void start()
	{
		popupMonster();
		
		/*myOutput.displayMonsterConsole(colmMonster.toString());
		myOutput.displayMonsterGUI(colmMonster.toString());
		int count = 0;
		while(count < 10)
		{
			myOutput.displayPopUpInfo(colmMonster.toString());
			count++;
		}
		*/
		//makeUserMonster();
		//myOutput.displayMonsterConsole(userMonster.toString());
	}
	
	private void askQuestions()
	{
		System.out.println("Type in a better name for the monster ");
		String betterMonsterName = monsterScanner.next();
		colmMonster.setMonsterName(betterMonsterName);
		
		System.out.println("Type in a new number of eyes for the monster");
		int betterMonsterEyes = monsterScanner.nextInt();
		colmMonster.setMonsterEyes(betterMonsterEyes);
		
		System.out.println("Type in a new number of Noses for the monster");
		int betterMonsterNoses = monsterScanner.nextInt();
		colmMonster.setMonsterNoses(betterMonsterNoses);
		
		System.out.println("Type in a new number of Hairs for the monster");
		double betterMonsterHair = monsterScanner.nextDouble();
		colmMonster.setMonsterHair(betterMonsterHair);
		
		System.out.println("Type in a new number of Legs for the monster");
		double betterMonsterLegs = monsterScanner.nextDouble();
		colmMonster.setMonsterLegs(betterMonsterLegs);
		
		System.out.println("Type in whether it is true or false for the monster to have a belly button");
		boolean betterMonsterBellyButton = monsterScanner.nextBoolean();
		colmMonster.setMonsterBellyButton(betterMonsterBellyButton);
	}
	
	/**
	 * This method will get the information to create an instance of a MarshmallowMonster.
	 */
	
	private void makeUserMonster()
	{
		//Step one: Get variables
		String userName;
		int userEyes;
		int userNoses;
		double userHair;
		double userLegs;
		boolean userBellyButton; 
		
		//Step two: Define variables by using Scanner to get user input.
		System.out.println("Type in your name for your monster.");
		userName = monsterScanner.nextLine();
		
		System.out.println("How many eyes does it have?");
		userEyes = monsterScanner.nextInt();
		
		System.out.println("How many noses does it have?");
		userNoses = monsterScanner.nextInt();
		
		System.out.println("How much hair does it have?");
		userHair = monsterScanner.nextDouble();
		
		System.out.println("How many legs does it have?");
		userLegs = monsterScanner.nextDouble();
		
		System.out.println("Does it have a belly button? Type true or false.");
		userBellyButton = monsterScanner.nextBoolean();
		
		//Step three: Make a monster - use the Constructor!!!
		userMonster = new MarshmallowMonster(userName, userEyes, userNoses, userHair, userLegs, userBellyButton);
		
	}
	
	private void popupMonster()
	{
		myPopups.showResponse(colmMonster.toString());
		
		String userName = myPopups.grabAnswer("Type in a monster name!");
		myPopups.showResponse("The monsters name is: " + userName);
		
		String Eyes = myPopups.grabAnswer("How many eyes does it have?");
		int userEyes;
		
		while(!isInteger(Eyes))
		{
			Eyes = myPopups.grabAnswer("How many eyes does it have?");
		}
		
		if(isInteger(Eyes))
		{
			userEyes = Integer.parseInt(Eyes);
		}
		else
		{
			userEyes = 00;
		}
		
		String Noses = myPopups.grabAnswer("How many Noses does it have?");
		int userNoses;
		
		while(!isInteger(Eyes))
		{
			Noses = myPopups.grabAnswer("How many Noses does it have?");
		}
		
		if(isInteger(Noses))
		{
			userNoses = Integer.parseInt(Noses);
		}
		else
		{
			userNoses = 00;
		}
		
		String Hair = myPopups.grabAnswer("How much hair does it have?");
		double userHair;
		
		while(!isDouble(Hair))
		{
			Hair = myPopups.grabAnswer("How much hair does it have?");
		}
		
		if(isDouble(Hair))
		{
			userHair = Double.parseDouble(Hair);
		}
		else
		{
			userHair = 00;
		}
		
		String Legs = myPopups.grabAnswer("How many legs does it have?");
		double userLegs;
		
		while(!isDouble(Legs))
		{
			Legs = myPopups.grabAnswer("How much hair does it have?");
		}
		
		if(isDouble(Legs))
		{
			userLegs = Double.parseDouble(Legs);
		}
		else
		{
			userLegs = 00;
		}
		
		String bellyButton = myPopups.grabAnswer("Does it have a belly button? Type true or false.");
		boolean userBellyButton;
		
		while(!isBoolean(bellyButton))
		{
			bellyButton = myPopups.grabAnswer("Does it have a belly button? Type true or false.");
		}
		
		if(isBoolean(bellyButton))
		{
			userBellyButton = Boolean.parseBoolean(bellyButton);
		}
		else
		{
			userBellyButton = false;
		}
	}
	
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try
		{
			int temp = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("Not a valid Int.");
		}
		return isInt;
	}
	
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double temp = Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("Not a valid Double.");
		}
		return isDouble;
	}
	
	private boolean isBoolean(String input)
	{
		boolean isBoolean = false;
		
		try
		{
			Boolean temp = Boolean.parseBoolean(input);
			isBoolean = true;
		}
		catch(NumberFormatException error)
		{
			myPopups.showResponse("Not a valid Boolean.");
		}
		return isBoolean;
	}
}