//Given an array, we have to find the largest element in the array
class LargestElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 5, 9,122};
        System.out.println("Largest Element : "+ Largest(arr));
    }
    public static int Largest(int[]arr){
        int largest = arr[0];
        int n = arr.length;;
            for(int i=0;i<n;i++){
                if(arr[i] > largest){
                largest=arr[i];
            }
        }return largest;
    }
}