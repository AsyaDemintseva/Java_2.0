import java.util.*;

public class Programs {
    int num;
    String pname;
    GregorianCalendar start;
    List<Courses> crs;

    public Programs(int num, String pname, GregorianCalendar start, List<Courses> crs) {
        this.num = num;
        this.pname = pname;
        this.start = start;
        this.crs = crs;
    }

    public static void main(String[] args){

        GregorianCalendar curDat1 = new GregorianCalendar(2020, Calendar.FEBRUARY, 5, 15,10, 0);
        GregorianCalendar curDat2 = new GregorianCalendar(2020, Calendar.FEBRUARY, 18, 12, 30, 0);
        GregorianCalendar curDat3 = new GregorianCalendar(2020, Calendar.MARCH, 10, 13, 0, 0);

        Courses java1 = new Courses("Курс Java 1.0", 8, "Введение в Java");
        Courses java2 = new Courses("Курс Java 2.0", 16, "Типы данных");
        Courses java3 = new Courses("Курс Java 3.0", 24, "Переменные");
        Courses java4 = new Courses("Курс Java 4.0", 32, "Условия");
        Courses java5 = new Courses("Курс Java 5.0", 40, "Циклы");
        Courses java6 = new Courses("Курс Java 6.0", 48, "Массивы");

        ArrayList<Courses> coList1 = new ArrayList<>();
        coList1.add(java1);
        coList1.add(java2);
        coList1.add(java3);

        ArrayList<Courses> coList2 = new ArrayList<>();
        coList2.add(java2);
        coList2.add(java3);
        coList2.add(java4);

        ArrayList<Courses> coList3 = new ArrayList<>();
        coList3.add(java4);
        coList3.add(java5);
        coList3.add(java6);

        Programs first = new Programs(1, "Java для новичка", curDat1, coList1);
        Programs second = new Programs(2, "Java для среднего уровня", curDat2, coList2);
        Programs third = new Programs(3, "Java для профи", curDat3, coList3);

        ArrayList<Programs> progList = new ArrayList<>();
        progList.add(first);
        progList.add(second);
        progList.add(third);

        String n = "";
        int i = 0;
        Scanner inp1 = new Scanner(System.in);
        Scanner inp2 = new Scanner(System.in);

        System.out.println("В нашем университете есть следующие программы обучения: ");
        for (Object c : progList) {
            System.out.println("№" + (i + 1) + " " + progList.get(i).pname);
            i++;
        }

        System.out.println("");
        System.out.println("Введите имя студента для записи на программу. " +
                "Для завершения ввода напишите 'Готово' вместо имени студента.");
        i = 0;
        int j = 0;

        ArrayList<Students> stud = new ArrayList();
        while (!n.equals("Готово")) {
            System.out.print("Студент № " + (i + 1) + " : ");
            n = inp1.nextLine();
            if (!n.equals("Готово")) {
                System.out.print("Введите номер программы для студента '" + n + "': ");
                j = inp2.nextInt();
                if (j <= 3 && j >= 1) {
                    stud.add(new Students(n, j));
                } else {
                    System.out.println("Не верный номер программы! Попробуйте ещё раз");
                    i--;
                }
            }
            i++;
        }

        System.out.println("");
        System.out.println("Какой отчёт вы хотите получить?");
        System.out.println("№1 Короткий");
        System.out.println("№2 Развёрнутый");
        System.out.println("");

        j = 0;
        while (j > 2 || j < 1) {
            System.out.print("Введите номер отчёта: ");
            j = inp1.nextInt();
            if (j > 2 || j < 1) {
                System.out.println("Не верный номер отчёта! Попробуйте ещё раз.");
            }
        }

        System.out.println("");

        i = 0;
        System.out.println("Выберите студента, по которому хотите получить отчёт:");
        for (Object c : stud) {
            System.out.println("Студент №" + (i + 1) + ": " + (stud.get(i).name));
            i++;
        }

        int snum = 0;
        while (snum < 1 || snum > i) {
            System.out.print("Введите номер студента: ");
            snum = inp1.nextInt();
            if (snum < 1 || snum > i) {
                System.out.println("Не верный номер студента! Попробуйте ещё раз.");
            }
        }

        System.out.println("");

        i = 0;
        int k = 0;

        switch (j) {
            case (1): {
                for (Object c : progList) {
                    k += progList.get(stud.get(snum - 1).num - 1).crs.get(i).dur;
                    i++;
                }

                Date now = new Date();
                GregorianCalendar curEnd;
                curEnd = (GregorianCalendar)progList.get(stud.get(snum - 1).num - 1).start.clone();
                curEnd.add(Calendar.HOUR, +(k*3));

                System.out.println("Студент '" + stud.get(snum - 1).name + "' подписан на программу '"
                        + progList.get(stud.get(snum - 1).num - 1).pname + "'");
                System.out.println("Дата начала программы: " + progList.get(stud.get(snum - 1).num - 1).start.getTime());
                System.out.println("Дата окончания программы: " + curEnd.getTime());
                System.out.println("Длительность программы: " + k + "ч.");
                System.out.print("Статус проведения программы: ");

                if (now.before(progList.get(stud.get(snum - 1).num - 1).start.getTime())) {
                    System.out.print("Не стартовала");
                } else if (now.after(curEnd.getTime())){
                    System.out.print("Завершена");
                } else {
                    System.out.print("В процессе");
                }

                break;
            }
            case (2): {
                for (Object c : progList) {
                    k += progList.get(stud.get(snum - 1).num - 1).crs.get(i).dur;
                    i++;
                }

                System.out.println("Студент '" + stud.get(snum - 1).name + "' подписан на программу '"
                        + progList.get(stud.get(snum - 1).num - 1).pname + "'");
                System.out.println("Дата начала программы: " + progList.get(stud.get(snum - 1).num - 1).start.getTime());
                System.out.println("Длительность программы: " + k + "ч.");
                System.out.println("Программа содержит следующие курсы:");

                i = 0;
                for (Object c: progList
                ) {
                    System.out.println("Название курса: " + progList.get(snum-1).crs.get(i).cname
                            + ". Изучаем: " + progList.get(snum-1).crs.get(i).info
                            + ". Продолжительность курса: " + progList.get(snum-1).crs.get(i).dur + "ч."
                    );
                    i++;
                }
                break;
            }
        }
    }
}