import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Driver extends JPanel implements ActionListener{
	
	

	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 1000, 1000);
	//	rings(0,0, 100, g);
	//	squares(300,300, 100, g);
		donut(400,400, 0,200, g);
		clover(200, 200, 100, g);
	}
	
	
	public void rings(int x, int y, int width, Graphics g) {
		
		if(width>10) {
			int red = (int)(Math.random()*256);
			int gr = (int)(Math.random()*256);
			int bl = (int)(Math.random()*256);
			
			g.setColor(new Color(red,gr,bl));
			g.drawOval(x, y, width, width);
			
			//recursive call to rings
			//how do the parameters change per method call?
			rings( x+2, y+2, width - 4,g);
			
			
			
		}
		
	}
	

	
	public void clover(int x, int y, int width, Graphics g) {
		g.setColor(Color.blue);
		if(width>50) {
			g.drawOval(x, y, width, width);
		}
				
	}
	
	public void snowFlake(int len, int x1, int y1, int x2, int y2, Graphics g) {
	
	}
	
	
	public void squares(int x, int y, int width, Graphics g) {
		if(width>2) {
			g.setColor(Color.blue);
			g.fillRect(x, y, width, width);
			
			//up
			squares(x+width/3, y-2*width/3, width/3, g);
			
			//left
			squares(x-2*width/3,y+width/3 , width/3, g);
				
			
		}
	}
	
	
	int red=0, green=200, blue=100;
	public void donut(int x, int y, int angle, int width, Graphics g) {
		
		if(angle<360) {
			int red = (int)(Math.random()*256);
			int gr = (int)(Math.random()*256);
			int bl = (int)(Math.random()*256);
			g.setColor(new Color(0,green++%256,blue++%256));
		
			int newX, newY;
			newX = (int)(Math.cos(angle)*width)+width;
			newY = (int)(Math.sin(angle)*width)+width;
			g.drawOval(newX, newY, width*2, width*2);
			
			donut(x,y,angle+1, width, g);
		}
		
		
	}
	
	public void spiral(int x, int y, int angle, int width, Graphics g) {
		
	}
	
	public void binTree(int x1,  int y1, int x2, int y2, int len, Graphics g) {
		
	}
	
	
	
	
	public static void main(String[] arg) {
		
		//find a way to run the constructor of the Driver class
		Driver d  = new Driver(); //will this invoke a constructor?
		

	}	
	
	//1) add a Driver constructor
		public Driver() {
			JFrame frame = new JFrame("ArrayList stuff");
			frame.setSize(800,600);
			frame.add(this);
			
			//this part makes sure the x button closes the program
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			t.start();
			//make the frame show up
			frame.setVisible(true);
					
		}
	Timer t = new Timer(100, this);
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
	}
}



