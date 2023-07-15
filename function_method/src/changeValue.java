import java.util.Arrays;

public class changeValue {
    public static void main(String[] args) {
        // create an array
        int[] arr = {1,2,3,4};
        change(arr);
        System.out.println(Arrays.toString(arr));


    }


    static void change(int[] nums){
        nums[0]=99;// if u make change
    }

}
// call by value in num arr same thing

// we were creating new object so that show till inthat block and in use of same thing in another function and wer did change
// it will show and in both places





// nums we changed so arr and nums point to same thing
