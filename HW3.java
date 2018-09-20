import java.util.Scanner;

/**
 * Java. Level 1. Lesson 3. Home Work
 *
 * @author Sergey Khrenov
 * @version date 20.09.18.
 */

class HW3 {
    public static void main(String [] args) {
        gameNumber();
    }
    public static void gameNumber () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваша задача угадать число от 0 до 9");
        int range = 10;
        int number = (int)(Math.random() * range);
        int  attempt = 3;
        while (attempt !=0 ) {
            if (attempt > 1) {
				System.out.println("У вас осталось " + attempt + " попытки");
            } else {
                System.out.println("У вас осталась 1 попытка");
            }
            int inputNumber = scanner.nextInt();
            if (inputNumber == number) {
                System.out.println("Вы угадали!");
                break;
            } else if(inputNumber > number){
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
            attempt--;
            if (attempt == 0) {
                System.out.println("Вы проиграли!");
            }
        }
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        int restart = scanner.nextInt();
        if (restart == 1) {
            gameNumber();
        } else {
            System.out.println("Удачи!");
        }
        scanner.close();
    }
}
