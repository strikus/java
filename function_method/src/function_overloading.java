import java.util.Arrays;

public class function_overloading {
    public static void main(String[] args) {

        fun(23);
        fun("sd");
        int sum =fun(223,23,23);
        System.out.println(sum);
        fun(2,32,3,2,32,323,2,3,2,32,3);
//        fun(); // will print [] and if we declare two var arg function it will show ambigous error which one to run

    }
    static void fun(int a){
        System.out.println(a);

    }
    static void fun(String b){
        System.out.println(b);

    }
    static int  fun(int  b,int c, int d){
      return d+b+c;

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }
    static void fun(String ...v){
        System.out.println(Arrays.toString(v));

    }

}
// function overloading two function of same name they can exist if parameter differnct
// at compile time it decides what fun to run if int run a and if string run b