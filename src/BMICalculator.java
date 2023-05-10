import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Patient First and Last Name: ");
        String name = scanner.nextLine();

        System.out.print("Patient birthdate (format: mm-dd-yyyy): ");
        String birthdate = scanner.nextLine();

        System.out.print("Patient Weight in Kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Patient Height in meters: ");
        double height = scanner.nextDouble();

        // Calculate the BMI and store this information
        double bmi = weight / (height * height);

        // Display the persons name and the BMI result
        String category;
        if (bmi < 18.5){
            category = "Underweight";
        } else if (bmi < 25){
            category = "Normal Weight";
        } else if (bmi < 30){
            category = "Overweight";
        } else {
            category = "Obese";
        }

        System.out.println(name + "'s BMI Category is: " + category);
        System.out.println(name + "'s BMI is: " + bmi);
    }
}
