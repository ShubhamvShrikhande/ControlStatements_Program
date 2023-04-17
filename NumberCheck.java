package controlStatement;
import java.util.Scanner;
//using switch case statement
public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();
        System.out.println("plz Enter between 1 to 5 Number");
        switch(Number){
            case 1:
            System.out.println(" this is 1 Number");
            break;

            case 2:
                System.out.println(" this is 2 Number");
                break;

            case 3:
                System.out.println(" this is 3 Number");
                break;

            default:
                System.out.println("Invalis Input");
        }
    }
}
