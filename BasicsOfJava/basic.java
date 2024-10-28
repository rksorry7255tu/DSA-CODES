public class basic {
    public static void main(String[] args) {
        System.out.print("Hello world with java");
        System.out.println("Hello world with java");

        System.out.println("Hello world with java");
        System.out.print("Hello world with java\n");
        System.out.print("Hello world with java\n");

        //print the pattern
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");

        //or
        System.out.println("*\n**\n***\n****");

        //pattern
        for(int i=1;i<5;i++){
            for(int j=1;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        //variables
        String name="Ravi";
        int a=25;
        int b=10;
        int age=19;
        double price=25.25;
        
    }
}
