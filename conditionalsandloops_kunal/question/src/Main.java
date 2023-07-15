import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println(in.next().trim().charAt(3));
//        char ch = in.next().trim().charAt(0);
// take  string as input we cant take char as input so there is trick
        //. trim remove space end of the both side

        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        System.out.println(ch);
if (ch>='a'&& ch<='z') {
    System.out.println("Lowercase");
}
        else{
    System.out.println("uppercase");


}



    }
}