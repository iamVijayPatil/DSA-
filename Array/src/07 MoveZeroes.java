class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,4,8,0};
        System.out.println("Araay :" + MoveZeroes(arr) );
    }
    public static int[] MoveZeroes(int[] arr){
        int j =-1;
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
}
