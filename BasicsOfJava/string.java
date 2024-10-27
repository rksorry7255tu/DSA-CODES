public class string {
    public static void main(String[] args) {

        //String concatenation of strings

        String name=new String("Ravi");
        String name1=new String("Kumar");
        String name2=name+" "+name1;
        System.out.println(name2);

        //charAt
        System.out.println(name.charAt(0));

        //length
        System.out.println(name.length());

        //replace
        String name3=name.replace('R','r');
        System.out.println(name3);

        //subString
        String name4=name2.substring(5,10);
        System.out.println(name4);

        

    }
}
