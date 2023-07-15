public class minimumnumber {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,14,2,27};
        System.out.println(minaaaa(arr));
    }

    // assume arr.lengght !=0
    // return the minimum array vale

    static int minaaaa(int[] arr){
        int ans=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}

