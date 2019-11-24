public class Arrays8 {
    public static void main(String[] args) {
        int arr[] = {5, -7, -3, 5, 6, -99, -34, 0, 34, 2, 7, 89, 3, 4, -1, 5, -1, -2};
        int arr1 [] = new int[arr.length];
        int i =0, j = arr.length-1;
        
        for(int k=0; k<arr.length; k++){
            if(arr[k]<0){
                  arr1[j--] = arr[k];}
                  else {
                arr1[i++] = arr[k];
            }
                System.out.println("Value");
            printArray(arr1);

            }
        }

    private static void printArray(int[] arr1) {
    }

}

