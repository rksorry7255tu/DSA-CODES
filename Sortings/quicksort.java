public class quicksort {
    public static void main(String[] args) {
        quicksort q=new quicksort();
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        q.quicksorts(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public  void quicksorts(int arr[],int low,int high){    
        if(low<high){
            int pIndex=partition(arr, low, high);
            quicksorts(arr, low, pIndex-1);
            quicksorts(arr, pIndex+1, high);
        }
    }
    public int partition(int arr[], int low, int high) {
        if (low < high) {
            int i = low;
            int j = high;
            int pivot = arr[low];
            while (i < j) {
                while(arr[i] <= pivot) {
                    i++;
                }
                while(arr[j] > pivot ) {
                    j--;
                }
                if(i<j){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return low;
    }
}
