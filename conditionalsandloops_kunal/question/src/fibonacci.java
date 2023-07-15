import java.util.Scanner;
//

//

//public class fibonacci {
//    public static void main(String[] args) {
////        what is fibonaacci no
//        // start by 0 and 1 and adding previos two num
//        // 0+1=1 , 1+1=2 , 1+2=3, 3+2=5
//        Scanner in =new Scanner(System.in);
//        int n= in.nextInt();
//        int p=0;
//        int i=1;
//
//        int count=0;
//        while(count<n){
//            int temp=0;
//             temp=p+i;
//            count++;
//
//
//        }
//        System.out.println(p);
//    }
//}
public class fibonacci {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in) ;
        int n = s.nextInt();

        int a = 0;
        int b = 1;
        int c;

        for(int i = 0;i<n;i++)

        {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(a);

    }
}