package Linear_Search;

public class Max_wealth {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(arr));

    }
    static int maximumWealth(int[][] accounts){
        int maxwealth=0;

        for(int row=0;row<accounts.length;row++){
            int Sum=0;
            for(int col=0;col<accounts[row].length;col++){
                Sum=Sum+accounts[row][col];
            }
            if(Sum>maxwealth){
                maxwealth=Sum;
            }
        }
        return maxwealth;
    }
}
