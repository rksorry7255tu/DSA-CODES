public class sumOfAllDivision {
    public static void main(String[] args) {
        int n = 4;

        // int sumofalldivision=0;
        // for(int i=1;i<=n;i++){
        //     sumofalldivision=sumofalldivision+sum(i);
        // }
        // System.out.println(sumofalldivision);

        //or
        long sumOfAllDivisors = 0;

        // Iterate over each number from 1 to n
        for (int i = 1; i <= n; i++) {
            // Add i to the sum for all its multiples
            sumOfAllDivisors =sumOfAllDivisors+ (n / i) * i;
        }
    
        System.out.println(sumOfAllDivisors);
       
    }
    // public static int sum(int n){
    //     int sum = 0;

    //     for (int i = 1; i <= n; i++) {
    //         if (n % i == 0) {
    //             // System.out.println(i);
    //             sum = sum + i;
    //         }
    //     }
    //     return sum;
    // }
}
