package firstAssessment;

public class Binary {
	public static void main(String[]args)
	{
		int s = Integer.parseInt(args[0]);
		String a = Integer.toBinaryString(s);	
		int len = a.length();
		len = 8-len;
		String temp = "0";
		for(int i=0;i<(len-1);i++)
		{
			temp =temp +0;
		}	
		System.out.println(temp+a);
	}
}