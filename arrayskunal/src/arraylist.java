import java.util.ArrayList;
import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> kid = new ArrayList(5);
        kid.add(1);
        kid.add(2);
        kid.add(3);
        kid.add(4);
        kid.add(5);
        kid.add(6);
        kid.add(7);
        kid.add(8);
        kid.add(9);
        kid.add(10);
        kid.add(11);
        kid.add(12);
        kid.add(13);
        kid.add(14);
        kid.add(15);
// capacity is 10 still printing till 15
        System.out.println(kid);
        System.out.println(kid.contains(4)); // checlk whether the ele,ent is present or not
        kid.set(0, 23); // , modify array list
        System.out.println(kid);
        kid.remove(3);  // take only index
        System.out.println(kid);

        // iterate
        // input
        for(int i=0; i<5; i++){
            kid.add(in.nextInt());

        }

        // get item at any index
        for(int i=0; i<5; i++){
            System.out.println(kid.get(i)); // pass index here
        } // here list[index ] wil notr work here
//        System.out.println(kid);

    }
}
