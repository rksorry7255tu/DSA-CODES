public class selectionsort {
    public static void main(String []args){
    //    selection sorting
    int arr[]={13,46,24,52,20,9};
    int small=arr[0];
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]>=arr[j]){
                small=arr[j];
                arr[j]=arr[i];
                arr[i]=small;
            }
        }
    }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    }
}
