import java.util.ArrayList;
import java.util.Scanner;

public class Shop {

    public static void main(String[] args) {

        System.out.println("У нас в магазине есть такие сладости:");
        System.out.println("");
        int i = 0;

        System.out.println("Печенье: ");
        ArrayList <Cookies> cookiesList = Cookies.makeCookiesList();
        for (Object a: cookiesList) {
            System.out.print(cookiesList.get(i).name);
            if (i < cookiesList.size()-1) {
                System.out.print(", ");
            }
            i++;
        }

        System.out.println("");
        i = 0;
        System.out.println("Вафли: ");
        ArrayList <Waffles> wafflesList = Waffles.makeWafflesList();
        for (Object b: wafflesList) {
            System.out.print(wafflesList.get(i).name);
            if (i < wafflesList.size()-1) {
                System.out.print(", ");
            }
            i++;
        }

        System.out.println("");
        i = 0;
        System.out.println("Пироги: ");
        ArrayList <Cakes> cakesList = Cakes.makeCakesList();
        for (Object c: cakesList) {
            System.out.print(cakesList.get(i).name);
            if (i < cakesList.size()-1) {
                System.out.print(", ");
            }
            i++;
        }


        System.out.println("");
        System.out.println("");
        System.out.println("Напишите, что из этого вы хотите? Когда закончите, напишите 'Готово':");
        String n = "";
        Scanner inp = new Scanner(System.in);
        boolean g;
        ArrayList<String> order = new ArrayList();

        while (!n.equals("Готово")) {
            n = inp.nextLine();

            g = Cookies.checkCookies(n);
            if (!g) {
                g = Waffles.checkWaffles(n);
            }
            if (!g) {
                g = Cakes.checkCakes(n);
            }

            if (n.equals("Готово")) {
                break;
                } else {
                    if (g) {
                        order.add(n);
                        System.out.println("Позиция успешно добавлена!");
                    } else {
                        System.out.println("Такой сладости нет в магазине. Попробуйте ещё раз.");
                }
            }
        }

        i = 0;
        int j = 0;
        int m = 0;
        int p = 0;
        int ves = 0;
        int cena = 0;

        for (Object d: order) {

            for (Object e : cookiesList) {
                if (order.get(j).equals(cookiesList.get(i).name)) {
                    ves += cookiesList.get(i).weight;
                    cena += cookiesList.get(i).price;
                }
                i++;
            }

            for (Object e : wafflesList) {
                if (order.get(j).equals(wafflesList.get(m).name)) {
                    ves += wafflesList.get(m).weight;
                    cena += wafflesList.get(m).price;
                }
                m++;
            }

            for (Object e : cakesList) {
                if (order.get(j).equals(cakesList.get(p).name)) {
                    ves += cakesList.get(p).weight;
                    cena += cakesList.get(p).price;
                }
                p++;
            }

            p=0;
            m=0;
            i=0;
            j++;
        }

        System.out.println("");
        System.out.println("Общий вес покупки: " + ves + " гр.");
        System.out.println("Общая стоимость покупки: " + cena + " руб.");
        System.out.println("");
        System.out.println("Вот что вы купили:");

        int posNum = 0;
        posNum = Cookies.printCookiesInfo(order, posNum);
        posNum = Waffles.printWafflesInfo(order, posNum);
        Cakes.printCakesInfo(order, posNum);
    }
}