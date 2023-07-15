// arr 18 12 -7 3 14 28 search in between 1 till 4
public class searchinrange {

        public static void main(String[] args)
        {
            int[] num = {2,34,23,1,-7,123,54,23,1};
            int target=-7;
            int ans=linearsearch1(num,target,1,3);
            System.out.println(ans);


        }

        // search the element and return element

        static int linearsearch1(int[] arr , int target,int start ,int end){
            if(arr.length==0) {
                return -1;
            }
            // run a for loop
//            for (int element : arr) {
//                if (element == target) {
//                    return element;
//                }
            for(int index=start; index<=end;index++){
                int element= arr[index];
                if(element==target){
                    return element;
                }
            }
            return -1; // if no element found
        }


}
