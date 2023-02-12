public class String_learning {
    public static void main (String[] args) {
        //String is a class in java not a primitive data type
        String name=new String("data");
        System.out.println(name);
        //but string can be used in data type
        String names="clear";
        System.out.println(names);
        //print =output without new line
        //println= ouput with new line
        //printf=output with format specifier
        //system.out.format is same as printf

        int a= 10;
        float b=3.4f;
        System.out.printf("the value of a %d and the value of b %f",a,b);
    }
}
