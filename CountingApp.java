/*
 *M Borkowski
 *CountingApp.java
 *5 1 2019
 */

 //class + mm +JP
 import javax.swing.*;
 public class CountingApp{
	 public static void main(String args[]){

	//variables

	String word, newName;
	int vowel, consonant, digit, space;

	//object

	Counting myCounting = new Counting();

	//input

	word=JOptionPane.showInputDialog(null, "Please enter word");
		myCounting.setWord(word);

	//compute

	myCounting.compute();

	//output

	newName=myCounting.getNewName();
		JOptionPane.showMessageDialog(null, "Your new name is "+newName);





	 }
 }

