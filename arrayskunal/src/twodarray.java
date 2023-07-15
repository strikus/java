import java.util.Arrays;
import java.util.Scanner;
public class twodarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        visualisze as matrix
                  1 2 3
                  4 5 6
                  7 8 9
         */
        // int [][] arr2D = new int[2][] // rows write compulsory [] main array [] internal array
        // int [] [] arr2D = {
//        {1,2,3},   // 0th index
//        {4,5}, // 1th index
//        {6,7,8,9] //2nd index arr[2]={6,7,8,9}
//
//
//    }
        // input
        int[][] arr = new int[3][3];
        System.out.println(arr.length);  // now of rows
//input
        for (int row = 0; row < arr.length; row++) {
            // for each col in ever row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //optput
//        for (int row = 0; row < arr.length; row++) {
//            // for each col in ever row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//
//            }
//            System.out.println();
//
//        }
        for (int row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));

        }
        // emhanced
        for( int[] a :arr){
            System.out.println(Arrays.toString(a));

        }
    }
    }
