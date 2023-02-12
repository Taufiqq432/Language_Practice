import java.util.Scanner;
public class learning_condition {
    public static void main(String[] args) {
  Scanner a=new Scanner(System.in);
        System.out.println("Enter the age");
  int age= a.nextInt();
  //if else statement
  if(age>16){
      System.out.println("You can get this job");

  }
  else {
      System.out.println("Rejected");
  }
  //else if statement
        Scanner b=new Scanner(System.in);
        System.out.println("enter the number of people");

  int b1=b.nextInt();
  if(b1>50){
      System.out.println("this company is bigger");


  }
  else if(b1>40){
      System.out.println("this is big company");

  }
  else if(b1>30){
      System.out.println("this company is not a small company ");
  }
  else{
            System.out.println("this is a small company");
        }

    }
}
