//Problem Statement: Given an array of size n,
// write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False
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
