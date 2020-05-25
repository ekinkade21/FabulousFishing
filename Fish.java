import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JButton;

public class Fish extends JButton
{

	private Rectangle fish = new Rectangle(0,0,(int)((Math.random()*300)+30),(int)((Math.random()*200)+30));
	
	public Fish()
	{
		setSize((int)fish.getWidth()+1,(int)fish.getHeight()+1);
		this.setFocusable(false);
	}
	
	public void paintComponent(Graphics  g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.RED);
		g2.fill(fish);
	}
	
}
