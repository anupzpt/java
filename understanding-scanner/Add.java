import java.util.Scanner;
public class Add{
    public static void main(String[] args){
        System.out.println("Enter number to perform addition.");
        System.out.println("Enter 1st number:");
        Scanner obj1= new Scanner(System.in);
        int num1 = obj1.nextInt();
        System.out.println("Enter 2nd number:");
         Scanner obj2= new Scanner(System.in);
        int num2 = obj2.nextInt();
        System.out.println("Addition of number is :" + (num1+num2) );

    }
}