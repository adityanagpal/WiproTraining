package firstAssessment;

class Palindrome
{
   public static void main(String args[])
   {
      String originalString, reverseString="";

      originalString = args[0];

      int length = originalString.length();

      for ( int i = length - 1 ; i >= 0 ; i-- )
         reverseString = reverseString + originalString.charAt(i);

      if (originalString.equals(reverseString))
         System.out.println("Entered string is a palindrome.");
      else
         System.out.println("Entered string is not a palindrome.");

   }
}
