import java.util.*;
public class q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float pen = sc.nextFloat();

        float total = (pen+pencil+eraser);
        System.out.println(total);

        // with 18% gst
        float newTotal = total +( 0.18f*total);
        System.out.println(newTotal);


    }


}
