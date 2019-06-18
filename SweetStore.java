/*
Borkowski Michal
SweetStore.java
07 10 2018
*/

import java.util.*;

public class SweetStore{

	public static void main(String args[]){

	//variables declaring

	int icecream;
	int lollipop;
	int bar;
	final double icecreamCost;
	final double lollipopCost;
	final double barCost;
	double sum;

	//variables assigning

	icecream=0;
	lollipop=0;
	bar=0;
	icecreamCost=3.99;
	lollipopCost=0.99;
	barCost=1.20;
	sum=0;

	//declaring objects
	Scanner keyboard;
	//creating objects
	keyboard=new Scanner(System.in);

	//input - questions

	System.out.println("How many icecreams");
	icecream=keyboard.nextInt();

	System.out.println("How many lollipops");
	lollipop=keyboard.nextInt();

	System.out.println("How many bars");
	bar=keyboard.nextInt();


	//process - calculations

	sum=(bar*barCost)+(lollipop*lollipopCost)+(icecream*icecreamCost);

	//output - results

	System.out.println("The total is sum is "+sum);


	}
}