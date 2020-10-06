import java.util.Scanner;

public class CalculateTips {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();
    
        double tip = subtotal + (subtotal * gratuity / 100);
    
        System.out.println("the tip is $: " + tip );
    
        
    }
}
