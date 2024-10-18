//Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.
class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {1, 7, 7, 7, 7,7};
        SecondLargest(arr);
        System.out.println("2nd Laregst Elemeent :"+ SecondLargest(arr));
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
    public static int SecondLargest(int[] arr){
        int largest = Largest(arr);
        int secondLargest=0;
        int n = arr.length;
        for (int i=n-2;i >= 0;i--){
            if (arr[i] != largest){
                secondLargest = arr[i];
                break;
            }
        }return secondLargest;
    }
}
