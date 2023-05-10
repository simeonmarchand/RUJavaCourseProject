import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Take user input
        System.out.print("Patient Name: ");
        String name = scanner.nextLine();

        System.out.print("Patient birthdate (format: mm-dd-yyyy): ");
        String birthdate = scanner.nextLine();

        System.out.print("Patient Weight in Kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Patient Height in meters: ");
        double height = scanner.nextDouble();


    }
}
