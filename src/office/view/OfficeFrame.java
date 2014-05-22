package office.view;

import javax.swing.JFrame;
import office.control.*;

public class OfficeFrame extends JFrame
{
	//private AppPanel myPanel;
	private OfficeController myController;
	
	public OfficeFrame(OfficeController myController)
	{
		this.myController = myController;
		myPanel = new AppPanel(myController);
		
		setupFrame();
	}
	
	public void setupFrame()
	{
		this.setContentPane(myPanel);
		this.setSize(550,450);
		this.setVisible(true);
	}
}