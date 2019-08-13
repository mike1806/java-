/*
Borkowski Michal
08 10 2018
Pay.java
*/

public class Pay{

	//data members

	private int basicPay;
	private int overPay;
	private int hour;
	private double BASICPAY;
	private double OVERPAY;
	private double HOUR;
	private double sum;

	//constructor

	public Pay(){
		basicPay=0;
		overPay=0;
		hour=0;
		BASICPAY=0.0;
		OVERPAY=0.0;
		HOUR=0.0;
		sum=0.0;
	}

	//setter

	public void setBasicPay(int basicPay){
		this.basicPay=basicPay;
	}
	public void setOverPay(int overPay){
		this.overPay=overPay;
	}

	//compute

	public void compute(){
	sum=(basicPay*1.5)/7;
	}

	//getters

	public double getSum(){
		return sum;
	}
}