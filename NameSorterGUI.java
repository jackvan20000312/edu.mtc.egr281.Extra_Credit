package extraCredit04;
//****************************************************************************************
//Author: Jacob Vaught       Modified: 12/09/20
//
//EGR-281  Extra Credit 04   Due: 12/09/20 6:00PM
//****************************************************************************************
//finished coding 12-08-2020  4:25PM

//I Hope You like the GUI.(NameSorterGUI.java) I also made a Console based version.(NameSorter.java) 
//I made the GUI BLUE, CYAN, WHITE, and GRAY.

import java.util.Scanner;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea; 

public class NameSorterGUI  implements ActionListener{    

	public static void main(String[] args) {    
	    new NameSorterGUI();
	}//ending bracket of method main

	static File inputFile=null, outputFile=null;
	static JFrame jFrame = new JFrame("Name Sorter GUI");
	static JMenuBar menuBar;    
	static JMenu fileMenu;    
	static JButton startButton;
	static JMenuItem inputMenuItem, outputMenuItem;    
	static JTextArea inputTextArea;
	static JTextArea outputTextArea; 
	static JLabel inputLabel, outputLabel;
	static JLabel doneLabel;
	static JFileChooser fileChooser=new JFileChooser();    
	static int integer;
	
	NameSorterGUI(){    
		inputMenuItem=new JMenuItem("Open Input File");
		inputMenuItem.addActionListener(this); 
		outputMenuItem=new JMenuItem("Select Output File");
		outputMenuItem.addActionListener(this); 
		
		fileMenu=new JMenu("File");    
		fileMenu.add(inputMenuItem);
		fileMenu.add(outputMenuItem);
		menuBar=new JMenuBar(); 
		menuBar.setBackground(Color.CYAN);
		menuBar.setBounds(0,0,890,20);    
		menuBar.add(fileMenu);              
		inputTextArea=new JTextArea(400,800);    
		inputTextArea.setBounds(0,40,400,800); 
		inputTextArea.setEditable(false);
		outputTextArea=new JTextArea(400,800);    
		outputTextArea.setBounds(490,40,400,800); 
		outputTextArea.setEditable(false);
		inputLabel=new JLabel("INPUT TEXT");
		inputLabel.setBounds(170,20,200,20);
		outputLabel=new JLabel("OUTPUT TEXT");
		outputLabel.setBounds(640,20,200,20);
		outputLabel.setForeground(Color.WHITE);
		inputLabel.setForeground(Color.WHITE);
		doneLabel=new JLabel("Done!");
		doneLabel.setBounds(403,750,90,30);
		doneLabel.setFont(new Font("Arial", Font.BOLD, 30));
		doneLabel.setForeground(Color.WHITE);
		doneLabel.setVisible(false);
		startButton = new JButton("Convert");
		startButton.setBackground(Color.GRAY);
		startButton.setBounds(402, 60, 86, 20);
		startButton.addActionListener(this); 
		
		jFrame.getContentPane().setBackground(Color.BLUE);
		jFrame.add(startButton); 
		jFrame.add(menuBar);    
		jFrame.add(inputTextArea);
		jFrame.add(outputTextArea);
		jFrame.add(doneLabel);
		jFrame.add(inputLabel);
		jFrame.add(outputLabel);
		jFrame.setSize(907,860);    
		jFrame.setLayout(null);    
		jFrame.setVisible(true);    
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}    
	
	public void actionPerformed(ActionEvent e) {    
		
		if(e.getSource()==inputMenuItem){    
			inputFileSelection();
		}//ending bracket of if getSource statement
		
	    if(e.getSource()==outputMenuItem){   
	    	outputFileSelection();
	    }//ending bracket of if getSource statement
	    
	    if(e.getSource()==startButton&&inputFile!=null&&outputFile!=null){   
	    	nameSort();
	    }//ending bracket of if getSource statement
	    
	    if(e.getSource()==startButton&&inputFile==null){   
	    	inputTextArea.setText("ERROR- Open Input File using file menu in top Left Corner of Program");
	    }//ending bracket of if getSource statement
	    
	    if(e.getSource()==startButton&&outputFile==null){   
	    	outputTextArea.setText("ERROR- Select Output File using file menu in top Left Corner of Program");
	    }//ending bracket of if getSource statement
		
	}//ending bracket of method actionPerformed      

	private static void nameSort() {
    	Scanner inputFileScanner = null;
    	PrintWriter outputFileWriter=null;
    	try {
			inputFileScanner = new Scanner(inputFile);
		} catch (FileNotFoundException e1) {
			System.exit(0);
		}//end of catch
    	try {
			outputFileWriter = new PrintWriter(outputFile);
		} catch (FileNotFoundException e2) {
			System.exit(0);
		}//end of catch
    	try{  
    		String firstName = "";
    		String lastName = "";
    		boolean haveFirstName = false;
    		// Get the names
    		//(debugging test) System.out.println("part 1");
    		//(debugging test) System.out.println(inputFile.nextLine());
    		while(inputFileScanner.hasNextLine()){
    			String line = inputFileScanner.nextLine();
    			Scanner lineScanner = new Scanner(line);
    			//(debugging test) System.out.println("part 2");
    			while(lineScanner.hasNext()){
    				if(!haveFirstName){
    					firstName = lineScanner.next();
   						haveFirstName = true;
   					//(debugging test) System.out.println("part 3a");
   					} else {
   						lastName = lineScanner.next();
    					outputFileWriter.println(firstName + " " + lastName);
    					//(debugging test) System.out.println("part 3b");
    					haveFirstName = false;
    				}//ending bracket of else statement
    			}//ending bracket of while loop
   			}//ending bracket of while loop
   			//(debugging test) System.out.println("part 4(or skipped 2-3b)");
   			inputFileScanner.close();
   			outputFileWriter.close();
   			outputTextArea.setText(setTextAreaData(outputFile.getPath()));
   			doneLabel.setVisible(true);
       }catch (Exception e3) {e3.printStackTrace();  } 
	}//ending bracket of method nameSort(Super Important) 
	private static void outputFileSelection() {
        integer=fileChooser.showOpenDialog(jFrame);    
        if(integer==JFileChooser.APPROVE_OPTION){    
            outputFile=fileChooser.getSelectedFile();    
            String filepath=outputFile.getPath();    
            outputTextArea.setText(setTextAreaData(filepath));
        }//ending bracket of if FileChooser statement
	}//ending bracket of method outputFileSelection   
	private static void inputFileSelection() {
		integer = fileChooser.showOpenDialog(jFrame);    
		if(integer==JFileChooser.APPROVE_OPTION){    
	        inputFile=fileChooser.getSelectedFile();    
	        String filepath=inputFile.getPath();    
            inputTextArea.setText(setTextAreaData(filepath));
        }//ending bracket of if FileChooser statement
	}//ending bracket of method inputfileselection   
	private static String setTextAreaData(String filepath) {
        try{  
        	BufferedReader bufferedReader=new BufferedReader(new FileReader(filepath));    
        	String string1="",finalString="";                         
        	while((string1=bufferedReader.readLine())!=null){    
        		finalString+=string1+"\n";    
        	}    
        	bufferedReader.close();
        	return finalString;        
        }catch (Exception ex) {ex.printStackTrace();  }
		return "Error"; 
	}//ending bracket of method setTextAreaData 
}  //ending bracket of class