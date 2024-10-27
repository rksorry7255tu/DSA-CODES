public class Variables {
    public static void main(String []args){
        String name="Ravi";
        String neighbour="monu";
        
        String friend=neighbour;
        System.out.println(name);
        System.out.println(friend);
     

        //primitive
        //byte - 1[-128 to 127] it can store no from -128 to 127.
        byte b=-127;
        System.out.println(b);

        //short - 2[-32768 to 32767]
        short a=-32768;
        System.out.println(a);

        // int - 4[-2147483648 to 2147483647]
        int c=-2147483648;
        System.out.println(c);

        //long - 8[it's range depends on programing language.]
        long d=128*256*256*256;
        System.out.println(d);

        //float - 4 [3.4E-38 to 3.4E+38][it's floating point goes upto 7 after decimal]
        float e=99999991111111111111111111111111111111.2222F;
        System.out.println(e);

        double f=1.12232132323232323323323223231;
        System.out.println(f);

        //char - 2
        char g='a';
        System.out.println(g);

        //boolean - 1
        boolean h=true;
        System.out.println(h);


        //Non-premetive
        //String
        String s="ravi";
        System.out.println(s.length());

    }
}
