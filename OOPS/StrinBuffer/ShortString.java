package firstAssessment;

public class ShortString {
	 public static void main(String[] args) {
	        String a,b,c;
	        a=args[0];
	        b=args[1];
	        
	        int len_a,len_b;
	        len_b=b.length();
	        len_a=a.length();
	        if(len_a>len_b){
	            c=b+a+b;
	        }
	        else
	            c=a+b+a;
	        System.out.println(c);

	    }
}
