public class maxnuminarray {
    public static void main(String[] args) {
        int[] arr = {2, 42, 5,2 ,23, 242};
        System.out.println(max(arr,4,2));
        System.out.println(max(arr));
    }
// work on edge cases like array being null
    static int max(int[] arr,int start,int end) {
        if(start>end){
            return -1;

        }
        if(arr==null){
            return -1;
        }
        int maxINt=arr[start];
        for (int i = start; i <=end; i++) {
            if(arr[i]>maxINt){
                maxINt=arr[i];
            }

        }
        return maxINt;
    }
     static int max(int[] arr) {
        if(arr.length==0){
            return -1;
        }
        int maxINt=0;
         for (int i = 0; i < arr.length; i++) {
             if(arr[i]>maxINt){
                 maxINt=arr[i];
             }

         }
         return maxINt;
    }

}
