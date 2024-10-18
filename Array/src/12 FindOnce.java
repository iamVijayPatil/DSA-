class FindOnce {
    public static void main(String[] args) {
        int[] arr = {2, 2, 8,4,4 ,8};
        System.out.println("Number appearing once :" + findOnce(arr));
    }
    public static int findOnce(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int count = 0;
            for (int j = 0; j<n; j++) {
                if (arr[j] == num)
                    count++;
            }
            if (count == 1) return num;
        }
        return -1;
    }
}