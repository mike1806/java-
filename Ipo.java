/*
Borkowski Michal
Guess.java
15-10-2018
*/
import java.lang.Math.*;
public class Guess{

	//data members
	private int first; //input
	private int second;
    private String message; //output

	//constructor
	public Guess(){
			second=3;

	}
	//setters
	public void setFirst(int first){
		this.first=first;
	}

	//compute
	public void compute(){

		if(first==second){
			message="Congratulations, you guessed correctly!";
		}
		else if(first>second){
			message="You guessed too high, sorry!";
		}
		else{//grabs everything else
			message="You guessed to low, sorry!";
		}

	}//close the compute

	//getter

	public String getMessage(){
		return message;
	}
	//







}
