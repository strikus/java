import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int ans = sum2();
        System.out.println(ans);

//        //q take two inptu and sum

//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int sum= a+b;
//
//        System.out.println(sum);
//        do this thing 10 times we use fn()
         /*
         acesss modifier (in oops)
          */

    }
    static void sum(){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum= a+b;

        System.out.println(sum);
        // static is no depend on object
    }
    // return value
static int sum2(){
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    int sum= a+b;


    return sum;
//    System.out.println(sum); return statement will not execute

}


}