public class scoping {
    public static void main(String[] args) {
        int a = 20;
        int b = 32;
        String name = "kunal";

//     block scope
        {
            // int a =23; already  init outside block in same metohd u cant declare again
            a = 79;  // int a cant redifned the value but can change value
            int c = 99;
            name = "rohit";
            System.out.println(name);

            // value initialise in this block will remin in block
        }
        // for loop
        for(int i=1; i<2; i++){
//            int a=23l; cant initilase

        }

//        System.out.println(c);
        // cant used outside block
        System.out.println(a); // will print 100 instead of 20 \
        System.out.println(name);


    }
}
//static void random(int marks){
//    System.out.println(a);

    // cant access a in this function because that a
    // declared in that scope of function


// scoping means wheer can we access the
// our varibles

// the value is passed abd in non prinitve pass by value of reference variable



// anythuing declared outside the block cant re redeclare inside box and we can update or reuse
// anything declare inside the block u can re declare outside the block scope  but cant use without declare outside the block of scope




