import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

//This Class is meant to do the Calculation for the MyCalculator main class


public class Calculation  extends Numbers implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void actionPerformed(ActionEvent evt){
		JButton scr = (JButton) evt.getSource();									//used for When a Button is pressed 
		
		if(scr.equals(plusButton)){
			if(tempString1 == null){
				System.out.println("Choose your numbers First!");
			}else
				if(tempString1 != null && tempString2 == null){
					opChosen = true;										//If plus Button chosen 
					operationChar = '+';									//Changes operationChar to the plus sign
				}else
					if(tempString1 != null && tempString2 != null){
						System.out.println("Two operation only!");	
					}
			
			
		}
		
		if(scr.equals(minusButton)){
			if(tempString1 == null){
				System.out.println("Choose your numbers First!");
			}else
				if(tempString1 != null && tempString2 == null){
					opChosen = true;										//If minus Button chosen 
					operationChar = '-';									//Changes operationChar to the minus sign
				}else
					if(tempString1 != null && tempString2 != null){
						System.out.println("Two operation only!");	
					}
			
			
		}
		if(scr.equals(multiplicationButton)){
			if(tempString1 == null){
				System.out.println("Choose your numbers First!");
			}else
				if(tempString1 != null && tempString2 == null){
					opChosen = true;										//If multiplication Button chosen 
					operationChar = '*';									//Changes operationChar to the * sign
				}else
					if(tempString1 != null && tempString2 != null){
						System.out.println("Two operation only!");	
					}
			
			
		}
		if(scr.equals(divisionButton)){
			if(tempString1 == null){
				System.out.println("Choose your numbers First!");
			}else
				if(tempString1 != null && tempString2 == null){
					opChosen = true;										//If division Button chosen 
					operationChar = '/';									//Changes operationChar to the '/' sign
				}else
					if(tempString1 != null && tempString2 != null){
						System.out.println("Two operation only!");	
					}
			
			
		}
		
		if(scr.equals(signEquals)){
			if(tempString1 == null){
				System.out.println("Choose your numbers First!");
			}else
				if(tempString1 != null && tempString2 == null){
					System.out.println("Choose BOTH numbers First!");
				}
			
			if(tempString1 != null && tempString2 != null){
				double d1 = 0.0, d2 = 0.0;
				
				d1 = Double.parseDouble(tempString1);											//Changes the tempString1 into Double 
				d2 = Double.parseDouble(tempString2);											//changes the tempString2 into Double for Calculation
				
				
				//switch statement used for Calculation when choosing an opeation 
				switch(operationChar){
				case '+':
					answerDouble = d1 + d2;
					break;
				case '-':
					answerDouble = d1 - d2;
					break;
				case '*':
					answerDouble = d1 * d2;
					break;
				case '/':
					answerDouble = d1 / d2;
					break;
				}
				answerString = Double.toString(answerDouble);									//changes the Answer Double into a String to be displayed 
				outputTextArea.setText(answerString);
				if(operationChar == '/' && d2 == 0.0){
					outputTextArea.setText("DIVIDE BY 0 ERROR");
				}
			}
			
		}
		
		//Clears everything on the Calculator
		if(scr.equals(resetButton)){	
			tempString1 = null;														//Makes first Number String Null									
			tempString2 = null;														//Makes Second Number String Null
			equalsClicked = false;													//Sets Equals Click back to Null
			opChosen = false;														//Sets opChosen Click back to Null
			operationChar = ' ';													//Sets the Car operation +,-, /, ext. back to Empty
			answerString = null;													//Sets the Answer String back to Null so it'll be empty
			outputTextArea.setText(null);											//Sets the Text Area back to Empty to other equation 
			
		}
	
	
	}//end of actionPerformed Code
		

}//end of Calculation Class
