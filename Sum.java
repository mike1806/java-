/*
Borkowski Michal
Sum.java
22 10 2018
*/

public class Sum{

	//declaring data members

	private int num;
	private int sum;

	//construtor

	public Sum(){

		num=0;
		sum=0;
	}

	//setter

	public void setNum(int num){
		this.num=num;

	//compute

	public void compute(){
			for(int i=0;i<=num;i++){
				sum+=i;
		}
	}
	//getter

	public int getSum(){
		return sum;
	}
}
}
