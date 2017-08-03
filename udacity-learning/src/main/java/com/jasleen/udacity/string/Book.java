package com.jasleen.udacity.string;

public class Book {
	private String bookText;

	
	public Book(String bookText) {
		super();
		this.bookText = bookText;
	}

	public String getFirstSentence() {
		int endIndex = bookText.indexOf(".");
		return bookText.substring(0, endIndex + 1);
	}

	public int firstOccurrenceOfMadHatter() {
		return bookText.indexOf("Mad Hatter");
	}

	public String getSecondSentence() {
		int beginningIndex = bookText.indexOf(".") + 1;
		int endIndex = bookText.indexOf(".", beginningIndex);
		return bookText.substring(beginningIndex, endIndex + 1);
		/*
		 * String firstSentence = getFirstSentence(); int endOfFirstSentence =
		 * firstSentence.indexOf("."); int endIndex = bookText.indexOf(".");
		 * return bookText.substring(endOfFirstSentence + 1, endIndex+2);
		 */
	}

	public int occurrencesOfAlice() {
		int length = bookText.length();
		int lengthWithoutAlice = bookText.replace("Alice", "").length();
		return (length - lengthWithoutAlice) / 5;
	}

	public int occurrencesOf(String word) {
		int length = bookText.length();
		int lengthWithoutWord = bookText.replace(word, "").length();
		int wordLength = word.length();
		return (length - lengthWithoutWord) / wordLength;
	}

	public static void main(String[] args) {
		String name = "Udacity";
		System.out.println("name.length() = " + name.length());
		System.out.println("name.substring(3,7) = " + name.substring(3, 7));
		System.out.println("name.indexOf(\"c\") = " + name.indexOf("c"));
		System.out.println("Hello" + name);

		name.startsWith("Mad Hatter");
		name.indexOf("Mad Hatter");

	}
}
