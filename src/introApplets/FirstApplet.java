package introApplets;
import java.awt.Graphics;
import javax.swing.JApplet;

public class FirstApplet extends JApplet 
{
	public void paint(Graphics canvas)
	{
		canvas.drawOval(100, 50, 200, 200);
		canvas.fillOval(155, 100, 10, 20);
		canvas.fillOval(230, 100, 10, 20);
		canvas.drawArc(150, 160, 100, 50, 0, 180);
		canvas.drawArc(150, 160, 100, 50, 180, 0);
	}
	
	
	
	

}
