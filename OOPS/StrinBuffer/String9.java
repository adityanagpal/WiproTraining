package firstAssessment;

public class String9 {

	public static void main(String[]args) {
		String str = args[0];
		int len = str.length();
		  String finalString = "";
		  for (int i = 0; i < len; i++) {
		    if (i == 0 && str.charAt(i) != '*')
		      finalString += str.charAt(i);
		    if (i > 0 && str.charAt(i) != '*' && str.charAt(i-1) != '*')
		      finalString += str.charAt(i);
		    if (i > 0 && str.charAt(i) == '*' && str.charAt(i-1) != '*')
		      finalString = finalString.substring(0,finalString.length()-1);
	}
		  System.out.println(finalString);
}
}