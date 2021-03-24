package extra_Cred;

//Jacob Vaught
//Due-10-05-2020
//Date-10-07-2020
//draws a weird picture

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;

public class Extra_Credit_02 extends JFrame {
//Naming My constants
	public static final int CENTER_X=200;
	public static final int CENTER_Y=200;
	public static final int DECAGON_LENGTH_OF_EACH_SIDE=100;
	public static final int DECAGON_SIDES=10;
	public static final int NUMBER_2=2;
	public static final int CIRCLE_1_LENGTH=190;
	public static final int CIRCLE_1_HEIGHT=190;
	public static final int CIRCLE_1_X=105;
	public static final int CIRCLE_1_Y=105;
	public static final int NONAGON_LENGTH_OF_EACH_SIDE=94;
	public static final int NONAGON_SIDES=9;
	public static final int CIRCLE_2_LENGTH=176;
	public static final int CIRCLE_2_HEIGHT=176;
	public static final int CIRCLE_2_X=112;
	public static final int CIRCLE_2_Y=112;
	public static final int OCTAGON_LENGTH_OF_EACH_SIDE=88;
	public static final int OCTAGON_SIDES=8;
	public static final int CIRCLE_3_LENGTH=162;
	public static final int CIRCLE_3_HEIGHT=162;
	public static final int CIRCLE_3_X=119;
	public static final int CIRCLE_3_Y=119;
	public static final int SEPTAGON_LENGTH_OF_EACH_SIDE=80;
	public static final int SEPTAGON_SIDES=7;
	public static final int CIRCLE_4_LENGTH=144;
	public static final int CIRCLE_4_HEIGHT=144;
	public static final int CIRCLE_4_X=128;
	public static final int CIRCLE_4_Y=128;
	public static final int HEXAGON_LENGTH_OF_EACH_SIDE=72;
	public static final int HEXAGON_SIDES=6;
	public static final int CIRCLE_5_LENGTH=124;
	public static final int CIRCLE_5_HEIGHT=124;
	public static final int CIRCLE_5_X=138;
	public static final int CIRCLE_5_Y=138;
	public static final int PENTAGON_LENGTH_OF_EACH_SIDE=61;
	public static final int PENTAGON_SIDES=5;
	public static final int CIRCLE_6_LENGTH=98;
	public static final int CIRCLE_6_HEIGHT=98;
	public static final int CIRCLE_6_X=151;
	public static final int CIRCLE_6_Y=151;
	public static final int SQUARE_LENGTH_OF_EACH_SIDE=48;
	public static final int SQUARE_SIDES=4;
	public static final int CIRCLE_7_LENGTH=66;
	public static final int CIRCLE_7_HEIGHT=66;
	public static final int CIRCLE_7_X=167;
	public static final int CIRCLE_7_Y=167;
	public static final int TRIANGLE_LENGTH_OF_EACH_SIDE=33;
	public static final int TRIANGLE_SIDES=3;	
	
	
	private static final long serialVersionUID = 0;

	public Extra_Credit_02() {
		super();
		this.setTitle("EXTRA CREDIT 02");
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}//end bracket of constructor

	public static void main(String[]args) {
		Extra_Credit_02 hf = new Extra_Credit_02();
		hf.setVisible(true);
	}//ending bracket of method main
	
