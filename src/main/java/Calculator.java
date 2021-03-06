import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner inp1 = new Scanner(System.in);
        Scanner inp2 = new Scanner(System.in);

        String choise = "Да";
        while (choise.equals("Да")) {
            System.out.println("Вам доступны следующие операции: ");
            System.out.println("Сложение");
            System.out.println("Вычитание");
            System.out.println("Умножение");
            System.out.println("Деление");
            System.out.println("Квадрат числа");
            System.out.println("Корень числа");
            System.out.println("");
            System.out.print("Выберите операцию, указав её номер: ");
            int i = 0;
            while (i < 1 || i > 6) {
                i = inp1.nextInt();
                if (i < 1 || i > 6) {
                    System.out.println("Не верный номер операции! Попробуйте ещё раз.");
                }
            }

            System.out.print("Введите число 'a': ");
            double a = inp1.nextDouble();
            double b = 0;
            if (i < 5) {
                System.out.print("Введите число 'b': ");
                b = inp1.nextDouble();
            }

            switch (i) {
                case (1): {
                    double c = MathOperations.addition(a, b);
                    System.out.println("Результат: " + a + " + " + b + " = " + c);
                    break;
                }
                case (2): {
                    double c = MathOperations.subtraction(a, b);
                    System.out.println("Результат: " + a + " - " + b + " = " + c);
                    break;
                }
                case (3): {
                    double c = MathOperations.miltiplication(a, b);
                    System.out.println("Результат: " + a + " * " + b + " = " + c);
                    break;
                }
                case (4): {
                    double c = MathOperations.division(a, b);
                    System.out.println("Результат: " + a + " / " + b + " = " + c);
                    break;
                }

                case (5): {
                    double c = MathOperations.sqr(a);
                    System.out.println("Результат: квадрат " + a + " = " + c);
                    break;
                }

                case (6): {
                    double c = MathOperations.sqrt(a);
                    System.out.println("Результат: корень " + a + " = " + c);
                    break;
                }
            }

            System.out.print("Вы хотите продолжить работу с калькулятором? Введите 'Да', если хотите. Если нет, то введите любой символ: ");
            choise = inp2.nextLine();
        }
    }
}