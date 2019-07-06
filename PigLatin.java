/*
 *M Borkowski
 *PgLatin.java
 *6 1 2019
 */

 //class

 public class PigLatin{

	 //data members

	 private String word;
	 private StringBuffer strBuff;
	 private String newWord;

	 //constructor

 public PigLatin(){

	 word = " ";
	 strBuff = new StringBuffer();
	 newWord = " ";
 }
	 //setter

 public void setWord(String word){
	 this.word=word;
 }

 	//process

 public void compute(){

 	for(int letter=1;letter<word.length();letter++){
		strBuff.append(word.charAt(letter));

	}
		strBuff.append(word.charAt(0));
		strBuff.append("ay");

        newWord=word+" in Pig Latin is: "strBuff.toString();

 }

	 //getter

 public String getWord(){
	 return newWord;
 }


}