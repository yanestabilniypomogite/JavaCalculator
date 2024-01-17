import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isWork = true;
        int yesOrNo;
        int firstNum;
        int secondNum;
        int honestNum;
        int chois;
        while (isWork) {
            System.out.println("\nВыберите одну из операций(Введите число от 1 до 6):\n 1.Сложение\n 2.Вычитание\n 3.Умножение\n 4.Деление\n 5.Проверка на четность\n 6.Выход");
            chois = in.nextInt();
            if (chois > 0 & chois < 7) {
                if (chois == 5) {
                    System.out.println("Введите число для проверки:");
                    honestNum = in.nextInt();
                    if (CalculatorClass.IsHonest(honestNum)) {
                        System.out.println("Число " + honestNum + " четное");
                        CalculatorClass.RetryOffer();
                        yesOrNo = in.nextInt();
                        while (yesOrNo != 1 || yesOrNo != 2) {
                            if (yesOrNo == 1) {
                                break;
                            } else if (yesOrNo == 2) {
                                System.out.println("До свидания!");
                                isWork = false;
                                break;
                            } else {
                                System.out.println("Введите 1(да) или 2(нет):");
                                yesOrNo = in.nextInt();
                            }
                        }
                    } else {
                        System.out.println("Число " + honestNum + " нечетное");
                        CalculatorClass.RetryOffer();
                        yesOrNo = in.nextInt();
                        while (yesOrNo != 1 || yesOrNo != 2) {
                            if (yesOrNo == 1) {
                                break;
                            } else if (yesOrNo == 2) {
                                System.out.println("До свидания!");
                                isWork = false;
                                break;
                            } else {
                                System.out.println("Введите 1(да) или 2(нет):");
                                yesOrNo = in.nextInt();
                            }
                        }
                    }
                } else if (chois == 1) {
                    System.out.println("Введите первое число:");
                    firstNum = in.nextInt();
                    System.out.println("Введите второе число:");
                    secondNum = in.nextInt();
                    CalculatorClass.SumMethod(firstNum, secondNum);
                    CalculatorClass.RetryOffer();
                    yesOrNo = in.nextInt();
                    while (yesOrNo != 1 || yesOrNo != 2) {
                        if (yesOrNo == 1) {
                            break;
                        } else if (yesOrNo == 2) {
                            System.out.println("До свидания!");
                            isWork = false;
                            break;
                        } else {
                            System.out.println("Введите 1(да) или 2(нет):");
                            yesOrNo = in.nextInt();
                        }
                    }
                } else if (chois == 2) {
                    System.out.println("Введите первое число:");
                    firstNum = in.nextInt();
                    System.out.println("Введите второе число:");
                    secondNum = in.nextInt();
                    CalculatorClass.DiffMethod(firstNum, secondNum);
                    CalculatorClass.RetryOffer();
                    yesOrNo = in.nextInt();
                    while (yesOrNo != 1 || yesOrNo != 2) {
                        if (yesOrNo == 1) {
                            break;
                        } else if (yesOrNo == 2) {
                            System.out.println("До свидания!");
                            isWork = false;
                            break;
                        } else {
                            System.out.println("Введите 1(да) или 2(нет):");
                            yesOrNo = in.nextInt();
                        }
                   }
                } else if (chois == 3) {
                    System.out.println("Введите первое число:");
                    firstNum = in.nextInt();
                    System.out.println("Введите второе число:");
                    secondNum = in.nextInt();
                    CalculatorClass.MultMethod(firstNum, secondNum);
                    CalculatorClass.RetryOffer();
                    yesOrNo = in.nextInt();
                    while (yesOrNo != 1 || yesOrNo != 2) {
                        if (yesOrNo == 1) {
                            break;
                        } else if (yesOrNo == 2) {
                            System.out.println("До свидания!");
                            isWork = false;
                            break;
                        } else {
                            System.out.println("Введите 1(да) или 2(нет):");
                            yesOrNo = in.nextInt();
                        }
                    }
                } else if (chois == 4) {
                    System.out.println("Введите первое число:");
                    firstNum = in.nextInt();
                    System.out.println("Введите второе число:");
                    secondNum = in.nextInt();
                    CalculatorClass.DivMethod(firstNum, secondNum);
                    CalculatorClass.RetryOffer();
                    yesOrNo = in.nextInt();
                    while (yesOrNo != 1 || yesOrNo != 2) {
                        if (yesOrNo == 1) {
                            break;
                        } else if (yesOrNo == 2) {
                            System.out.println("До свидания!");
                            isWork = false;
                            break;
                        } else {
                            System.out.println("Введите 1(да) или 2(нет):");
                            yesOrNo = in.nextInt();
                        }
                    }
                } else if (chois == 6) {
                    System.out.println("До свидания!");
                    isWork = false;
                    break;
                }
            } else {
                System.out.println("Введите значение от 1 до 6!");
            }
        }
    }
}