class Solution {
    public int hammingWeight(int n) {
          String num=binary(n);
        int count=0;
        for (int i = 0; i < num.length(); i++) {

            if(num.charAt(i)=='1'){
                count+=1;
            }
        }
        return count;
    }
     static String binary(int n){
        String bin="";
         while(n>0){
             int rem=n%2;
             bin=rem +bin;
             n/=2;
         }
         return bin;
    }
}