package firstAssessment;

public class SeparatorString {

	public static void main(String[]args) {
	String a = args[0];
	String b= args[1];
	int c = Integer.parseInt(args[2]);
	int len_a = a.length();
	int len_b = b.length();
	if(len_a>len_b) {
		for(int i=0;i<c-1;i++) {
			System.out.print(a+b);
		}
		System.out.print(a);
	}
	else {
		for(int i=0;i<c-1;i++) {
			System.out.print(b+a);
	}
	System.out.print(b);
}
	}
}