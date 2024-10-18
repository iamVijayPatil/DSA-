class LeftRotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 5, 9,122};
        System.out.println("New Array : " + LeftRotateArray(arr));
    }
    public static int[] LeftRotateArray(int[] arr){
        int temp = arr[0];
        int n= arr.length;
        for(int i =1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        return arr;
    }
}
