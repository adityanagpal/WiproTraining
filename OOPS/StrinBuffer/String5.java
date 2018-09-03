package firstAssessment;

public class String5 {

	public static void main(String[]args) {
		String s = args[0];
		int len = s.length();
		if(len<=2) {
			System.out.println(s);
		}
		else {
			String str = s.substring(1, len-1);
			System.out.println(str);
		}
	}
}