	public void paint(Graphics paint_Function) {
	
		Color Indigo = new Color(75, 0, 130);
		Color Violet = new Color(143, 0, 255);
		
		
		//DRAWING BLACK DECAGON
		//iNITIALIZING
		Polygon decagon = new Polygon();
        //Finding points of polygon
    	for (int i = 0; i < DECAGON_SIDES; i++) {
    		decagon.addPoint((int) (
    			CENTER_X + DECAGON_LENGTH_OF_EACH_SIDE * Math.cos(i * NUMBER_2 * Math.PI / DECAGON_SIDES)),(int) (
    			CENTER_Y + DECAGON_LENGTH_OF_EACH_SIDE * Math.sin(i * NUMBER_2 * Math.PI / DECAGON_SIDES)));
    	//Set Polygon Color
    	paint_Function.setColor(Color.BLACK);
    	//Fill Polygon
    	paint_Function.fillPolygon(decagon);
    	//closing bracket for the for statement
    	}
    	
    	//DRAWING PINK CIRCLE
    	paint_Function.setColor(Color.PINK);
    	paint_Function.fillOval(CIRCLE_1_X, CIRCLE_1_Y, CIRCLE_1_LENGTH , CIRCLE_1_HEIGHT);
    	
    	//DRAWING VIOLET NONAGON
    	//iNITIALIZING
    	Polygon nonagon = new Polygon();
    	//Finding points of polygon
    	for (int i = 0; i < NONAGON_SIDES; i++) {
    		nonagon.addPoint((int) (
    			CENTER_X + NONAGON_LENGTH_OF_EACH_SIDE * Math.cos(i * NUMBER_2 * Math.PI / NONAGON_SIDES)),(int) (
    			CENTER_Y + NONAGON_LENGTH_OF_EACH_SIDE * Math.sin(i * NUMBER_2 * Math.PI / NONAGON_SIDES)));
    	    //Set Polygon Color
    	    paint_Function.setColor(Violet);
    	    //Fill Polygon
    	    paint_Function.fillPolygon(nonagon);
    	    //closing bracket for the for statement
    	    	}
    	    	
    	    //DRAWING PINK CIRCLE
    	paint_Function.setColor(Color.PINK);
    	paint_Function.fillOval(CIRCLE_2_X, CIRCLE_2_Y, CIRCLE_2_LENGTH , CIRCLE_2_HEIGHT);
    	    	
    	//DRAWING VIOLET OCTAGON
    	//iNITIALIZING
    	Polygon octagon = new Polygon();
    	//Finding points of polygon
    	for (int i = 0; i < OCTAGON_SIDES; i++) {
    		octagon.addPoint((int) (
    			CENTER_X + OCTAGON_LENGTH_OF_EACH_SIDE * Math.cos(i * NUMBER_2 * Math.PI / OCTAGON_SIDES)),(int) (
    			CENTER_Y + OCTAGON_LENGTH_OF_EACH_SIDE * Math.sin(i * NUMBER_2 * Math.PI / OCTAGON_SIDES)));
    	    //Set Polygon Color
    	    paint_Function.setColor(Indigo);
    	    //Fill Polygon
    	    paint_Function.fillPolygon(octagon);
    	    //closing bracket for the for statement
    	    	}	
	    
    //DRAWING PINK CIRCLE
	paint_Function.setColor(Color.PINK);
	paint_Function.fillOval(CIRCLE_3_X, CIRCLE_3_Y, CIRCLE_3_LENGTH , CIRCLE_3_HEIGHT);
	
	
	//DRAWING BLUE SEPTAGON
	//iNITIALIZING
	Polygon septagon = new Polygon();
	//Finding points of polygon
	for (int i = 0; i < SEPTAGON_SIDES; i++) {
		septagon.addPoint((int) (
			CENTER_X + SEPTAGON_LENGTH_OF_EACH_SIDE * Math.cos(i * NUMBER_2 * Math.PI / SEPTAGON_SIDES)),(int) (
			CENTER_Y + SEPTAGON_LENGTH_OF_EACH_SIDE * Math.sin(i * NUMBER_2 * Math.PI / SEPTAGON_SIDES)));
	    //Set Polygon Color
	    paint_Function.setColor(Color.BLUE);
	    //Fill Polygon
	    paint_Function.fillPolygon(septagon);
	    //closing bracket for the for statement
	    	}	
    
//DRAWING PINK CIRCLE
paint_Function.setColor(Color.PINK);
paint_Function.fillOval(CIRCLE_4_X, CIRCLE_4_Y, CIRCLE_4_LENGTH , CIRCLE_4_HEIGHT); 


//DRAWING GREEN HEXAGON
//iNITIALIZING
Polygon hexagon = new Polygon();
//Finding points of polygon
for (int i = 0; i < HEXAGON_SIDES; i++) {
	hexagon.addPoint((int) (
		CENTER_X + HEXAGON_LENGTH_OF_EACH_SIDE * Math.cos(i * NUMBER_2 * Math.PI / HEXAGON_SIDES)),(int) (
		CENTER_Y + HEXAGON_LENGTH_OF_EACH_SIDE * Math.sin(i * NUMBER_2 * Math.PI / HEXAGON_SIDES)));
    //Set Polygon Color
    paint_Function.setColor(Color.green);
    //Fill Polygon
    paint_Function.fillPolygon(hexagon);
    //closing bracket for the for statement
    	}	

//DRAWING PINK CIRCLE
paint_Function.setColor(Color.PINK);
paint_Function.fillOval(CIRCLE_5_X, CIRCLE_5_Y, CIRCLE_5_LENGTH , CIRCLE_5_HEIGHT); 


//DRAWING YELLOW PENTAGON
//iNITIALIZING
Polygon pentagon = new Polygon();
//Finding points of polygon
for (int i = 0; i < PENTAGON_SIDES; i++) {
	pentagon.addPoint((int) (
		CENTER_X + PENTAGON_LENGTH_OF_EACH_SIDE * Math.cos(i * NUMBER_2 * Math.PI / PENTAGON_SIDES)),(int) (
		CENTER_Y + PENTAGON_LENGTH_OF_EACH_SIDE * Math.sin(i * NUMBER_2 * Math.PI / PENTAGON_SIDES)));
  //Set Polygon Color
  paint_Function.setColor(Color.YELLOW);
  //Fill Polygon
  paint_Function.fillPolygon(pentagon);
  //closing bracket for the for statement
  	}	

//DRAWING PINK CIRCLE
paint_Function.setColor(Color.PINK);
paint_Function.fillOval(CIRCLE_6_X, CIRCLE_6_Y, CIRCLE_6_LENGTH , CIRCLE_6_HEIGHT); 


//DRAWING ORANGE SQUARE
//iNITIALIZING
Polygon square = new Polygon();
//Finding points of polygon
for (int i = 0; i < SQUARE_SIDES; i++) {
	square.addPoint((int) (
		CENTER_X + SQUARE_LENGTH_OF_EACH_SIDE * Math.cos(i * NUMBER_2 * Math.PI / SQUARE_SIDES)),(int) (
		CENTER_Y + SQUARE_LENGTH_OF_EACH_SIDE * Math.sin(i * NUMBER_2 * Math.PI / SQUARE_SIDES)));
//Set Polygon Color
paint_Function.setColor(Color.ORANGE);
//Fill Polygon
paint_Function.fillPolygon(square);
//closing bracket for the for statement
	}	

//DRAWING PINK CIRCLE
paint_Function.setColor(Color.PINK);
paint_Function.fillOval(CIRCLE_7_X, CIRCLE_7_Y, CIRCLE_7_LENGTH , CIRCLE_7_HEIGHT); 

//DRAWING RED TRIANGLE
//iNITIALIZING
Polygon triangle = new Polygon();
//Finding points of polygon
for (int i = 0; i < TRIANGLE_SIDES; i++) {
	triangle.addPoint((int) (
		CENTER_X + TRIANGLE_LENGTH_OF_EACH_SIDE * Math.cos(i * NUMBER_2 * Math.PI / TRIANGLE_SIDES)),(int) (
		CENTER_Y + TRIANGLE_LENGTH_OF_EACH_SIDE * Math.sin(i * NUMBER_2 * Math.PI / TRIANGLE_SIDES)));
//Set Polygon Color
paint_Function.setColor(Color.RED);
//Fill Polygon
paint_Function.fillPolygon(triangle);
//closing bracket for the for statement
}
    //closing bracket for Graphics Function
	}
//ending bracket of class
}


   
