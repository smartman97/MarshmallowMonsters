package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;

public class MonsterController
{
	private MarshmallowMonster colmMonster;
	private MarshmallowOutput myOutput;
	
	public MonsterController()
	{
		int eyes = 2;
		double legs = 3;
		double hair = 3;
		int noses = 0;
		boolean hasBellyButton = true;
		String name = "Jar Jar";
		
		colmMonster = new MarshmallowMonster(name, eyes, noses, hair, legs, hasBellyButton);
		myOutput = new MarshmallowOutput();
	}
	
	public void start()
	{
		myOutput.displayMonsterInfo(colmMonster.toString());
	}
	
}
