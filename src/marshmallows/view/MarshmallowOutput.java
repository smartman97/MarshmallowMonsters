package marshmallows.view;

import javax.swing.JOptionPane;

public class MarshmallowOutput
{
	public void displayMonsterConsole(String info)
	{
		System.out.println(info);
	}
	
	public void displayMonsterGUI(String info)
	{
		JOptionPane.showMessageDialog(null, "This is my monster -> " + info);
	}
	
	public void displayPopUpInfo(String info)
	{
		JOptionPane.showMessageDialog(null, "In case you missed it -> " + info);
	}
}
