import javax.swing.JFrame;
public class Game{
	public static void main(String[] args){
		JFrame window = new JFrame("		S H O O T	O U T		");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		window.setContentPane(new GamePanel()); 

		window.pack();
		window.setVisible(true);
	}
}