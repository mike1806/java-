public class PigLatin1{



	//Data Members

	private String userInput;

	private StringBuffer newWord;

	private String pigLatinWord;



	//Constructor

	public PigLatin1(){

		userInput="";

		newWord=new StringBuffer();

		pigLatinWord="";

	}



	//Setter

	public void setWord(String userInput){

		this.userInput=userInput;

	}



	//Process

	public void computeWord(){

		for(int letters=1;letters<userInput.length();letters++){

			newWord.append(userInput.charAt(letters));

		}

		newWord.append(userInput.charAt(0));

		newWord.append("ay");



		pigLatinWord=userInput+" in Pig Latin is: "+newWord.toString();

	}



	//Getter

	public String getWord(){

		return pigLatinWord;

	}

}