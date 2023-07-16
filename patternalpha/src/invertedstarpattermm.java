public class invertedstarpattermm {
    public static void main(String[] args) {
int n=7;
        for (int line =1; line<=n; line++){
            for(int star=1; star<=n-line+1; star++)
            {
                System.out.print("&");

            }
            System.out.println();

        }
    }

}




// ****
// ***
// **
// *

// line 1 h star 4 means     stars = n-1+1 = 4 star + 1- 1 line