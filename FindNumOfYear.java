import java.util.Scanner;


public class FindNumOfYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double min = input.nextDouble();
        double days = min / (24 * 60);
        double years = days / 365;

        System.out.println("year is : " + years + " day is : " + days);
    }
}
