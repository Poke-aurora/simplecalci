class Solution {
    public int reverse(int x) {
         int a = Integer.MIN_VALUE;
        int b = Integer.MAX_VALUE;
        long finalnum = 0;
        while(x!=0){
            finalnum = finalnum * 10 + x % 10;
            x = x / 10;
        }

        if(finalnum < a || finalnum > b){
            return 0;
        } else{
        return(int) finalnum;
        }
}
}
