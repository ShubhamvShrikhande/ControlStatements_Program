package controlStatement;
import java.util.Scanner;
public class CubeNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to my program");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = num * num * num;
        System.out.println("The Cube of number  is= " + result);

    }
}
