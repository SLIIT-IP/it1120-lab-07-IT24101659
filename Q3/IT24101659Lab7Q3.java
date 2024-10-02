import java.util.Scanner;

public class IT24101659Lab7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter total bill amount for customer " + (i + 1) + ": ");
            double billAmount = input.nextDouble();

            System.out.println("Enter mode of payment (C for cash, O for other): ");
            char paymentMode = input.next().charAt(0);

            while (paymentMode != 'C' && paymentMode != 'c' && paymentMode != 'O' && paymentMode != 'o') {
                System.out.println("Payment Mode is Not Valid. Please enter C or O: ");
                paymentMode = input.next().charAt(0);
            }

            double discount = 0;
            if (paymentMode == 'C' || paymentMode == 'c') {
                discount = billAmount * 0.05;
            }

            double amountToBePaid = billAmount - discount;

            System.out.println("Bill Amount: " + billAmount);
            System.out.println("Discount: " + discount);
            System.out.println("Amount to be Paid: " + amountToBePaid);
            System.out.println();
        }
    }
}