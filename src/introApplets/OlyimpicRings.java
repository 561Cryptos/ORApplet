package introApplets;
import javax.swing.JApplet;
import java.awt.Color;
import java.awt.Graphics;


public class OlyimpicRings extends JApplet
{
	public void paint(Graphics canvas)
	{
		
			canvas.drawOval(40, 1000, 40, 40);
			canvas.setColor(Color.yellow);
			canvas.drawOval(50, 50, 40, 40);
			canvas.setColor(Color.blue);
			canvas.drawOval(80, 50, 40, 40);
			canvas.setColor(Color.green);
			canvas.drawOval(30, 80, 40, 40);
			canvas.setColor(Color.red);
			canvas.drawOval(60, 80, 40, 40);
			canvas.setColor(Color.orange);
			
			
		
		
		

	}


}
