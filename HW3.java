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
        System.out.println("���� ������ ������� ����� �� 0 �� 9");
        int range = 10;
        int number = (int)(Math.random() * range);
        int  attempt = 3;
        while (attempt !=0 ) {
            if (attempt > 1) {
				System.out.println("� ��� �������� " + attempt + " �������");
            } else {
                System.out.println("� ��� �������� 1 �������");
            }
            int inputNumber = scanner.nextInt();
            if (inputNumber == number) {
                System.out.println("�� �������!");
                break;
            } else if(inputNumber > number){
                System.out.println("���������� ����� ������");
            } else {
                System.out.println("���������� ����� ������");
            }
            attempt--;
            if (attempt == 0) {
                System.out.println("�� ���������!");
            }
        }
        System.out.println("��������� ���� ��� ���? 1 � �� / 0 � ���");
        int restart = scanner.nextInt();
        if (restart == 1) {
            gameNumber();
        } else {
            System.out.println("�����!");
        }
        scanner.close();
    }
}
