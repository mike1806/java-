/*
MBorkowski
Counting.java
5 11 2018
*/

public class Counting{
	//data members
	private String word;
	private int vowel, consonant, digit, space;
	private StringBuffer strBuff;//holds the converted/altered word
	private String newName;

	//constructor
	public Counting(){
		strBuff=new StringBuffer();

	}
	//setter
	public void setWord(String word){
		this.word=word;
}
	//compute
	public void compute(){

		for(int i=0;i<word.length(); i++){
			char ch=word.charAt(i);
			if(ch=='a'|| ch=='e'|| ch=='u'|| ch=='i'|| ch=='o'){
				strBuff.append((word.charAt(i))+"++");
			}
			else if(ch>'a'&& ch<='z'){
				strBuff.append((word.charAt(i))+" ");
			}
			else if(ch>=' '){
				strBuff.append((word.charAt(i))+"*");
			}

			else if(ch=='.'){
				strBuff.append((word.charAt(i))+'.');
			}
			else{
				strBuff.append(word.charAt(i));
			}
	}
	newName=strBuff.toString();
	}
	//getter
	public String getNewName(){
		return newName;
	}

	}



