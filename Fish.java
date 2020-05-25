import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JButton;

public class Fish extends JButton
{
	//The fish are only rectangles right now, maybe we can make them look better at the end, but i think its fine for now
	
	private Rectangle fish = new Rectangle(0,0,(int)((Math.random()*200)+30),(int)((Math.random()*100)+30));
	
	public Fish()
	{
		setSize((int)fish.getWidth()+1,(int)fish.getHeight()+1);
		this.setFocusable(false);
	}
	
	public void paintComponent(Graphics  g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		//The fish are only red right now to make it easier to find them
		g2.setColor(Color.RED);
		g2.fill(fish);
	}
	
}
