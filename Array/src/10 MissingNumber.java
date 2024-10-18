class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int number = 5;
        System.out.println("Number missing : " + isMissing(arr));
    }
    public static int isMissing(int[] arr){
        int n = arr.length;
        int num = 0;
        for(int j=1;j<n; j++){
            for(int i=0;i<n;i++){
                if(j!=arr[i]){
                    num=j;
                    break;
                }
            }
        }
     return num;
    }
}
