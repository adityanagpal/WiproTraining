package firstAssessment;
import java.util.*;
public class HalfString {
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String abc= sc.nextLine();
        
        String bcd=null;
        int lenght=abc.length();
        int n=lenght/2;
        if(lenght%2==0)
        { bcd="";
            for(int i=0;i<n;i++){
                bcd=bcd+abc.charAt(i);
                
            }
            System.out.print(bcd);
        }
        else
        System.out.println(bcd);
        sc.close();
    }
}
