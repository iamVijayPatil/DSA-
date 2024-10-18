class ArraySort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 5, 3,4};
        if(isSorted(arr)){
            System.out.println("Array is Sorted");
        }
        else{
            System.out.println("Array is not Sorted");
        }
    }
    public static boolean isSorted(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]>=arr[i-1]){
            }
            else{
                return false;
            }
        }return true;
    }
}
