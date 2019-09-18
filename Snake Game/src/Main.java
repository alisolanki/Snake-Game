
import javax.swing.JFrame;

public class Main {
	
	public Main() {
		
		JFrame frame = new JFrame();
		Gamepanel gamepanel = new Gamepanel();
		
		frame.add(gamepanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Snake Game ~ Ali Solanki");
		
		try {
			frame.wait(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		
		new Main();
		
	}
}
