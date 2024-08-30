import java.util.Scanner;
//导入模块/类，可以用于执行input输入
import java.util.Random;
//导入随机数字模块

public class GameJava {
    //定义类名，写法是大写开头的驼峰
    public static void main(String[] args) {
        //所有主函数/方法都由这个固定的写法开始
        // Type name = what we create and place in the name
        // Type of box, this is what i call my box = and place this in the box
        Random random = new Random();
        //把导入的模块实体化才能进行使用
        int jiadaiNumber = random.nextInt(900) + 100;
        //把得到的随机值赋予数字变量jiadaiNumber,变量的写法由小写开头的驼峰写法
        String secrete = String.valueOf(jiadaiNumber);
        //把jiadaiNumber的类型转为字符串，使用方法String.valueOf(变量名)
        System.out.println("--------------jiadai-------------");
        int counter = 0;
        //定义计数器
        System.out.println("welcome to my game:try to guess which number that in jiadai's mind now.");
        System.out.println("You need input 3 numbers.");
        System.out.println("If the number is right in the right position, you will get 1'O'.");
        System.out.println("if the number is right but in wrong position, you will get 1'A',");
        System.out.println("if the number is totolly wrong,you will get 1'O'.");
        System.out.println("You have 7 chance.");
        System.out.println("Good luck :)");
        System.out.println("let's start!!!");
        Scanner scanner = new Scanner(System.in);
        //先把scanner这个类实体化才能进行使用
        String result = "XXX";  // 用于构建结果的字符串
        while (counter < 7 && result != "OOO") {
            System.out.println("try to guess which number that in jiadai's mind now");
            System.out.println("Please input your guess:");
            String guess = scanner.nextInt(System.in);
            //把玩家输入的数字传入新变量，这样就不用使用转换方法，直接把数字变量转为字符串变量
            if (guess.length() != 3) ;
            {
                System.out.println("Pealse write a number between 100 - 999");
                continue;
            }

            for (int i = 0; i < 3; i++) {
                char j = guess.charAt(i);
                if (j == secrete.charAt(i)) {
                    result.charAt(i) = "O";
                } else if (secrete.contains(j)) {
                    result.charAt(i) = "A";
                }
                if (result != "OOO") {
                    counter ++;
                    System.out.println("Your result is ...");
                    System.out.println(result);
                    if (counter < 4) {
                        System.out.println("you already tried" + counter + " time, you have" + (7 - counter) + "time left");
                        System.out.println("Don't worry, try it again :)");
                    } else {
                        System.out.println("Opps, not too many chance left. ");
                        System.out.println("You can only try" + (7 - counter) + " time,think carefully);");
                    }


                }
            }
//        if ( value = 1) {
//            do something with value
//        } else if (value is something else) {
//            do something else
//        } else {
//            cancel the if statement
//        }


            if (result != "OOO" && counter >= 7) {
                System.out.println("game over! The number in jiadai's mind is" + jiadaiNumber + "see you next time!");
            } else {
                System.out.println("Correct!!!!!");
                System.out.println("Congratulations! You are the one in the world who knows Jiadai most!");
                System.out.println("Jiadai is super happy! You make Jiadai a daaaaaaaaay!");

            }
        }
    }
}
