class LC1732 {
    public int largestAltitude(int[] gain) {
        int len= gain.length;
        int max=0, i=0;
        int curr=0;
        
        for (i= 0; i <len; i++) {
            curr = curr+gain[i];
            if (curr > max) {
                max= curr;
            }
        }
        return max;
        
    }
    public static void main(String[] args) {
        LC1732 obj = new LC1732();
        int gain[] = {-4,-3,-2,-1,4,3,2};
        //[0,-5,-4,1,1,-6]
        int res = obj.largestAltitude(gain);
        System.out.println(res);

    }
}
