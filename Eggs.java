/*
Eggs.java
Borkowski
1 10 2018
*/

//Class Signature
public class Eggs{

	//Data Members
	private int eggs;
	private int box;
	private int leftOvers;
	private final int DOZEN;

	//Constructor
	public Eggs(){
	eggs=0;
	box=0;
	leftOvers=0;
	DOZEN=12;
}

	//Setters/input
	public void setEggs(int eggs){
	this.eggs=eggs;
}

	//Compute/Calculations
	public void compute(){
	box=eggs/DOZEN;
	leftOvers=eggs%DOZEN;
}

	//Getters/Output
	public int getBox(){
		return box;
}
	public int getLeftOvers(){
        return leftOvers;
}
}