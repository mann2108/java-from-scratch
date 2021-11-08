import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birth year : ");

        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character (enter key)
            System.out.println("Enter your name : ");
            String name = scanner.nextLine();
            int age = 2021 - yearOfBirth;
            if (age >= 0 && age <= 100) {
                System.out.println("Hi " + name + ", your age is " + age + " years");
            } else {
                System.out.println("Invalid birth year.");
            }
        } else {
            System.out.println("Unable to parse birth year");
        }


    }
}
