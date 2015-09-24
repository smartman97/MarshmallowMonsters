package marshmallows.controller;

import java.util.Scanner;
import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;

public class MonsterController
{
	private MarshmallowMonster colmMonster;
	private MarshmallowMonster userMonster;
	private MarshmallowOutput myOutput;
	private Scanner monsterScanner;
	
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
	}
	
	public void start()
	{
		myOutput.displayMonsterConsole(colmMonster.toString());
		myOutput.displayMonsterGUI(colmMonster.toString());
		int count = 0;
		while(count < 10)
		{
			myOutput.displayPopUpInfo(colmMonster.toString());
			count++;
		}
		
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
}