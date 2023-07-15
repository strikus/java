import java.util.Arrays;
import java.util.Scanner;

public class arr1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] arr = new int[5];
        arr[0]=1;
        arr[1]=1;
        arr[2]=1;
        arr[3]=1;
        arr[4]=1;
        // if we have 1000 it will difficult to individually input so
        // we use for loop

        System.out.println(arr[3]);

        //input using for loop
        for(int i=0; i<arr.length; i++){
            arr[i]= in.nextInt();
        }
        System.out.println(Arrays.toString(arr)); // direct way to print without using for loop
//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i] + " ");
//
//        }
//        for (int j : arr) {  // for every element in array print the element
//            System.out.println(j + " "); // here j represent element of array
//
//
//            // another way to print
//            // System.out.println(Arrays.toString((arr));
//            //
//        }
//               array of object
          String[] newarray = new String[6];
          for(int i=0; i< newarray.length;i++){
              newarray[i]  = in.next();
          }
        System.out.println(Arrays.toString(newarray));
          newarray[1]= "kid"; // modify
        System.out.println(Arrays.toString(newarray));

    }

    }

