import java.awt.CardLayout;
import java.awt.Color;
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
		
		Fish f1 = new Fish();
		f1.setLocation((int)Math.random()*this.getWidth(), (int)Math.random()*this.getHeight());
		this.add(f1);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		
		
	}

}
