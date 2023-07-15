import java.util.Arrays;

public class var_args {
    public static void main(String[] args) {
fun(2,34,34,35,35,35,35,34);
fu1(3,3,"gi","sdsd","sddjaad");  //
    }

    static void fun(int  ...v){
        System.out.println(Arrays.toString(v));


    }
    static void fu1(int a,int b , String ...v){ // mix of var args we cant include ...v before any other because if we did we dont know when it gona end
        System.out.println(Arrays.toString(v));


    }
}

// when u create a method that takes variable number or length of arguments
//dont know how many inputs we giving as array