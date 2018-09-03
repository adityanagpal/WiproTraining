package firstAssessment;

public class String7 {
	public static void main(String[] args) {
        String s ;
        s=args[0];
        int len=s.length();
        if(s.charAt(0)=='x'){
            s=s.substring(1, len);
            len=s.length();
        }
        if(s.charAt(len-1)=='x')
            s=s.substring(0, len-1);
    System.out.print(s);
        

    }

}
