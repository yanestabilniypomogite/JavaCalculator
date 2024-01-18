import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean retry = true;
        int choice;
        Scanner in = new Scanner(System.in);
        while (retry) {
            System.out.println("Выберите одну из операций(Введите число от 1 до 6):\n 1.Сложение\n 2.Вычитание\n 3.Умножение\n 4.Деление\n 5.Проверка на четность\n 6.Выход");
            choice = CalculatorClass.inputCheck();
            System.out.println(choice);
            if (choice > 0 & choice < 7) {
                if (choice == 5) {
                   CalculatorClass.isEven();
                   retry = CalculatorClass.retryOffer();
                } else if (choice == 1) {
                    CalculatorClass.sumMethod();
                    choice = -1;
                    retry = CalculatorClass.retryOffer();
                } else if (choice == 2) {
                    CalculatorClass.diffMethod();
                    retry = CalculatorClass.retryOffer();
                    choice = 0;
                } else if (choice == 3) {
                    CalculatorClass.multMethod();
                    retry = CalculatorClass.retryOffer();
                } else if (choice == 4) {
                    CalculatorClass.divMethod();
                    retry = CalculatorClass.retryOffer();
                } else if (choice == 6) {
                    System.out.println("До свидания!");
                    retry = false;
                }
            }  else {
                    System.out.println("Введите значение от 1 до 6!");
                }
            }
        }
    }

