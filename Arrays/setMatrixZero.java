import java.util.HashSet;

public class setMatrixZero {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,0,7,8},{0,10,11,12},{13,14,15,0}};
        //int arr[][]={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        //int arr[][]={{1,0}};
        HashSet<Integer> seti=new HashSet<>();
        HashSet<Integer> setj=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    setj.add(j);
                    seti.add(i);
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(seti.contains(i)||setj.contains(j)){
                    arr[i][j]=0;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
