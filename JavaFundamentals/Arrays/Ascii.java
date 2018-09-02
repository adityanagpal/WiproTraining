public class Ascii {

    public static void main(String[] args) {
        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
	    System.out.print((char)arr[i]);
        }
        
    }
}/*
Initialize an integer array with ascii values and print the corresponding character values in a single row.
*/
