import  java.util.Scanner;

public class Base {

    /**
     * This class is used to perform arithmetic operations on two numbers
     *
     * @Author Asya Demintseva
     */

    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Какую операцию вы хотите провести? ");
        System.out.println("№1. Сложение");
        System.out.println("№2. Вычитание");
        System.out.println("№3. Умножение");
        System.out.println("№4. Деление");
        System.out.println();
        System.out.print("Введите номер операции: ");

        int type = inp.nextInt();  /* remember which operation the user selected */

            if ((type < 1)||(type > 4)) {
                //check that the selected operation number exists
                System.out.println("Не верный номер операции. Попробуйте ещё раз.");
                System.exit(0);
            }

        //user enters two numbers
        System.out.print("Введите первое число: ");
        double a = inp.nextDouble();
        System.out.print("Введите второе число: ");
        double b = inp.nextDouble();

        //start the selected operation on the two numbers entered
        switch (type) {
            case (1):
                a = a+b;
                System.out.printf("Результат сложения: %10.4f", a);
                break;
            case (2):
                a = a-b;
                System.out.printf("Результат вычитания: %10.4f", a);
                break;
            case (3):
                a = a*b;
                System.out.printf("Результат умножения: %10.4f", a);
                break;
            case (4):
                a = a/b;
                System.out.printf("Результат деления: %10.4f", a);
                break;
        }

    }
}
