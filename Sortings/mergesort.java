import java.util.ArrayList;

public class mergesort {
    public static void main(String[] args) {
        mergesort m = new mergesort();
        //int arr[] = { 13, 46, 24, 52, 20, 9 };
        int arr[]={52,2,9};
        int low = 0;
        int high = arr.length-1;
        //int mid = (low + high) / 2;
        m.mergesorts(arr, low, high);
       //m.merge(arr, low, mid, high);
      
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

    void mergesorts(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;
        mergesorts(arr, low, mid);
        mergesorts(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    void merge(int arr[], int low, int mid, int high) {
       ArrayList<Integer> list=new ArrayList<>();
       int left=low;
       int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;
            }else {
                list.add(arr[right]);
                right++;
            }

        }
        while(left<=mid){
            list.add(arr[left]);
            left++;
        }
        while(right<=high){
            list.add(arr[right]);
            right++;
        }
       
        for (int i = 0; i < list.size(); i++) {
            arr[low + i] = list.get(i);
        }
        System.out.println(list);
    }
}
