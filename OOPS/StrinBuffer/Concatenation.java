package firstAssessment;

public class Concatenation {
	public static void main(String[]args) {
	String str1 = args[0];
	str1 = str1.toLowerCase();
	String str2  = args[1];
	str2 = str2.toLowerCase();
	if (str1.length()>0 && str2.length()>0 && str2.charAt(0)==str1.charAt(str1.length()-1)) {
		str2=str2.substring(1);
		System.out.println(str1+str2);
	}
	else
		System.out.println(str1+str2);
}
}