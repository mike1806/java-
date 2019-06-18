import java.util.*;
public class SweetShop {

	public static void main (String args[]){

//declare variables

int iceCream;//amount of icecream
int lolliPop;
int bar;
final double ICECREAMCOST;//cost of the items
final double LOLLIPOPCOST;
final double BARCOST;
double totalCost;

//assigning the variables
iceCream=0;
lolliPop=0;
bar=0;
ICECREAMCOST=3.99;
LOLLIPOPCOST=0.99;
BARCOST=1.20;
totalCost=0;


//objects
Scanner keyboard;
keyboard=new Scanner(System.in);

//inputs
System.out.println("How many icecream do you want?");
iceCream=keyboard.nextInt();

System.out.println("How many bars do you want?");
bar=keyboard.nextInt();

System.out.println("How many lollis do you want?");
lolliPop=keyboard.nextInt();

//process
totalCost=(lolliPop*LOLLIPOPCOST)+(bar*BARCOST)+(iceCream*ICECREAMCOST);

//Output
System.out.println("The total is of your shopping "+totalCost);
	}
}