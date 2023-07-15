import java.util.Arrays;

public class araypassinginfunction {
    public static void main(String[] args) {
        int[] num = {2,12,3,23,23};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));

    }

    static void change(int[] arr){

        arr[0]=99;
    }
}
