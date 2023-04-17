package controlStatement;
import java.util.Scanner;
public class Month {
    public static void main(String args[]) {
        System.out.println("WelCome to my Program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("plz Enter Month Name ");
        String month = scanner.next();
        switch(month) {
            case "january":
                System.out.println("this is january");
                break;
            case "February":
                System.out.println("this is February");
                break;
            case "March":
                System.out.println("this is March");
                break;
            case "April":
                System.out.println("this is April");
                break;
            case "May":
                System.out.println("this is May");
                break;
            case "Jun":
                System.out.println("this is Jun");
                break;
            case "July":
                System.out.println("this is July");
                break;
            case "August":
                System.out.println("this is August");
                break;
            case "September":
                System.out.println("this is September");
                break;
            case "October":
                System.out.println("this is October");
                break;
            case "November":
                System.out.println("this is November");
                break;
            case "December":
                System.out.println("this is December");
                break;
            default:
                System.out.println("This is invalid choice");
        }
    }
}
