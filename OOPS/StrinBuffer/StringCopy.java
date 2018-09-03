package firstAssessment;

public class StringCopy {

	public static void main(String[] args) {
        String str = args[0];
        String next="";
        int lenght =str.length();
        if(lenght<=1){
            next=str;
            
        }
        else{
            for (int i=0;i<lenght;i++){
                next=next+str.charAt(0)+str.charAt(1);
            }
        }
        System.out.print(next);

    }
}
