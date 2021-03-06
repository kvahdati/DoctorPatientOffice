package office.view;

import javax.swing.JFrame;
import office.control.*;

public class OfficeFrame extends JFrame
{
	private OfficePanel myPanel;
	private OfficeController myController;
	
	public OfficeFrame(OfficeController myController)
	{
		this.myController = myController;
		myPanel = new OfficePanel(myController);
		
		setupFrame();
	}
	
	public void setupFrame()
	{
		this.setContentPane(myPanel);
		this.setSize(550,450);
		this.setVisible(true);
	}
}