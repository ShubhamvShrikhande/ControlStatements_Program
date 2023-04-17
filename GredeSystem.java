package controlStatement;
//using if else ladder
public class GredeSystem {
    public static void main(String[] args) {
        int marks = 70;
        if(marks >= 50 && marks < 60){
            System.out.println("D grede :" + marks);
        }
        else if (marks >=60 && marks < 70){
            System.out.println("C grede : " + marks);
        }
        else if(marks >= 60 && marks < 80){
            System.out.println("B grede : " + marks);
        }
        else if(marks >= 80){
            System.out.println("A grede : " + marks);
        }
        else{
            System.out.println("is defulat statement");
        }
    }
}
