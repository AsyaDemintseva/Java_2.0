
import java.awt.*;
import java.lang.ref.Cleaner;
import java.util.Scanner;

public class CalculatorException {

        public static void main(String[] args) throws Exception {

            Scanner inp1 = new Scanner(System.in);
            Scanner inp2 = new Scanner(System.in);

            String choise = "Да";
            while (choise.equals("Да")) {
                System.out.println("Вам доступны следующие операции: ");
                System.out.println("1. Сложение");
                System.out.println("2. Вычитание");
                System.out.println("3. Умножение");
                System.out.println("4. Деление");
                System.out.println("5. Квадрат числа");
                System.out.println("6. Корень числа");
                System.out.println("");
                System.out.print("Выберите операцию, указав её номер: ");
                int i = 0;

                while (i < 1 || i > 6) {
                        try {
                            i = inp1.nextInt();
                            if (i < 1 || i > 6) {
                                System.out.println("Не верный номер операции! Попробуйте ещё раз.");
                            }
                        } catch (Exception e) {
                            System.out.println("Что это?");
                        }
                }

                System.out.print("Введите число 'a': ");
                Scanner inp3 = new Scanner(System.in);
                double a = inp3.nextDouble();
                double b = 0;
                if (i < 5) {
                    System.out.print("Введите число 'b': ");
                    b = inp1.nextDouble();
                }

                switch (i) {
                    case (1): {
                        double c = MathOperationsException.addition(a, b);
                        System.out.println("Результат: " + a + " + " + b + " = " + c);
                        break;
                    }
                    case (2): {
                        double c = MathOperationsException.subtraction(a, b);
                        System.out.println("Результат: " + a + " - " + b + " = " + c);
                        break;
                    }
                    case (3): {
                        double c = MathOperationsException.miltiplication(a, b);
                        System.out.println("Результат: " + a + " * " + b + " = " + c);
                        break;
                    }
                    case (4): {
                        double c = MathOperationsException.division(a, b);
                        System.out.println("Результат: " + a + " / " + b + " = " + c);
                        break;
                    }
                    case (5): {
                        double c = MathOperationsException.sqr(a);
                        System.out.println("Результат: квадрат " + a + " = " + c);
                        break;
                    }
                    case (6): {
                        double c = MathOperationsException.sqrt(a);
                        System.out.println("Результат: корень " + a + " = " + c);
                        break;
                    }
                }

                System.out.print("Вы хотите продолжить работу с калькулятором? Введите 'Да', если хотите. Если нет, то введите любой символ: ");
                choise = inp2.nextLine();
            }
        }
}
