import java.util.*;
public class inputweeknum {
    public static void main(String[] args) {

        Scanner in =  new Scanner(System.in);
        int day = in.nextInt();

        switch (day) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("firday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
        }
    }
}
