package com.jasleen.udacity;


//Bluej project: lesson6/credit_card1
//Video: Sum Every Other Digit

//TODO: Implement the sumCertainDigits method.
public class CreditCard
{
 private long cardNumber;

 public CreditCard(long cardNumber)
 {
     this.cardNumber = cardNumber;
 }

 /**
  * Calculates the sum of every other digit in cardNumber 
  * starting from the rightmost digit.
  * @return the sum of every other digit starting from the rightmost.
  */
 public int sumCertainDigits()
 {
     // So that we don't accidentally change the credit card number,
     // make a copy called n. 
     long n = cardNumber;
     
     // TODO this is the code from the a previous video. You can use it
     // as a starting point, but you will need to change a lot.
     // Change this method so that it will calculate the sum of every
     // second digit instead of all the digits, and then return this 
     // special sum. 
     // for example, if n is 12345, this method should return the sum 
     // 5 + 3 + 1
     // There are links to videos with hints above the submit button. 
     // Use them if you want more inspiration.
     int sum = 0;
     
     while (n > 0)
     {
         int digit = (int)(n % 10); 
         System.out.println("Mod n : " +digit);
         sum = sum + digit;
         System.out.println("sum : " +sum);
         n = n/100;
         System.out.println("new n :" +n);
     }

     System.out.println(sum);
	return sum;
 }

 public boolean isValid()
 {
     /* Pseudocode for isValid:
      * sum = 0
      * count = 0
      * for each digit starting from the right
      *     count ++
      *     if count is odd
      *         sum = sum + digit
      *     else if (digit < 5)
      *         sum = sum + 2 * digit
      *     else
      *         sum = sum + 2 * digit - 9
      * if the last digit of the sum is zero
      *     The card number is valid
      */
     long n = cardNumber;
     int sum = 0;
     int count = 0;
      // TODO this is the code from the last question. you can use it
     // as a starting point, but you will need to change most of it.
     while (n > 0)
     {
       int digit = (int)(n % 10);
       count ++;
       n = n/10;
       if(count % 2 == 1){
    	   sum = sum + digit;
       }
       else if (digit < 5){
    	   sum = sum + 2 * digit;
       }
       else 
    	   sum = sum + 2 * digit - 9;
     }
     /*if(sum % 10 == 0)
    	 return true;
     else
     return false;*/
     return sum%10==0;
     
 }
 	
public static void main(String[] args) {
	/*int n = 123456789;
	while(n>0){
		int n1= n % 10;
		n= n/100;
		System.out.println("Mod n : "+n1);
		System.out.println("n : " +n);*/

CreditCard card = new CreditCard(4417123456789113L);
System.out.println("Program running");
/*int sum = card.sumCertainDigits();
System.out.println("**** final Sum **** " +sum);
*/
boolean result = card.isValid();
if(result)
	System.out.println("Credit card number is valid");
else
	System.out.println("Credit card number is invalid");
}
}
