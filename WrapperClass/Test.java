package firstAssessment;

public class Test {
	public static void main(String[]args)
	{
		int s = Integer.parseInt(args[0]);
		System.out.println("Given Number :" + s);
		System.out.println("Binary equivalent :" + Integer.toBinaryString(s));
		System.out.println("Octal equivalent :" + Integer.toOctalString(s));
		System.out.println("Hexadecimal equivalent :" + Integer.toHexString(s));
	}
}
