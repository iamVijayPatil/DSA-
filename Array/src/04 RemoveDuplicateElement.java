//Problem Statement: Given an integer array sorted in non-decreasing order,
//remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.
class RemoveDuplicateElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3, 4};
        System.out.println("Unique Elements :" + removeDuplicate(arr));
    }
    public static int removeDuplicate(int[] arr) {
        int i = 0;
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
}
