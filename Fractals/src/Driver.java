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
		//rings(0,0, 500, g);
		squares(300,300, 100, g);
	}
	
	
	public void rings(int x, int y, int width, Graphics g) {
		
		if(width>10) {
			
			int red = (int)(Math.random()*256);
			int green = (int)(Math.random()*256);
			int blue = (int)(Math.random()*256);
			g.setColor(  new Color(red, green, blue) );
			
			g.drawOval(x, y, width, width);			
			//recursive step
			//how do the parameters change?
			rings(x+5 , y+5 , width-10 , g);
			
		}
		
	}
	
	public void concentricSquares(int x, int y, int width, Graphics g) {
		g.setColor(Color.blue);
				
	}
	
	public void clover(int x, int y, int width, Graphics g) {
		g.setColor(Color.blue);
				
	}
	
	public void snowFlake(int len, int x1, int y1, int x2, int y2, Graphics g) {
		
	}
	
	
	public void squares(int x, int y, int width, Graphics g) {
		
		if(width>5) {
			
			int red = (int)(Math.random()*256);
			int green = (int)(Math.random()*256);
			int blue = (int)(Math.random()*256);
			g.setColor(  new Color(red, green, blue) );
			
			//each method draws 1 square!
			g.fillRect(x,  y,  width, width);
			
			//recursively call method for the top-center squares
			squares(x + width/3, y - 2*width/3,width/3,g);
			
			//handle down
			
			//left, right, corners
			
		}
		
		
	}
	
	public void donut(int x, int y, int angle, int width, Graphics g) {
		
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
			
			//t.start();
			//make the frame show up
			frame.setVisible(true);
					
		}
	Timer t = new Timer(16, this);
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
	}
}



