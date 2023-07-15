import  java.util.*;
public class kloop {
    public static void main(String[] args) {
        //Q print 1 to 5
        /*
        syntac of for loop

        for(initialisation; condition; increment/decrement)
        { body
        }
         */
        for(int num=1; num<=5; num+=1)
        {
            System.out.println(num);
        }
        // 1 to n

        Scanner in = new Scanner(System.in);

                int n = in.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println(i);


        }
        // priint itn hello world  n times
        Scanner ini = new Scanner(System.in);

        int n1 = ini.nextInt();
        for(int i1=1;i1<n1;i1++){
            System.out.println("hello world");
        }
    }
}

