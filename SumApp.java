/*
Borkowski Michal
SumApp.java
22 10 2018
*/

import javax.swing.JOptionPane;
public class SumApp{

	public static void main(String args[]){

		//declaring variables

		int num;
		int sum;

		Sum mySumApp;

		//declaring objects

		num=0;
		sum=0;

		//create objects

		mySumApp=new Sum();

		//inputs

		num=Integer.parseInt(JOptionPane.showInputDialog("Enter number "));

		//process

		mySumApp.compute();

		//outputs

		sum=mySumApp.getSum();
		JOptionPane.showMessageDialog(null, "Sum is "+sum);
	}

}

