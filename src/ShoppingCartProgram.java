import java.util.Scanner;

public class ShoppingCartProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item ;
        double price ;
        int quantity ;
        char currency = '$';
        double total ;


        System.out.print("What item would you like to ? ");
        item = scanner.nextLine();

        System.out.print("What is the price for each ? ");
        price = scanner.nextDouble();

        System.out.print("How many would you like ? ");
        quantity = scanner.nextInt();

        total = quantity * price ;

        System.out.println(" You have bought " + quantity + " " + item);
        System.out.println("Your total is " + total +" " +  currency);

        scanner.close();


    }
}
