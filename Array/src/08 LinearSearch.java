class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int num=4;
        System.out.println(isFound(arr,num));
    }
    public static boolean isFound(int[] arr, int num){
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                return true;
            }
        }return false;
    }
}
