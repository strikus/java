public class onepassbyrefrenceex {
    public static void main(String[] args) {
//        String name = "rohit";
//        changeName(name);
//        System.out.println(name);
        int a = 10;
        int b= 20;

        swap(a,b);


        System.out.println(a + "" +b);// 10 20

    }

//     static void changeName(String naam) {
//        naam ="rjfk";
//         System.out.println("naam" +naam);

//     } // scope this is valid in function

static void swap(int a, int b){
        int temp =a;
        a=b;
        b=temp;
    System.out.println(a+""+b);

}

}


// primitive like int sbort char byte
// just pass the value

// object and stuff // pass valur of the refrence
