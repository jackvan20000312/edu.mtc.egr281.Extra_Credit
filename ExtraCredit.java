package Project03;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

//Name: Jacob Vaught
//EGR-281
//Project-03 Draws a Target EXTRA CREDIT
//Just draws a Target
//9-14-2020

public class ExtraCredit extends JFrame {

	private static final long serialVersionUID = 5L;// What Is This Supposed to DO?

	public ExtraCredit() {
		super();
		this.setTitle("EXTRA CREDIT TARGET");
		this.setSize(600,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}//end bracket of constructor

	public static void main(String[]args) {
		ExtraCredit hf = new ExtraCredit();
		hf.setVisible(true);
		
	}//ending bracket of method main
	
	public void paint(Graphics brush) {
		//DRAWS THE RINGS
		brush.setColor(Color.WHITE);
		brush.fillRect(0, 0, 600, 500);
		brush.setColor(Color.BLACK);
		brush.drawOval(10, 31, 420, 420);
		brush.drawOval(30, 51, 380, 380);
		brush.setColor(Color.WHITE);
		brush.drawOval(50, 71, 340, 340);
		brush.setColor(Color.BLACK);
		brush.fillOval(51, 72, 338, 338);
		brush.setColor(Color.WHITE);
		brush.drawOval(70, 91, 300, 300);
		brush.setColor(Color.BLUE);
		brush.fillOval(90, 111, 260, 260);
		brush.setColor(Color.BLACK);
		brush.drawOval(110, 131, 220, 220);
		brush.setColor(Color.RED);
		brush.fillOval(130, 151, 180, 180);
		brush.setColor(Color.BLACK);
		brush.drawOval(130, 151, 180, 180);
		brush.drawOval(150, 171, 140, 140);
		brush.setColor(Color.YELLOW);
		brush.fillOval(170, 191, 100, 100);
		brush.setColor(Color.BLACK);
		brush.drawOval(170, 191, 100, 100);
		brush.drawOval(190, 211, 60, 60);
		brush.drawOval(210, 231, 20, 20);
		//DRAWS THE TEXT
		brush.drawString("X Ring 10 points", 450, 61);
		for (int j = 0; j < 11; j++) {
		int z = 40;
		brush.setColor(Color.BLACK);
		brush.drawString(j+" points", 450, 101+(z*j));	
		}// closing bracket of text

		//DRAWS THE LINEs TO THE TEXT
		for (int i = 0; i < 11; i++) {
		int x = 20;
		int y = 40;
		brush.setColor(Color.BLACK);
		brush.drawLine(445, 51+(y*i), 220, 241+(x*i));	
			
		}// closing bracket of lines
        }//closing bracket for paint
    }//ending bracket of class


