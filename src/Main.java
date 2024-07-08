import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int birthday;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birthday: ");
        birthday = input.nextInt();
        if (birthday % 12 == 0) {
            System.out.println("Çin zodyağına göre burcun: Maymun");
        } else if (birthday % 12 == 1) {
            System.out.println("Çin zodyağına göre burcun: Horoz");

        } else if (birthday % 12 == 2) {
            System.out.println("Çin zodyağına göre burcun: köpek");

        } else if (birthday % 12 == 3) {
            System.out.println("Çin zodyağına göre burcun Domuz");

        } else if (birthday % 12 == 4) {
            System.out.println("Çin zodyağına göre burcun: Fare");

        } else if (birthday % 12 == 5) {
            System.out.println("Çin zodyağına göre burcun: Öküz");

        } else if (birthday % 12 == 6) {
            System.out.println("Çin zodyağına göre burcun: Kaplan");

        } else if (birthday % 12 == 7) {
            System.out.println("Çin zodyağına göre burcun: Tavşan");

        } else if (birthday % 12 == 8) {
            System.out.println("Çin zodyağına göre burcun: Ejderha");

        } else if (birthday % 12 == 9) {
            System.out.println("Çin zodyağına göre burcun: Yılan");

        } else if (birthday % 12 == 10) {
            System.out.println("Çin zodyağına göre burcun: At");

        } else if (birthday % 12 == 11) {
            System.out.println("Çin zodyağına göre burcun: Koyun");


        }
    }
}