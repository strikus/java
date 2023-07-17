public class maxWealth {
    public static void main(String[] args) {

    }
    static public int maximumWealth(int[][] accounts){
//person = rol , account=col
        for (int person = 0; person < accounts.length; person++) {
            // when u start new col take sum of it
            int sum=0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum+=accounts[person][account];
            }
            // mow we have sum of account of person
            // check with overall ans
            if(sum>ans){
                ans=sum;
            }
        }
    }

}
