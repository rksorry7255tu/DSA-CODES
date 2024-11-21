for(int j=index+1;j<arr.length;j++){
            for(int k=j+1;k<arr.length;k++){
                if(arr[j]>arr[k]){
                int temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
                }
            }
        }