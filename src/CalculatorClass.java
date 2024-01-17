import java.util.Scanner;
import static java.lang.System.exit;

public class CalculatorClass {
    public static Scanner in = new Scanner(System.in);
    public static int firstNum;
    public static int secondNum;
    public static boolean retry = true;
    public static int num;

    public static void inputNumbers() {
        System.out.println("Введите первое число:");
        firstNum = inputCheck();
        System.out.println("Введите второе число:");
        secondNum = inputCheck();
    }

    public static int inputCheck() {
            try {
                num = in.nextInt();
            } catch (Exception e) {
                System.out.println("Некорректные данные. На ввод разрешены только цифры!");
                exit(1);
            }
        return num;
    }
    public static void sumMethod() {
        inputNumbers();
        System.out.println("Ответ:\n" + (firstNum + secondNum));
    }

    public static void diffMethod() {
        inputNumbers();
        System.out.println("Ответ:\n" + (firstNum - secondNum));
    }

    public static void multMethod() {
        inputNumbers();
        System.out.println("Ответ:\n" + (firstNum * secondNum));
    }

    public static void divMethod() {
        inputNumbers();
        System.out.println("Ответ:\n" + ((double) firstNum / (double) secondNum));
    }

    public static void isEven() {
        int evenNum;
        boolean isEven;
        System.out.println("Введите число для проверки:");
        evenNum = inputCheck();
        isEven = evenNum % 2 == 0;
        if (isEven) {
            System.out.println("Число " + evenNum + " четное");
        } else {
            System.out.println("Число " + evenNum + " нечетное");
        }
    }

    public static boolean retryOffer() {
        System.out.println("Хотите попробовать другие операции с разными числами?\n 1.Да\n 2.Нет");
        while (retry) {
                int yesOrNo = inputCheck();
                if (yesOrNo != 2 & yesOrNo != 1) {
                    System.out.println("Введите 1(да) или 2(нет):");
                } else if (yesOrNo == 1) {
                    break;
                } else {
                    System.out.println("До свидания!");
                    retry = false;
                }
            }
        return retry;
    }
}
