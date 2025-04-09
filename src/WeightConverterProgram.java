import java.sql.SQLOutput;
import java.util.Scanner;

public class WeightConverterProgram {
    public static void main(String[] args) {

        // Ağırlık Dönüşüm Programı

        Scanner scanner = new Scanner(System.in);
        double weight ;
        double  newWeight;
        int choice ;


        System.out.println("Ağırlık Dönüştürme Programına Hoşgeldiniz!!");
        System.out.println("1 : Lbs i kg a dönüştümek için ");
        System.out.println("2 : Kg ı lbs e dönüştürmek için ");

        System.out.print("Choise : ");
        choice = scanner.nextInt();

     if (choice == 1){
         System.out.print("Lütfen ağırlığınızı lbs cinsinden giriniz : ");
         weight = scanner.nextDouble();
         if (weight < 0){
             System.out.println("Lütfen pozitif bir değer giriniz..");
         }else{

         newWeight = weight * 0.453592 ;
         System.out.printf("Yeni ağırlığınız : %.2f " , newWeight);
         }
     }else if(choice == 2){
            System.out.print("Lütfen ağırlığınızı kg cinsinden giriniz : ");
            weight = scanner.nextDouble();
            if (weight < 0){
                System.out.println("Lütfen pozitif bir değer giriniz..");
            }else{
                newWeight = weight * 2.20462 ;
                System.out.printf("Yeni ağırlığınız : %.2f ", newWeight);
            }


     }else{
         System.out.println("Lütfen geçerli bir seçenek giriniz!! ");
     }



    }
}
