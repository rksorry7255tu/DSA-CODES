import java.util.*;

public class nextPermutation {
    public static void main(String[] args) {
        //int arr[] = { 2, 1, 5, 4, 3, 0, 0 };
        int arr[]={2,3,1};
        int index = -1;

        int i = arr.length - 2;
        while (i >= 0) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
            i--;
        }
        if (index == -1) {
            Arrays.sort(arr);
        } else {
            for (int j = arr.length - 1; j >=0; j--) {
                if (arr[j] > arr[index]) {
                    int temp = arr[j];
                    arr[j] = arr[index];
                    arr[index] = temp;
                    break;
                }
            }

            Arrays.sort(arr, index+1, arr.length);

           
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        //System.out.println(index);

    }
}
