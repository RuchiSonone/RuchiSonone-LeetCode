class Solution {
    public int findNumbers(int[] nums) {
       int count=0;
        for (int i = 0; i <nums.length ; i++) {
            if(isEven(nums[i])){
                count+=1;
            }
        }
        return count;
    }
    static boolean isEven(int n){
int num=digits(n );
if(num%2==0){
    return true;
}
return false;
}

static int digits(int n){
        int count =0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
}
}