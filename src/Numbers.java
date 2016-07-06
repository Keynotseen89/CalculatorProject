import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class Numbers extends MyCalculator implements ActionListener
{
	

	public  void actionPerformed(ActionEvent event){
		JButton scr = (JButton) event.getSource();									//used for when a Button is clicked 
		
		if(scr.equals(numberButton1)){												//If source is equal to Button Number One										
			if(opChosen == false){													//Then if operation is not choosen
				if(tempString1 == null){											//Then if Temp String is empty 
					tempString1 = "1";												//Make TempString into One
					}else{
						tempString1 = tempString1 + "1";											//If same Button clicked again it adds 1 next to the other number
						}
			}else{
				if(tempString2 == null){											//Then if Temp String is empty 
					tempString2 = "1";												//Make TempString into One
					}else{
						tempString2 = tempString2 + "1";											//If same Button clicked again it adds 1 next to the other number
						}
			}
		}
		
		if(scr.equals(numberButton2)){												//If source is equal to Button Number One										
			if(opChosen == false){													//Then if operation is not choosen
				if(tempString1 == null){											//Then if Temp String is empty 
					tempString1 = "2";												//Make TempString into One
					}else{
						tempString1 = tempString1 + "2";											//If same Button clicked again it adds 1 next to the other number
						}
			}else{
				if(tempString2 == null){											//Then if Temp String is empty 
					tempString2 = "2";												//Make TempString into One
					}else{
						tempString2 = tempString2 + "2";											//If same Button clicked again it adds 1 next to the other number
						}
			}
		}
		if(scr.equals(numberButton3)){												//If source is equal to Button Number One										
			if(opChosen == false){													//Then if operation is not choosen
				if(tempString1 == null){											//Then if Temp String is empty 
					tempString1 = "3";												//Make TempString into One
					}else{
						tempString1 = tempString1 + "3";											//If same Button clicked again it adds 1 next to the other number
						}
			}else{
				if(tempString2 == null){											//Then if Temp String is empty 
					tempString2 = "3";												//Make TempString into One
					}else{
						tempString2 = tempString2 + "3";											//If same Button clicked again it adds 1 next to the other number
						}
			}
		}
		if(scr.equals(numberButton4)){												//If source is equal to Button Number One										
			if(opChosen == false){													//Then if operation is not choosen
				if(tempString1 == null){											//Then if Temp String is empty 
					tempString1 = "4";												//Make TempString into One
					}else{
						tempString1 = tempString1 + "4";											//If same Button clicked again it adds 1 next to the other number
						}
			}else{
				if(tempString2 == null){											//Then if Temp String is empty 
					tempString2 = "4";												//Make TempString into One
					}else{
						tempString2 = tempString2 + "4";											//If same Button clicked again it adds 1 next to the other number
						}
			}
		}
		if(scr.equals(numberButton5)){												//If source is equal to Button Number One										
			if(opChosen == false){													//Then if operation is not choosen
				if(tempString1 == null){											//Then if Temp String is empty 
					tempString1 = "5";												//Make TempString into One
					}else{
						tempString1 = tempString1 + "5";											//If same Button clicked again it adds 1 next to the other number
						}
			}else{
				if(tempString2 == null){											//Then if Temp String is empty 
					tempString2 = "5";												//Make TempString into One
					}else{
						tempString2 = tempString2 + "5";											//If same Button clicked again it adds 1 next to the other number
						}
			}
		}
		if(scr.equals(numberButton6)){												//If source is equal to Button Number One										
			if(opChosen == false){													//Then if operation is not choosen
				if(tempString1 == null){											//Then if Temp String is empty 
					tempString1 = "6";												//Make TempString into One
					}else{
						tempString1 = tempString1 + "6";											//If same Button clicked again it adds 1 next to the other number
						}
			}else{
				if(tempString2 == null){											//Then if Temp String is empty 
					tempString2 = "6";												//Make TempString into One
					}else{
						tempString2 = tempString2 + "6";											//If same Button clicked again it adds 1 next to the other number
						}
			}
		}
		if(scr.equals(numberButton7)){												//If source is equal to Button Number One										
			if(opChosen == false){													//Then if operation is not choosen
				if(tempString1 == null){											//Then if Temp String is empty 
					tempString1 = "7";												//Make TempString into One
					}else{
						tempString1 = tempString1 + "7";											//If same Button clicked again it adds 1 next to the other number
						}
			}else{
				if(tempString2 == null){											//Then if Temp String is empty 
					tempString2 = "7";												//Make TempString into One
					}else{
						tempString2 = tempString2 + "7";											//If same Button clicked again it adds 1 next to the other number
						}
			}
		}
		if(scr.equals(numberButton8)){												//If source is equal to Button Number One										
			if(opChosen == false){													//Then if operation is not choosen
				if(tempString1 == null){											//Then if Temp String is empty 
					tempString1 = "8";												//Make TempString into One
					}else{
						tempString1 = tempString1 + "8";											//If same Button clicked again it adds 1 next to the other number
						}
			}else{
				if(tempString2 == null){											//Then if Temp String is empty 
					tempString2 = "8";												//Make TempString into One
					}else{
						tempString2 = tempString2 + "8";											//If same Button clicked again it adds 1 next to the other number
						}
			}
		}
		if(scr.equals(numberButton9)){												//If source is equal to Button Number One										
			if(opChosen == false){													//Then if operation is not choosen
				if(tempString1 == null){											//Then if Temp String is empty 
					tempString1 = "9";												//Make TempString into One
					}else{
						tempString1 = tempString1 + "9";											//If same Button clicked again it adds 1 next to the other number
						}
			}else{
				if(tempString2 == null){											//Then if Temp String is empty 
					tempString2 = "9";												//Make TempString into One
					}else{
						tempString2 = tempString2 + "9";											//If same Button clicked again it adds 1 next to the other number
						}
			}
		}
		if(scr.equals(numberButton)){												//If source is equal to Button Number One										
			if(opChosen == false){													//Then if operation is not choosen
				if(tempString1 == null){											//Then if Temp String is empty 
					tempString1 = "0";												//Make TempString into One
					}else{
						tempString1 = tempString1 + "0";											//If same Button clicked again it adds 1 next to the other number
						}
			}else{
				if(tempString2 == null){											//Then if Temp String is empty 
					tempString2 = "0";												//Make TempString into One
					}else{
						tempString2 = tempString2 + "0";											//If same Button clicked again it adds 1 next to the other number
						}
			}
		}
		if(scr.equals(decimalButton)){												//If source is equal to Button Number One										
			if(opChosen == false){													//Then if operation is not choosen
				if(tempString1 == null){											//Then if Temp String is empty 
					tempString1 = "0.";												//Make TempString into One
					}else
						if(tempString1 != null){
							if(tempString1.contains(".")){
								System.out.println("You already have a decimal point!");
							}else{
								tempString1 += ".";
							}
						}
			}else{
				if(tempString2 == null){											//Then if Temp String is empty 
					tempString2 = "0.";												//Make TempString into One
					}else
						if(tempString2 != null ){
							if(tempString2.contains(".")){
								System.out.println("Again you already have a decimal point!");
							}else{
								tempString2 += ".";
							}
						}
					
					}
			}
		
			//This if statement is used for running negativeButton
			if(scr.equals(negativeButton)){
				if(opChosen == false){
					if(tempString1 == null){
						tempString1 = "-";
					}else
						if(tempString1 != null && tempString1.startsWith("-")){
							tempString1 = tempString1.substring(1);
						}else{
							tempString1 = "-" + tempString1;
				}
			}else{
				if(tempString2 == null){
					tempString2 = "-";
				}else
					if(tempString2 != null && tempString2.startsWith("-")){
						tempString2 = tempString2.substring(1);
					}else{
						tempString2 = "-" + tempString2;
					}
			}
		}//end of negative Button if statements 
			
		if(scr.equals(backSpaceButton)){
			if(opChosen == false){
				if(tempString1 == null){
					System.out.println("CAN'T DELETE NOTHING!!!");
				}else{
					tempString1 = tempString1.substring(0, tempString1.length()-1);
				}
			}else{
				if(tempString2 == null){
					System.out.println("CAN'T DELETE NOTHING!!!");
				}else{
					tempString2 = tempString2.substring(0, tempString2.length()-1);
				}
			}
		}
			
		if(equalsClicked == false){
			if(opChosen == false){
				outputTextArea.setText(tempString1);
			}else{
				outputTextArea.setText(tempString2);
			}
		}
	
	}//end of actionPerformed code
}
