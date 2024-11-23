public class quicksortttt {
    public static void main(String[] args) {
        quicksortttt q = new quicksortttt();
        int arr[] = { 13, 46, 24, 52, 20, 9 };
         q.quick(arr, 0, arr.length-1);
        //q.partition(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    public void quick(int arr[], int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            quick(arr, low, pIndex - 1);
            quick(arr, pIndex + 1, high);
        }
    
    }
    
    public int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low+1;
        int j = high;
    
        while (i <= j) {
            while ( i <= high &&arr[i] <= pivot) {
                i++;
            }
            while ( j >= low && arr[j] > pivot ) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }
    void swap(int arr[],int low,int high){
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
}