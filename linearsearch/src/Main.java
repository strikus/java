public class Main {
    public static void main(String[] args)
    {
        int[] num = {2,34,23,1,3534,123,54,23,1};
        int target=123;
        int ans=linearsearch(num,target);
        System.out.println(ans);
        int ans1=linearsearch1(num,target);
        System.out.println(ans1);
        boolean ans2=linearsearch2(num,target);
        System.out.println(ans2);

    }

    // search the element and return element

    static int linearsearch1(int[] arr , int target){
        if(arr.length==0) {
            return -1;
        }
        // run a for loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
//            for(int index=0; index<arr.length;index++){
//                int element= arr[index];
//                if(element==target){
//                    return element;
//                }

        }
        return -1; // if no element found
    }

// true or false
static boolean linearsearch2(int[] arr , int target){
    if(arr.length==0) {
        return false;
    }
    // run a for loop
    for (int element : arr) {
        if (element == target) {
            return true;
        }

    }
    return false; // if no element found
}









    //search in the array : return the index if element found otherwise return -1
    static int linearsearch(int[] arr , int target){
        if(arr.length==0) {
            return -1;
        }
            // run a for loop
            for(int index=0; index<arr.length;index++){
                int element= arr[index];
                if(element==target){
                    return index;
                }

            }
        return -1; // if no element found
        }

    }

