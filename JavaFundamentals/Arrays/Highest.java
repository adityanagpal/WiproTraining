/*
Write a program to print the element of an array that has occurred the highest number of times
Eg) Array -> 10,20,10,30,40,100,99
O/P:10
*/
public class Highest{
public static void main(String[] args) {

   int[] arr = new int[args.length];
   for(int i=0; i<args.length;i++){
    arr[i] = Integer.parseInt(args[i]);
   }

    int max = 0;
    int index = 0;
    for (int i = 0; i < arr.length; i++) {
       int count = 0;
       for (int j = 0; j < arr.length; j++) {
         if (arr[i]==arr[j])
             count++;
        }
        if (count >= max)
         {
           max = count;
           index = i;
         }
     }

    System.out.println("Number of Occurance of " + arr[index] + ":" + max + " times");

}
}
