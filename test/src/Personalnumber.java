
import java.util.Scanner;

public class Personalnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to the personalnumbers calculater");
        System.out.printf("Please enter the personalnumber (YYYYMMDD-XXXX): ");
        String personalNumber = scanner.nextLine();
        if (personalNumber.length() != 13) {
            System.out.println("Please enter the right number");
            return;
        }
        System.out.println("Your personal number is : " + personalNumber);

        //calculate gender
        String gender;
        //take the last charactor from personal number with str.substring(index) method
        String lastNumber = personalNumber.substring(11,12);
        //change the type to int with the Integer.parseInt(str) method
        int genderNumber = Integer.parseInt(lastNumber);

        //the if-else solution
        /*if (genderNumber % 2 == 0){
            gender = "female";
        }else{
            gender = "male";
        }
        */
        //use the Ternary Operator instead if-else, it work the same way
        //format: conditional expression ? val1:val2
        //calculate the conditional expression, if result is true then return val1, verse versa
        gender = genderNumber % 2 == 0 ? "female" : "male";


        //calculate age
        //take the birthday apart from personal number, use the str.substring(index) method
        String birthYear = personalNumber.substring(0,4);
        //change the type to int with Integer.parseInt(str) method
        int birthYearNumber = Integer.parseInt(birthYear);
        int age = 2024-birthYearNumber;

        System.out.println("your gender is " + gender);
        System.out.println("your age is " + age);


    }
}
