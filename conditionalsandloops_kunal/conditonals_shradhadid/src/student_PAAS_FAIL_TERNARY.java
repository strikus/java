import java.util.Scanner;

public class student_PAAS_FAIL_TERNARY {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int marks= in.nextInt();

        String reportcard = marks>=33?"paass":"fail";
        System.out.println(reportcard);


    }
}


// MARKS>=33 PASS
// MARKS <33 FAIL