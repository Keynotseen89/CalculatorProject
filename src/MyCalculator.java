//Project // Folder:CalculatorProject
//Name: Quinatzin Sintora
//Class: MyCalculator
//Date: 6/12/2016
/* Project Description : This Project is meant for a basic calculator GUI.  This GUI is meant to do basic + , - , and * calculation.
 * While this basic calculation is being done there well be different class for the operation not all in this main  class.
 * That is what this Project is meant to do 
 */

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
//import java.awt.event.*;

import javax.swing.JButton;											//Needed for JButton 
import javax.swing.JFrame;											//JFrame needed for GUI system
import javax.swing.JPanel;
import javax.swing.JTextArea;



public class MyCalculator extends JFrame 
{
	
	
static public	JButton numberButton  = new JButton ("0");					//Button Number Zero
static public	JButton numberButton1 = new JButton ("1");					//Button Number One
static public	JButton numberButton2 = new JButton ("2");					//Button Number Two
static public	JButton numberButton3 = new JButton ("3");					//Button Number Three
static public	JButton numberButton4 = new JButton ("4");					//Button Number Four
static public	JButton numberButton5 = new JButton ("5");					//Button Number Five
static public	JButton numberButton6 = new JButton ("6");					//Button Number Six
static public	JButton numberButton7 = new JButton ("7");					//Button Number Seven
static public	JButton numberButton8 = new JButton ("8");					//Button Number Eight
static public	JButton numberButton9 = new JButton ("9");					//Button Number Nine
	
static public	double answerDouble = 0.0;
static public boolean equalsClicked = false, opChosen = false;
static char operationChar = ' ';											//operationChar is empty 													
	
static public String tempString1, tempString2, answerString;				   		 //Used to retrieve string 
	
	
static public	JButton signEquals = new JButton ("=");						//Equals Button for equation 
static public	JButton plusButton = new JButton ("+");						//Addition button 
static public	JButton minusButton = new JButton ("-");					//Minus button
static public	JButton divisionButton = new JButton ("/");					//Division Button
static public	JButton multiplicationButton = new JButton ("*");			//Times Button
static public 	JButton decimalButton = new JButton (".");					//decimal Button for the Calculator
static public 	JButton negativeButton = new JButton ("+/-");				// for negative numbers 
static public	JButton resetButton = new JButton ("C");					//Reset Button
static public 	JButton backSpaceButton = new JButton("Back");				//Deletes your input 


	
static public	JTextArea  outputTextArea = new JTextArea(3,16);				//Used for displaying Solution/answer
	
public	JPanel mainPanel = new JPanel();										//Main Panel for used for other Panels 
public	JPanel topPanel = new JPanel(new GridBagLayout());						//Top Panel used for displaying answer
public	JPanel centerPanel = new JPanel(new GridBagLayout());					//center Panel used for number button
	

