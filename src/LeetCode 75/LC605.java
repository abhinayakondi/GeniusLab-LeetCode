class LC605 {
    public boolean canPlaceFlowers(int[] arr, int n) {
        int len= arr.length;
        for (int i = 0; i < len; i++) {
            if(n==0)
                break;
            if(len==1 && arr[i]==0){
                arr[i]=1;
                n--;
            }
            else if(i==0 && arr[i]==0 && arr[i+1]==0) {
                arr[i]=1;
                n--;
            }
            else if(i==(len-1) && arr[i]==0 && arr[i-1]==0) {
                arr[i]=1;
                n--;
            }
            else if(i!=0 && i!=(len-1) && arr[i]==0 && arr[i-1]==0 && arr[i+1]==0){
                arr[i]=1;
                n--;
            }
        }
        if(n==0)
            return true;
        else
            return false;    
    }

    public static void main(String[] args) {
        LC605 obj = new LC605();
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;
        System.out.println(obj.canPlaceFlowers(flowerbed, n)); // Output: true
    }
}