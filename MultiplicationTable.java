package controlStatement;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("WelCome to my Program");
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enetr th Number");
        int no = scanner.nextInt();
        for(int i=1;i<=10;i++)
            System.out.println(no+ " * " + i + " = " +( no * i));
    }
}
