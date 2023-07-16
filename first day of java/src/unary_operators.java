public class unary_operators {
    public static void main(String[] args){
        int a =34;
        int b = ++a;
        System.out.println(b); //35
        System.out.println(a);//35
        int c=34;
        int d=c++;
        System.out.println(c);//35
        System.out.println(d);//34



    }
}

//++ A++ OR     ++A
//a=a-1 a-- or --a
// pre increment phele ++a    // phele value bdengi phir assing krengi ex // int a =10 int b = ++A result is a=11 b=11
// memory me phele a ki value change phir a me and b me bhi change hnga change then use
// post increment badme a--
// post increment me a ++ purani value use hngi  phir update hngi
// ex int a = 34; int b =a++ so here result as a=35 b=34 // first purani value use in b and then updatein a
