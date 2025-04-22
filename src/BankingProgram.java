import java.util.Scanner;

public class BankingProgram {
  static   Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        double balance = 0 ;


        // Banking Program


        boolean isRunning = true ;
        int choice ;

        while (isRunning){
            System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&");
            System.out.println("Bankacılık Programına Hoşgeldiniz");
            System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&");

            System.out.println("1- Bakiye sorgulama ");
            System.out.println("2- Para yatırma");
            System.out.println("3- Para çekme");
            System.out.println("4- Çıkış yapma");


            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
            choice = scanner.nextInt();

            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit() ;
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false ;
                default -> System.out.println("Lütfen geçerli bir sayı giriniz !!");
            }

        }

        System.out.println("Teşekkürler ! iyi günler !!");




    }

    static void showBalance(double balance){
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.printf("€%.2f\n" , balance);
    }

    static double deposit() {
        double amount;

        System.out.print("Lütfen yatırmak istediğiniz miktarı giriniz : ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Yatırılan miktar negatif olamaz!!");
            return 0 ;
        } else {
            return amount;
        }

    }

    static double withdraw(double balance) {
        double amount;

        System.out.print("Lütfen çekmek istediğiniz tutarı girer misiniz : ");
        amount = scanner.nextDouble();


        if (amount > balance) {
            System.out.print("Geçerli bir tutar giriniz : ");
            return 0;
        } else if (amount < 0) {
            System.out.println("çekilen miktar negatif olamaz");
            return 0;
        } else {
            return amount;
        }

    }
}
