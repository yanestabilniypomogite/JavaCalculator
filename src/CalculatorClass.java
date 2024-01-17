import static java.lang.System.in;

public class CalculatorClass {
    public static void SumMethod(int a, int b) {
        System.out.println("Ответ:\n" + (a + b));
    }
    public static void DiffMethod(int a, int b) {
        System.out.println("Ответ:\n" + (a - b));
    }
    public static void MultMethod(int a, int b) {
        System.out.println("Ответ:\n" + (a * b));
    }
    public static void DivMethod(double a, double b) {
        System.out.println("Ответ:\n" + (a / b));
    }
    public static boolean IsHonest(int a) {
        int remainder = a % 2;
        boolean isHonest;
        isHonest = remainder == 0;
        return isHonest;
    }
    public static void  RetryOffer() {
        System.out.println("Хотите попробовать другие операции с разными числами?\n 1.Да\n 2.Нет");
    }
}
