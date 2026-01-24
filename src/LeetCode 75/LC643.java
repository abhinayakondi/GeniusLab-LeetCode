class LC643 {
    public double findMaxAverage(int[] nums, int k) {
        int len=nums.length;
        int sum;
        int i=0,j,x;
        int max=Integer.MIN_VALUE; 
        //smallest possible value an int can hold -2147483648
        
        do {
            sum=0;
            x=i;
            for(j=0; j<k; j++){
                sum = sum + nums[x];
                x++;
            }
            if (sum>=max)
                max=sum; 
            i++;       
        }while(i<=len-k);

        return (double)max/k;
        
    }
    public static void main(String[] args) {
        LC643 obj= new LC643();
        int arr[]={1,12,-5,-6,50,3};
        int num=4;
        double res=obj.findMaxAverage(arr, num);
        System.out.println("Maximum Average "+res);
    }
} 
