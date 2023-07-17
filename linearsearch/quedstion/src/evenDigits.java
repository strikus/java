public class evenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
        System.out.println(digits(3434));
//        System.out.println(digits2(-23424));
    }

    static int digits2(int num) {

        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        return (int) (Math.log10(num)) + 1;

    }


    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // to checkk num is whether a num contains even digits or not
    static boolean even(int num) {
        int numberofDigits = digits(num);
//        if(numberofDigits%2==0){
//            return true;
//        }
//        return false
        return numberofDigits % 2 == 0;
    }

    //    count no of digits in num
    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        return (int) (Math.log10(num)) + 1;
// optimised sol for below

//        int count=0;
//        while(num>0){
//            count++;
//            num=num/10;
//        }
//        return count;
//    }

    }
}

