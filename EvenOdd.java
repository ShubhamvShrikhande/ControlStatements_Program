package controlStatement;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my Program");
        System.out.println("Enter a Number");
        int num = scanner.nextInt();
        if(num % 2 == 0){
            System.out.println(num+ " :is Even number");
        }
        else{
            System.out.println(num+ ": is odd Number");
        }
    }
}
