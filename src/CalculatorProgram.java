import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number1 ;
        double number2 ;
        char operator ;
        double result = 0 ;

        System.out.print("Lütfen ilk sayıyı giriniz : " );
        number1 = scanner.nextDouble();

        System.out.print("Lütfen (+ , - , * , / , ^) bu operatörlerden birini giriniz : ");
        operator = scanner.next().charAt(0);

        System.out.print("Lütfen ikinci sayıyı giriniz : " );
        number2 = scanner.nextDouble();


        switch (operator){
            case '+' -> result = number1 + number2 ;
            case '-' -> result = number1 - number2 ;
            case '*' -> result = number1 * number2 ;
            case '/' -> {
                if (number2 == 0){
                    System.out.println("İkinci sayı sıfır olamaz lütfen başka bir değer girin!!");
                }else{
                    result = number1 / number2 ;
                }
            }
            case '^' -> result = Math.pow(number1 , number2);
            default -> System.out.println("Lütfen uygun bir operator seçiniz !!");

        }

        System.out.println(result);

        scanner.close();



    }
}
