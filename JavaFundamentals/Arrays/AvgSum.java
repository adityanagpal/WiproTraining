/*
Write a program to initialize an integer array and print the sum and average of the array.
*/
public class AvgSum {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum = sum + Integer.parseInt(args[i]);
        }
        System.out.println("The sum of the arguments passed is " + sum);
	System.out.println("The average of the arguments passed is " + sum/args.length);
    }
}

