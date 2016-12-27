package jframe;
import javax.swing.JFrame;

public class JanelaPadrao extends JFrame{
	
	public JanelaPadrao(){
		
		setResizable(false);
		setSize(900, 600);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setVisible(true);
	}
}
