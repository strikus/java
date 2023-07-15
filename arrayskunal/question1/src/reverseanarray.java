import java.util.Arrays;

public class reverseanarray {
    public static void main(String[] args) {
        int[] arr = {1,32,4521,42,2};
//        swap(arr,2,4);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }


    static void swap(int[] kid , int i , int j){
        int temp = kid[i];
        kid[i]= kid[j];
        kid[j]=temp;

    }
}
