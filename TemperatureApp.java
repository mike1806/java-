/*
Borkowski Michal
08 10 2018
TemperatureApp.java
*/

import java.util.*;

public class TemperatureApp{

	public static void main(String args[]){

	//Variables
	int celsius;
	double fahrenheit;
	double sum;

	//Objects/1.Declare; 2. Assign
	Scanner keyboard;
	keyboard=new Scanner(System.in);

	Temperature myTemperature;
	myTemperature=new Temperature();

	//Input/Ask the user the question
	System.out.println("How many Celsius?");

	//Store an answer
	celsius=keyboard.nextInt();

	//Send an answer to the instantiable
	myTemperature.setCelsius(celsius);

	//Process
	myTemperature.compute();

	//Output
	sum=myTemperature.getSum();
	System.out.println("Fahrenheit Degrees= " +sum);

}

}