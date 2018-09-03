package firstAssessment;

public class BigString {
	public static void main(String[]args) {
		 String a = args[0];
	     String b=args[1];
	     String c="";
	     int alen,blen,len,i=0;
	     alen=a.length();
	     blen=b.length();
	     len=(alen+blen);
	     len=Math.min(alen, blen);
	     while(i<len){
	         c=c+a.charAt(i)+b.charAt(i);
	         i++;
	     }
	     if(len==alen){
	         if(alen!=blen)
	         c=c+b.substring(len-1);
	     }
	     else
	         c=c+a.substring(len-1);
	     System.out.println(c);

	 }
}
