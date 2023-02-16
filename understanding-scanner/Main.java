//scanner chalauna import this
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Enter your name and address:");
        ///user input lina
        Scanner scannerObj = new Scanner(System.in);
        // nextint ni hunxa nextLine leh string linxa
        String name = scannerObj.nextLine();
        // String name = "Anu Prajapati";
        String address = scannerObj.nextLine();
        System.out.println("Your name is "+name );
        System.out.println("Your address is "+address );



    }
}