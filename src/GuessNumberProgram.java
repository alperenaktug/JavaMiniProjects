import java.util.Random;
import java.util.Scanner;

public class GuessNumberProgram {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess ;
        int attempts = 0 ;
        int randomNumber = random.nextInt(1,11);


        System.out.println("Sayı tahmin etme oyununa hoşgeldiniz !!");
        System.out.println(" 1-10 arasında bir sayı tahmin edebilirsiniz!! ");


        do {
            System.out.print("Lütfen bir sayı giriniz : ");
            guess = scanner.nextInt();
            attempts++ ;

            if (guess < randomNumber){
                System.out.println("Tahminin aranan sayıdan düşük");
            } else if (guess > randomNumber) {
                System.out.println("Tahminin aranan sayıdan yüksek");
            }else {
                System.out.println("Tahmin doğru " + randomNumber);
                System.out.println("Deneme sayısı " + attempts);
            }

        }while (guess != randomNumber);{

            scanner.close();
        }
    }
}
