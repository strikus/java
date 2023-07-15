import java.util.Scanner;

public class armstrongno {
    // 3 digit armstrong numberr
    // take every digit cube of it and addi t
    // ex = 123 1cube+2cube+3cube=giving same num

    public static void main(String[] args) {
//        Scanner in =new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println(isArmstrong(n));
for(int i =100;i<=1000;i++){
    if(isArmstrong(i)){
        System.out.println(i+" ");

    }
}
    }
    static boolean isArmstrong(int n){
        int original=n;
        int sum= 0;
        while(n>0){
            int rem = n%10;
            n=n/10;
            sum +=rem*rem*rem;

        }
        if (sum==original){
            return true;
        }
        return false;
    }
}

