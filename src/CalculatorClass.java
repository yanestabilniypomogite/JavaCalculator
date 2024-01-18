import java.util.Scanner;
import static java.lang.Integer.parseInt;
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
        System.out.println(firstNum);
        System.out.println("Введите второе число:");
        secondNum = inputCheck();
        System.out.println(secondNum);
    }

    public static int inputCheck() {
            try {
                num = parseInt(in.nextLine());
            } catch (Exception e) {
                System.out.println("Некорректные данные. На ввод разрешены только цифры!");
            }
        return num;
    }
    public static void sumMethod() {
        System.out.println("Вы выбрали сложение!\n");
        inputNumbers();
        System.out.println("Ответ:\n" + (firstNum + secondNum));
    }

    public static void diffMethod() {
        System.out.println("Вы выбрали вычитание!\n");
        inputNumbers();
        System.out.println("Ответ:\n" + (firstNum - secondNum));
    }

    public static void multMethod() {
        System.out.println("Вы выбрали умножение!\n");
        inputNumbers();
        System.out.println("Ответ:\n" + (firstNum * secondNum));
    }

    public static void divMethod() {
        System.out.println("Вы выбрали деление!\n");
        inputNumbers();
        System.out.println("Ответ:\n" + ((double) firstNum / (double) secondNum));
    }

    public static void isEven() {
        int evenNum;
        boolean isEven;
        System.out.println("Определение четности числа!\nВведите число для проверки:");
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
