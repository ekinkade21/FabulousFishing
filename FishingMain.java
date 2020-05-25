import java.awt.CardLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FishingMain extends JFrame
{
	public FishingMain()
	{
		this.setBounds(10,10,1000,800);
		this.setTitle("Fabulous Fishing");
		this.setResizable(false);
		
		JPanel overall = new JPanel();
		
		CardLayout cl = new CardLayout();
		overall.setLayout(cl);
		
		JPanel startScreen = new JPanel();
		startScreen.setSize(1000, 800);
		startScreen.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		JLabel title = new JLabel("Welcome to Fabulous Fishing!!");
		startScreen.add(title,gbc);
		
		gbc.gridx++;
		JButton startButton = new JButton("Start");
		
		startButton.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					cl.show(overall, "Pond");
				
				}
				
			});
		
		startScreen.add(startButton,gbc);
	
		JPanel pondScreen = new Pond(cl, overall);
		
		
		
		overall.add(startScreen, "Start");
		overall.add(pondScreen, "Pond");
		
		cl.show(overall,"Start");
		
		this.add(overall);
	
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	
	public static void main(String[] args) 
	{
		new FishingMain();

	}
}
