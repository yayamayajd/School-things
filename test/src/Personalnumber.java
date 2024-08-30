
import java.util.Scanner;

public class Personalnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to the personalnumbers calculater");
        System.out.printf("Please enter the personnalnumber (YYYYMMDD-XXXX): ");
        String personalNumber = scanner.nextLine();
        if (personalNumber.length() != 13) {
            System.out.println("Please enter the right number");
            return;
        }
        System.out.println("Your personnummer: " + personalNumber);

        //calculate gender
        String gender;
        String lastNumber = personalNumber.substring(12,13);
        int genderNumber = Integer.parseInt(lastNumber);
        if (genderNumber % 2 == 0){
            gender = "female";
        }else{
            gender = "male";
        }

        //calculate age
        String birthYear = personalNumber.substring(0,4);
        int birthYearNumber = Integer.parseInt(birthYear);
        int age = 2024-birthYearNumber;

        System.out.println("your gender is " + gender);
        System.out.println("your age is " + age);


    }
}
