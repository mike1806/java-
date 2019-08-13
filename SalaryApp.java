/*
 *M Borkowski
 *SalaryApp.java
 *6 1 2019
 */

 //class+mm+JP

 import javax.swing.*;
 public class SalaryApp{
	 public static void main(String args[]){

	//variables

	String position, answer;
	int years;
	int salary;
	double sum;

	//object

	Salary mySalary = new Salary();


	do{
	//input

	position=JOptionPane.showInputDialog(null, "Please enter your role");
 		mySalary.setPosition(position);

	years=Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your year in company"));
		mySalary.setYears(years);

	salary=Integer.parseInt(JOptionPane.showInputDialog(null, "Salary..."));
		mySalary.setSalary(salary);

	//compute

	mySalary.compute();

	//output

	sum=mySalary.getSum();
	JOptionPane.showMessageDialog(null, "Your new salary is "+sum);




	answer=JOptionPane.showInputDialog(null, "To start again type yes");


	}while(answer.equalsIgnoreCase("yes"));

	}

 }
