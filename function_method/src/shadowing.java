public class shadowing {
  static   int x=90; // object independent static own scope also available to everything in this block of above {}
    public static void main(String[] args) {
        System.out.println(x); //90
        int x;  // declare int x the class variable at line 2 is shadowed by this
//        System.out.println(x); not initliased
        x=40; // initialise
        System.out.println(x);  //40

        fun();


    }

    static void fun(){
        System.out.println(x);//90

    }

}

// shadowing
//
