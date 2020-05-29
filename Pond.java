import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class Pond extends JPanel 
{
	private int numCaught;
	
	
	
	public Pond(CardLayout cl,JPanel containedIn)
	{
		
		this.setSize(1000, 800);
		this.setLayout(null);
		this.setBackground(Color.CYAN);
		
		JLabel score = new JLabel("Fish Caught: "+numCaught);
		score.setBounds(750,10,225,40);
		score.setFont(new Font("Serif", Font.PLAIN, 30));
		add(score);
		
		
		ImageIcon dis = new ImageIcon("FishPic.png");
		
		/*
		 *  I am trying to make a fish that is a random size within reason, and a random location, without getting out of bounds
		 *  right now I have it so the fish's size is determined in the Fish class when a fish object is created. But rn I am determining the location 
		 *  of it in this class.
		 *  I was planning on adding 3 fish initially.
		 */

		Fish f1 = new Fish();
		f1.setLocation((int)(Math.random()*this.getWidth()), (int)(Math.random()*this.getHeight())); 
		
		f1.setIcon(new ImageIcon(dis.getImage().getScaledInstance(f1.getWidth(), f1.getHeight(), Image.SCALE_SMOOTH)));
		
		
		add(f1);
		f1.addActionListener(new ActionListener()
				{

					public void actionPerformed(ActionEvent e) {
						
						numCaught++;
						score.setText("Fish Caught: "+numCaught);
						
						if (numCaught>=10)
						{
							numCaught=0;
							score.setText("Fish Caught: 0");
							cl.show(containedIn,"Congrats");
						}
						
						f1.setSize((int)((Math.random()*200)+30),(int)((Math.random()*100)+30));
						f1.setLocation((int)(Math.random()*getWidth()), (int)(Math.random()*getHeight()));
						f1.setIcon(new ImageIcon(dis.getImage().getScaledInstance(f1.getWidth(), f1.getHeight(), Image.SCALE_SMOOTH)));
						
					}
			
				});
		
		
		
		Fish f2 = new Fish();
		f2.setLocation((int)(Math.random()*this.getWidth()), (int)(Math.random()*this.getHeight())); 
		
		f2.setIcon(new ImageIcon(dis.getImage().getScaledInstance(f2.getWidth(), f2.getHeight(), Image.SCALE_SMOOTH)));
		
		add(f2);
		f2.addActionListener(new ActionListener()
				{

					public void actionPerformed(ActionEvent e) {
						
						numCaught++;
						score.setText("Fish Caught: "+numCaught);
						
						if (numCaught>=10)
						{
							numCaught=0;
							score.setText("Fish Caught: 0");
							cl.show(containedIn,"Congrats");
						}
						
						f2.setSize((int)((Math.random()*200)+30),(int)((Math.random()*100)+30));
						f2.setLocation((int)(Math.random()*getWidth()), (int)(Math.random()*getHeight()));
						f2.setIcon(new ImageIcon(dis.getImage().getScaledInstance(f2.getWidth(), f2.getHeight(), Image.SCALE_SMOOTH)));
						
					}
			
				});
		
		
		Fish f3 = new Fish();
		f3.setLocation((int)(Math.random()*this.getWidth()), (int)(Math.random()*this.getHeight()));
		
		f3.setIcon(new ImageIcon(dis.getImage().getScaledInstance(f3.getWidth(), f3.getHeight(), Image.SCALE_SMOOTH)));
		
		add(f3);
		f3.addActionListener(new ActionListener()
				{

					public void actionPerformed(ActionEvent e) {
						
						numCaught++;
						score.setText("Fish Caught: "+numCaught);
						
						if (numCaught>=10)
						{
							numCaught=0;
							score.setText("Fish Caught: 0");
							cl.show(containedIn,"Congrats");
						}
						
						f3.setSize((int)((Math.random()*200)+30),(int)((Math.random()*100)+30));
						f3.setLocation((int)(Math.random()*getWidth()), (int)(Math.random()*getHeight()));
						f3.setIcon(new ImageIcon(dis.getImage().getScaledInstance(f3.getWidth(), f3.getHeight(), Image.SCALE_SMOOTH)));
						
					}
			
				});
		
		
		
		/*
		 * Added an actionListener to the fish that causes it to change location and size according to initial bounds
		 * Need to add code to make sure it doesn't stretch off of the screen
		 * If you want, you can add code to change the card displayed or create some sort of integer that increments to count the number of fish caught
		 * You could make it so that once a certain amount of fish are caught, the congratulations screen pops up.
		 * I'm not sure how to do it, but we need to repaint the object so that it fills the new bounds (i.e. if the previous fish was 50x50 
		 * and the new one is 100x100, only 50x50 out of the total area is painted.)
		 * 
		 * I think just using an actionListener would be easier than a cursor, but either would work; it's just preference
		 * -Casey
		 */
		
		
	
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
	

}