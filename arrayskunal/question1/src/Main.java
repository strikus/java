import java.util.Arrays;

import static java.util.Collections.swap;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,32,4521,42,2};
        swap(arr,2,4);
        System.out.println(Arrays.toString(arr));
    }


    static void swap(int[] kid , int i , int j){
        int temp = kid[i];
        kid[i]= kid[j];
        kid[j]=temp;

    }
}