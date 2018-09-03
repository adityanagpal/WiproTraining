import java.util.Scanner;

public class EH9 {
    public static void main(String... args){
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the 2 numbers");
            int i1 = scanner.nextInt(), i2 = scanner.nextInt();
            System.out.println("The quotient of "+i1+"/"+i2+" = "+i1/i2);
        }catch (Exception e){
            System.out.println("DivideByZeroException caught");
        }finally {
            System.out.println("Inside finally block");
        }
    }
}
