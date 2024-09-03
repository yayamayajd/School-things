
public class PersonalNumber2 {
    public static void main(String[] args) {
        //får ssn som den första av args index, så det kan köras när man kör programet på commad line
        String ssn = args[0];
        //varning
        if (ssn.length() != 13) {
            System.out.println("Please enter the right number");
            return;
        }
        //sätter metoderna
        //kör metoderna
        String gender = genderCalculator(ssn);
        String age = ageCalculator(ssn);
        String answer = String.format("your age is %s, your gender is %s", age,gender);
        System.out.println(answer);
    }


    public static String genderCalculator(String ssn) {
    String gender;
    //take the last charactor from personal number with str.substring(index) method
    String lastNumber = ssn.substring(11, 12);
    //change the type to int with the Integer.parseInt(str) method
    int genderNumber = Integer.parseInt(lastNumber);

    //the if-else solution
    if (genderNumber % 2 == 0){
        gender = "female";
    }else{
        gender = "male";
    }
    return gender;
    }

    public static String ageCalculator(String ssn) {

    String birthYear = ssn.substring(0, 4);
    //change the type to int with Integer.parseInt(str) method
    int birthYearNumber = Integer.parseInt(birthYear);
    int age = 2024 - birthYearNumber;
    String nowAge = String.valueOf(age);
    return nowAge;
    }


}