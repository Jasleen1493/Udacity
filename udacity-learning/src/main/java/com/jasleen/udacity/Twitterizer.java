package com.jasleen.udacity;

//Bluej project: twitter
//TODO: Write code for the shorten(String longPost) method.
public class Twitterizer {

	/**
	 * Shortens and returns long posts by removing vowels
	 * 
	 * @param longPost
	 * the post who's vowels need to be removed
	 * @return a version of the post without vowels
	 */
	public static String shorten(String longPost) {
		String vowelList = "aeiou";
		String stringWithoutVowel = "";
		for (int i = 0; i < longPost.length(); i++) {
			String letter = longPost.substring(i, i+1);
			//System.out.println(i+1 +" letter of the initial string :"+letter);
			if(!vowelList.contains(letter.toLowerCase())){
				 stringWithoutVowel=stringWithoutVowel.concat(letter);
				 //System.out.println("new string without vowel :"+stringWithoutVowel);
			}
		}
		return stringWithoutVowel;

	}

	 /**
     * Prints a post backwards to hide its contents.
     * @param post the post to be reversed.
     */
    public String reverse(String post)
    {String reversePost="";
    	for (int i = post.length()-1; i >=0; i--) {
			 reversePost = reversePost + post.substring(i, i+1);
		}
    	return reversePost;
    }
    
    
	public static void main(String[] args) {
		String string1 = "How was your day?";
		Twitterizer twitterizer = new Twitterizer();
		System.out.println(shorten(string1));
		String string2 = "Jasleen";
		System.out.println(twitterizer.reverse(string2));
	}
}
