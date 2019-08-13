/*
 *M Borkowski
 *SalaryIncrease.java
 *6 1 2019
 */

 //class

 public class SalaryIncrease{

	 //variable declare

	 private String position;
	 private int years;
	 private int salary;
	 private double sum;

	 //constructor

	 public SalaryIncrease(){

	 position=" ";
	 years=0;
	 salary=0;
	 sum=0;
     }
	 //setter

	 public void setPosition(String position){
		 this.position=position;
	 }
	 public void setYears(int years){
	 		 this.years=years;
	 }
	 public void setSalary(int salary){
	 		 this.salary=salary;
	 }

	 //process

	 public void compute(){
	 if(position.equalsIgnoreCase("manager")){
		 if(years<=5){
			 sum = salary*1.02;
	 	 }
		 if(years>5){
			 sum = salary*1.03;
	 	 }
		 else{
			 sum=0;
	  	 }
 	  }
 	 if(position.equalsIgnoreCase("team leader")){
	  	  if(years<=5){
	  		 sum = salary*1.025;
	  	  }
	  	  if(years>5){
	  		 sum = salary*1.04;
	  	  }
	  	  else{
	  		 sum=0;
	  	  }
     }
     if(position.equalsIgnoreCase("software developer")){
	  	  if(years<=5){
	  		 sum = salary*1.03;
	  	  }
	  	  if(years>5){
	  		 sum = salary*1.04;
	  	  }
	  	  else{
	  		 sum=0;
	  	  }
 	  }
	 }
	 //getters

	 public String getPosition(){
		 return position;
	 }
	 public int getYears(){
		 return years;
	 }
	 public int getsalary(){
		 return salary;
	 }
 }
