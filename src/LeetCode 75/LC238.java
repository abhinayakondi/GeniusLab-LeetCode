class LC238 {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int pl=1,pr=1;
        int ans[]=new int[len];
        for(int i=0; i<len; i++){
            ans[i]=pl;
            pl=pl*nums[i];
        }
        for(int i=len-1; i>=0; i--) {
            ans[i]= ans[i] * pr;
            pr = pr * nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        LC238 lc238 = new LC238();
        int[] nums = {1,2,3,4};
        int[] result = lc238.productExceptSelf(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}