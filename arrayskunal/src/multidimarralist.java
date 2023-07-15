import java.util.ArrayList;
import java.util.*;
public class multidimarralist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            ArrayList<ArrayList<Integer>> kid = new ArrayList<>();

            // initiliasation
        for (int i = 0; i < 3; i++) {
            kid.add(new ArrayList<>());


        }
        //add elememnt
        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++) {
                kid.get(i).add(in.nextInt());
            }

        }
        System.out.println(kid);
    }
}
