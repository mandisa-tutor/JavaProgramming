import java.util.Scanner;

public class JavaProgramming {

    public static void main (String args[]){

      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter quantity");
      int quantity = sc.nextInt();

    switch (quantity){
        case(1):
            System.out.println("You hcae chosen 1");
            break;
        case(2):
            System.out.println("You hcae chosen 2");
            break;
        default:
            System.out.println("Invalude choice");
    }


    }
}
