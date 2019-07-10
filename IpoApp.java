/*
Borkowski Michal
GuessApp.java
22-10-2018
*/

import java.long.Math*; //JOptionPane - grey pop up windows
public class GuessApp{
	public static void main(String args[]){

		//variables
		int first;
		int second;
		String message;

		//create objects
		Guess myGuess;
		myGuess=new Guess();

		//inputs
		first=Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter your number"));
		myGuess.setFirst(first);

		//process
		myGuess.compute();

		//outputs
		message=myGuess.getMessage();
		JOptionPane.showMessageDialog(null, message);
	}

}