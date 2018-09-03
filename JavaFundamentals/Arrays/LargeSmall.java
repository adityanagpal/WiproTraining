/*
Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
*/
public class LargeSmall{
public static void main(String[] args){
int[] arr = new int[args.length];
for(int i=0; i<args.length; i++){
   arr[i] = Integer.parseInt(args[i]);
}

int max = arr[0];
int max2 = arr[0];
int min = arr[0];
int min2 = arr[0];
for(int i = 1; i < arr.length; i++) {
    if(arr[i] > max){
        max2 = max;
        max = arr[i];
    }
    else if (arr[i] < min){
        min2 = min;
        min = arr[i];
    }

}

System.out.println("Largest two are : " + max + "  " + max2);
System.out.println("Smallest two are : " + min + " " +min2);

}

}
