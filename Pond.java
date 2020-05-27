import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class Pond extends JPanel implements ActionListener
{
	public Pond(CardLayout cl,JPanel containedIn)
	{
		this.setSize(1000, 800);
		this.setLayout(null);
		this.setBackground(Color.CYAN);
		
		/*
		 *  I am trying to make a fish that is a random size within reason, and a random location, without getting out of bounds
		 *  right now I have it so the fish's size is determined in the Fish class when a fish object is created. But rn I am determining the location 
		 *  of it in this class.
		 *  I was planning on adding 3 fish initially.
		 */
		Fish f1 = new Fish();
		f1.setLocation((int)(Math.random()*this.getWidth()), (int)(Math.random()*this.getHeight())); //edited this line so that the location would be random (the cast caused the Math.random() to always be 0)
		this.add(f1);
		
		/*
		 * Added an actionListener to the fish that causes it to change location and size according to initial bounds
		 * Need to add code to make sure it doesn't stretch off of the screen
		 * If you want, you can add code to change the card displayed or create some sort of integer that increments to count the number of fish caught
		 * 	You could make it so that once a certain amount of fish are caught, the congratulations screen pops up.
		 * I'm not sure how to do it, but we need to repaint the object so that it fills the new bounds (i.e. if the previous fish was 50x50 and the new one is 100x100, only 50x50 out of the total area is painted.)
		 * 
		 * I think just using an actionListener would be easier than a cursor, but either would work; it's just preference
		 * -Casey
		 */
		
		f1.addActionListener(new ActionListener()
				{

					public void actionPerformed(ActionEvent e) {
						f1.setSize((int)((Math.random()*200)+30),(int)((Math.random()*100)+30));
						f1.setLocation((int)(Math.random()*getWidth()), (int)(Math.random()*getHeight()));
						
						
					}
			
				});
	
	/*
	 * Since I made the Fish extend JButtons, we can add ActionListeners to them so that they make a JPanel that pops uo that says "Congrats!" or something like that
	 * Then, I would like for them to delete themselves so that they cant be clicked on again
	 * 
	 * OR
	 * 
	 * We could make a cursor object, that they control with arrow keys, and if they press enter and are over the fish, then it pops up with the message. 
	 * That would mean that we have to add a timer to the class, so we could control the speed of the cursor, and also check the location if it overlaps with
	 * a fish when they press enter. Much like the Pong project. It would be harder, but it would make it look better.
	 */
	}
	public void actionPerformed(ActionEvent e) 
	{
		
		
	}

}
