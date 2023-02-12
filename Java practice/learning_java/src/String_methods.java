public class String_methods {
    public static void main (String[]arg){
        String name="Taufique";
        System.out .println(name);
        int value =name.length();
        System.out .println(value);
        String a=name.toLowerCase();
        System.out.println(a);
        String b=name.toUpperCase();//function are using cameCaseConvention
        System.out.println(b);
        //trim method used for removing space
        //substring return new string that start with corresponding index
        String c= name.substring(1,5);
        System.out.println(c);
        String d=name.replace('a','o');
        System.out.println(d);
        System.out.println(name.replace("que","q"));
        //startwith and endwith functions return boolean
        System.out .println(name.startsWith("ta"));
        System.out.println(name.endsWith("e"));
        //indexof,lastindex of
        // escape sequence /n/t/

    }
}
