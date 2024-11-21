public class rotateImage {
    public static void main(String[] args) {
        int arr[][]={{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        int arr1[]=new int[arr.length*arr[0].length];
        int i=arr.length-1;
        int j=0;
        int count=0;
        int countarr1=0;
        while(i>=0||j<arr[0].length){
            //System.out.print("{");
            while(j>=0&&j<arr[0].length&&i>=0){
               // System.out.print(arr[i][j]+" ");
               
                arr1[countarr1++]=arr[i][j];
                i--;
            }
            //System.out.println("}");
            
            i=arr.length-1;
            j++;
            if(count==arr.length-1){
                break;
            }
            
            count++;
        }
        for(int k=0;k<arr1.length;k++){
            System.out.print(arr1[k]+" ");
        }
        int m=0;
        for(int k=0;k<arr.length;k++){
            for(int l=0;l<arr[0].length;l++){
                arr[k][l]=arr1[m++];
            }
        }
        for(int k=0;k<arr.length;k++){
            for(int l=0;l<arr[0].length;l++){
                System.out.print(arr[k][l]+" ");
            }
            System.out.println();
        }
    }
}
