package firstAssessment;

public class String13 {
	public static void main(String[]args) {
		String str = args[0];
		String word = args[1];
		int slen = str.length();
		int wlen = word.length();
		String fin = "";
		for (int i = 0; i < slen-wlen+1; i++) {
		    String tmp = str.substring(i,i+wlen);
		    	if (i > 0 && tmp.equals(word))
		    		fin += str.substring(i-1,i);
		    	if (i < slen-wlen && tmp.equals(word))
		    		fin += str.substring(i+wlen,i+wlen+1);	    
		}
		System.out.println(fin);
	}
}
