class ConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,0, 1, 1,1,1};
        System.out.println(ConsecutiveOnes(arr));

    }
    public static int ConsecutiveOnes(int[] arr){
        int n=arr.length;
        int count = 0;
        int maxi =0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
            }
            else if(arr[i]==0){
                count=0;
            }
            maxi = Math.max(maxi, count);
        }return maxi;
    }
}
