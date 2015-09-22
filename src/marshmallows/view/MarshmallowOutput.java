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
		JOptionPane.showMessageDialog(null, "My monster information is: " + info);
	}
	
	public void displayPopUpInfo(String info)
	{
		JOptionPane.showMessageDialog(null, info);
	}
}
