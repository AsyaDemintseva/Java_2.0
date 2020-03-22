import  java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        System.out.println("Вы можете выполнить следующие действия:");
        System.out.println("№1. Калькулятор");
        System.out.println("№2. Поиск максимального элемента в массиве");
        System.out.println();
        System.out.print("Введите номер действия: ");
        Scanner inp1 = new Scanner(System.in);
        int type2 = inp1.nextInt();
        if ((type2 < 1)||(type2 > 2)) {
            //check that the selected operation number exists
            System.out.println("Неверный номер действия. Попробуйте ещё раз.");
            System.exit(0);
        }
        switch (type2) {
            case (1):
                calc();
                break;
            case (2):
                elementSearch();
                break;
        }
    }
        public static void calc(){
            Scanner inp2 = new Scanner(System.in);
            System.out.println("Какую операцию вы хотите провести? ");
            System.out.println("№1. Сложение");
            System.out.println("№2. Вычитание");
            System.out.println("№3. Умножение");
            System.out.println("№4. Деление");
            System.out.println();
            System.out.print("Введите номер операции: ");

            int type = inp2.nextInt();  /* remember which operation the user selected */

            if ((type < 1)||(type > 4)) {
                //check that the selected operation number exists
                System.out.println("Неверный номер операции. Попробуйте ещё раз.");
                System.exit(0);
            }

            //user enters two numbers
            System.out.print("Введите первое число: ");

            double a = inp2.nextDouble();
            System.out.print("Введите второе число: ");
            double b = inp2.nextDouble();

            //start the selected operation on the two numbers entered
            switch (type) {
                case (1):
                    a = a + b;
                    System.out.printf("Результат сложения: %10.4f", a);
                    break;
                case (2):
                    a = a - b;
                    System.out.printf("Результат вычитания: %10.4f", a);
                    break;
                case (3):
                    a = a * b;
                    System.out.printf("Результат умножения: %10.4f", a);
                    break;
                case (4):
                    a = a / b;
                    System.out.printf("Результат деления: %10.4f", a);
                    break;
            }
        }
        public static void elementSearch(){
        System.out.print("Задайте размерность массива целым положительным числом: ");
        Scanner inp3 = new Scanner(System.in);
        Scanner inp4 = new Scanner(System.in);

        int razm = inp3.nextInt();
        String[] mas = new String[razm]; //создаём массив mas, размерность которого равна переменной razm

        int i;
        //заполняем массив
        for (i = 0; i < razm ; i++) {
            System.out.print("Введите слово №" + (i+1) + ": ");
            mas[i] = inp4.nextLine();
        }

        int lng = 0; //тут будем хранить длину самого длинного слова из массива mas
        for (i = 0; i < razm; i++) {
            if (

                    lng  <  mas[i].length()

            ) {
                lng = mas[i].length();
            }
        }
        //далее находим самые длинные слова в массиве
        String[] maxlist = new String[razm];
        for (i = 0 ; i < razm ; i++ ) {
            if (mas[i].length() == lng) {
                maxlist[i] = mas[i]; //копируем элемент массива mas, (в котором номер элемента - это "i"от 0 до 9)  в элемент массива maxlist с таким же индексом
            }
        }
        //выводим самые длинные слова в массиве
        System.out.println("Самые длинные слова в массиве:");
        for (i = 0; i < razm ; i++) {
            if (maxlist[i] != null) {
                System.out.println(maxlist[i]);
            }
        }
    }
}