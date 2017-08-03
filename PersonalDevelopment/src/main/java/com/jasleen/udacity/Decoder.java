package com.jasleen.udacity;

import org.eclipse.jdt.internal.compiler.batch.Main;

//Bluej project: secret_messages
//
//TODO: implement the decode method.
//
public class Decoder
{
 private String encodedMessage;

 public Decoder(String encodedMessage)
 {
     this.encodedMessage = encodedMessage;
 }

 /**
  * Reads every 10th letter of encodedMessage and returns a string
  * with the letters it reads.
  * @return
  */
 public String decode()
 {
     String decodedMessage = "";
     for (int i = 0; i < encodedMessage.length(); i+=10) {
    	 decodedMessage = decodedMessage + encodedMessage.substring(i,i+1);
    	 System.out.println("decoded string : "+decodedMessage);
	}
     return decodedMessage;
 }

 /**
  * Optional:
  * Decodes the same way as String decode() but takes an index to start at.
  * There may be more than one secret message in the
  */
 public String decode(int startingIndex)
 {
     String decodedMessage = "";
     for (int i = startingIndex; i < encodedMessage.length(); i+=10) {
    	 decodedMessage = decodedMessage + encodedMessage.substring(i,i+1);
    	 System.out.println("decoded string : "+decodedMessage);
	}
     return decodedMessage;
 }
 
 public static void main(String[] args) {
	 String str = "";
	 str=str.concat("str2");
	Decoder decoder = new Decoder("Jasleen keep it up, keep going. You can do it!");
	decoder.decode();
}
}

