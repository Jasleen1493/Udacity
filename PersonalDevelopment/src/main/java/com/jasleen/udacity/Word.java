package com.jasleen.udacity;

public class Word {

	private String letters;

	public Word(String letters) {
		this.letters = letters.toLowerCase();
	}

	/**
	 * Checks whether the ith letter is a vowel.
	 * 
	 * @return true if the ith letter is a vowel, false otherwise.
	 */
	public boolean isVowel(int i) {
		String letter = letters.substring(i, i + 1);
		return (letters.substring(i, i + 1).equals("a")) || (letter.equals("e"))
				|| (letter.equals("i")) || ((letter.equals("o")))
				|| ((letter.equals("u")));

	}

	/**
	 * Checks whether the ith letter is a consonant.
	 * 
	 * @return true if the ith letter is a consonant, false otherwise.
	 */
	public boolean isConsonant(int i) {
	return (!(isVowel(i)));
	}

	 /**
    Forms the plural of this word.
    @return the plural, using the rules for regular nouns
*/
public String getPluralForm()
{
	// If the word ends in y preceded by a consonant you take away the y and add ies.
	if(letters.endsWith("y") && isConsonant(letters.length()-2)){
		return letters.replace("y", "ies");
	}
	// If the word ends in y preceded by a vowel, you just add an s.
	else if (letters.endsWith("y") && isVowel(letters.length()-2)){
		return letters.concat("s");
	}
    // You add an es when a word ends in o, or s, or sh, or ch.
	else if(letters.endsWith("o")||letters.endsWith("s")||letters.endsWith("sh")||letters.endsWith("ch")){
		return letters.concat("es");
	}
    // In all the other case just add an s.
	else{
		return letters.concat("s");
	}
}
	
	
	public static void main(String[] args) {
		Word word = new Word("Jasleen1234");
		System.out.println("Program running");
		Word singularWord = new Word("Butterfly");
		singularWord.getPluralForm();
		if(word.isConsonant(3)){System.out.println(word.letters.substring(3,4)+" is a consonant");}
		if(word.isVowel(5)){System.out.println(word.letters.substring(5,6)+" is a vowel");}

	}
}
