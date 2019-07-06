/*
 *PigLatinApp.java
 *M Borkowski
 *6 1 2019
 */

 import javax.swing.*;
 public class PigLatinApp{
 	public static void main(String args[]){

	//variables

	 String word;
     StringBuffer strBuff = new StringBuffer();;
	 String newWord;

	//object

	PigLatin myPigLatin = new PigLatin();

	//input

	word=JOptionPane.showInputDialog(null, "Please enter word for translation");
		myPigLatin.setWord(word);

	//compute

	myPigLatin.compute();

	//output

	newWord=myPigLatin.getNewWord();
	JOptionPane.showMessageDialog(newWord);

	}
}