	public static void main(String[] args) {
		
			MyCalculator basicGUI = new MyCalculator();
			basicGUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
			basicGUI.setVisible(false);
		
			Numbers n = new Numbers();
			n.setDefaultCloseOperation(EXIT_ON_CLOSE);											//If GUI Pops up you can End it By closing it
			Calculation c = new Calculation(); 												
			c.setDefaultCloseOperation(EXIT_ON_CLOSE);											//Used to End Calculation Class if GUI OPENS

		 
			n.setVisible(false);																//Hides 
			
			//Using the Number class for ActionListener 
			numberButton.addActionListener(n);
			numberButton1.addActionListener(n);
			numberButton2.addActionListener(n);
			numberButton3.addActionListener(n);
			numberButton4.addActionListener(n);
			numberButton5.addActionListener(n);
			numberButton6.addActionListener(n);
			numberButton7.addActionListener(n);
			numberButton8.addActionListener(n);
			numberButton9.addActionListener(n);
			decimalButton.addActionListener(n);
			negativeButton.addActionListener(n);
			backSpaceButton.addActionListener(n);
			
			//Using the Calculation Class for Action Listener
			signEquals.addActionListener(c);
			plusButton.addActionListener(c);
			divisionButton.addActionListener(c);
			multiplicationButton.addActionListener(c);
			resetButton.addActionListener(c);
			minusButton.addActionListener(c);
			
			
	}//end of main Code
	
public MyCalculator()
{
	super("Calculator Project");											//Adds the Title on the Toolbar
	
	designClass();															//Layout for the Button
	setSize(260,275);														//Sets size of Calculator GUI
	setResizable(false);													//Sets Resizable to false
	setVisible(true);														//Makes the GUI visible 
	
}//end of MyCalculator



//Display for GUI with all Buttons
public void designClass()
	{
	
	GridBagConstraints gbc = new GridBagConstraints();								//Needed to organize Layout
	gbc.insets = new Insets(5,5,5,5);												//Spacing the layout 
	
	this.add(mainPanel);															//Adding the Panel for the Button and other stuff
	mainPanel.add(topPanel, BorderLayout.NORTH);														//This adds Top Panel for Calculator answer
	gbc.gridx = 0;
	gbc.gridy = 0;
	
	outputTextArea.setEditable(false);										//does not let you edit TextArea
	topPanel.add(outputTextArea, gbc);										//Set up the TextArea in place

	
	mainPanel.add(centerPanel, BorderLayout.CENTER);						//Center the Button
	
	gbc.gridx = 1;
	gbc.gridy = 1;
	centerPanel.add(numberButton7, gbc);									//adds Number 7
	
	gbc.gridx = 2;
	gbc.gridy = 1;
	centerPanel.add(numberButton8, gbc);									//adds Number 8
	
	gbc.gridx = 3;
	gbc.gridy = 1;
	centerPanel.add(numberButton9, gbc);									//adds Number 9
	
	gbc.gridx = 4;
	gbc.gridy = 1;
	centerPanel.add(resetButton, gbc);										//adds ResetButton
	
	gbc.gridx = 1;
	gbc.gridy = 2;
	centerPanel.add(numberButton4, gbc);									//adds Number 4
	
	gbc.gridx = 2;
	gbc.gridy = 2;
	centerPanel.add(numberButton5, gbc);									//adds Number 5
	
	gbc.gridx = 3;
	gbc.gridy = 2;
	centerPanel.add(numberButton6, gbc);									//adds Number 6
	
	gbc.gridx = 4;
	gbc.gridy = 2;
	centerPanel.add(multiplicationButton, gbc);								//adds Multiplication Button
	
	gbc.gridx = 1;
	gbc.gridy = 3;
	centerPanel.add(numberButton1, gbc);									//Adds Number 1
	
	gbc.gridx = 2;
	gbc.gridy = 3;
	centerPanel.add(numberButton2, gbc);									//adds Number 2 Button
	
	gbc.gridx = 3;
	gbc.gridy = 3;
	centerPanel.add(numberButton3, gbc);									//adds Button number 3
	
	gbc.gridx = 4;
	gbc.gridy = 3;
	centerPanel.add(minusButton, gbc);										///adds MinusButton to the GUI
	
	gbc.gridx = 1;
	gbc.gridy = 4;
	centerPanel.add(numberButton, gbc);										//Adds Button Zero to the GUI
	
	gbc.gridx = 2;
	gbc.gridy = 4;
	centerPanel.add(divisionButton, gbc);									//Adds Division Button to the GUI
		
	gbc.gridx = 3;
	gbc.gridy = 4;
	centerPanel.add(plusButton, gbc);										//Adds PlusButton to the GUI
	
	gbc.gridx = 4;
	gbc.gridy = 4;
	centerPanel.add(decimalButton, gbc);										//Adds EqualsSign Button to the GUI
	
	gbc.gridx = 2;
	gbc.gridy = 5;
	centerPanel.add(backSpaceButton, gbc);
	
	gbc.gridx = 3;
	gbc. gridy = 5;
	centerPanel.add(negativeButton, gbc);										//Adds the +/- JButton
	
	gbc.gridx = 4;
	gbc.gridy = 5;
	centerPanel.add(signEquals, gbc);
	
	}//end of designClass


}//end of code
