package marshmallows.controller;

import java.util.Scanner;
import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;

public class MonsterController
{
	private MarshmallowMonster colmMonster;
	private MarshmallowOutput myOutput;
	private Scanner monsterScanner;
	
	public MonsterController()
	{
		int eyes = 2;
		int noses = 0;
		double legs = 3;
		double hair = 3;
		boolean hasBellyButton = true;
		String name = "Jar Jar";
		
		monsterScanner = new Scanner(System.in);
		colmMonster = new MarshmallowMonster(name, eyes, noses, hair, legs, hasBellyButton);
		myOutput = new MarshmallowOutput();
	}
	
	public void start()
	{
		myOutput.displayMonsterInfo(colmMonster.toString());
		askQuestions();
		myOutput.displayMonsterInfo("New Monster Info " + colmMonster.toString());
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
		
		System.out.println("Type in a new number of Legs for the monster");
		double betterMonsterLegs = monsterScanner.nextDouble();
		colmMonster.setMonsterLegs(betterMonsterLegs);
		
		System.out.println("Type in a new number of Hairs for the monster");
		double betterMonsterHair = monsterScanner.nextDouble();
		colmMonster.setMonsterHair(betterMonsterHair);
		
		System.out.println("Type in whether it is true or false for the monster to have a belly button");
		boolean betterMonsterBellyButton = monsterScanner.nextBoolean();
		colmMonster.setMonsterBellyButton(betterMonsterBellyButton);

	}
}