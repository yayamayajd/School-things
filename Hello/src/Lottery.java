import java.util.Random;

public class Lottery {

    public static void main(String[] args) {
        Random random = new Random();
        int firstNumber = random.nextInt(100);
        int secondNumber = random.nextInt(100);
        int thirdNumber = random.nextInt(100);
        int forthNumber = random.nextInt(100);
        System.out.println("your lottery number is " + firstNumber + " " + secondNumber + " " + thirdNumber + " " + forthNumber );
        if(firstNumber == secondNumber && secondNumber == thirdNumber && thirdNumber == forthNumber) {
            System.out.println("BINGOOOO! You are the biggest winner!!!!");
        }
        if(firstNumber == secondNumber || firstNumber == thirdNumber || firstNumber == forthNumber || secondNumber == thirdNumber || secondNumber == forthNumber || thirdNumber == forthNumber){
            System.out.println("You got a small Bingo! ");
        }
        else{System.out.println("try it again, maybe you are the next lucky bunny!");
        }
    }
}