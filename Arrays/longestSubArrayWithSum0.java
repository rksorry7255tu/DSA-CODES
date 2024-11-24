public class longestSubArrayWithSum0 {
    public static void main(String[] args) {

        //time exceeds
        int arr[]={15, -2, 2, -8, 1, 7, 10, 23};
        int max=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum==0){
                    max=Math.max(max, j-i+1);
                }
                //System.out.print(sum+" ");
            }
            //System.out.println();
        }
        System.out.println(max);
    }
}
