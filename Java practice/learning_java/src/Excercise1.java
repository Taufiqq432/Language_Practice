import java.util.Scanner;
class Subject{
    //int max=100;
    int obtain;
}

public class Excercise1 {
    public static void main(String_learning[] args) {
        Subject s1= new Subject();
        System.out.println("enter subject1 number :");
        Scanner sc = new Scanner(System.in);
        s1.obtain=sc.nextInt();
        Subject s2= new Subject();
        System.out.println("Enter Subject 2 number :");
        s2.obtain=sc.nextInt();
        Subject s3= new Subject();
        System.out.println("Enter Subject 3 number :");
        s3.obtain=sc.nextInt();
        Subject s4= new Subject();
        System.out.println("Enter Subject 4 number :");
        s4.obtain=sc.nextInt();
        Subject s5= new Subject();
        System.out.println("Enter Subject 5 number :");
        s5.obtain=sc.nextInt();
        int sum = s1.obtain+ s2.obtain+ s3.obtain+ s4.obtain+ s5.obtain;
        int percent=sum*100/500;
        System.out.println("Total Percentage is" +percent+ " % ");



    }
}
