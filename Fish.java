import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JToggleButton;

public class Fish extends JToggleButton
{
	
	
	private Rectangle fish = new Rectangle(0,0,(int)((Math.random()*200)+30),(int)((Math.random()*100)+30));
	
	public Fish()
	{
		setSize((int)fish.getWidth()+1,(int)fish.getHeight()+1);
		this.setFocusable(false);
	}
	
	

}
