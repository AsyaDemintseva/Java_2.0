import java.util.*;

public class Candy {
    String name;
    int weight;
    int price;
    String info;

    public Candy(String name, int weight, int price, String info) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.info = info;
    }

    public static void main(String[] args) {

        Candy cookies = new Candy("Печенье", 250, 100, "Очень вкусное");
        Candy waffles = new Candy("Вафли", 125, 70, "Шоколадные");
        Candy baklava = new Candy("Пахлава", 220, 150, "Турецкая");
        Candy marshmallow = new Candy("Зефир", 340, 300, "Шармель");
        Candy lollypops = new Candy("Леденцы", 180, 60, "Апельсиновые");

        ArrayList <Candy> list = new ArrayList<>();

        list.add(cookies);
        list.add(waffles);
        list.add(baklava);
        list.add(marshmallow);
        list.add(lollypops);

        System.out.println("У нас в магазине есть:");
        int i = 0;
        for (Object c: list) {
            System.out.println(list.get(i).name);
            i++;
        }

        System.out.println("Напишите, что из этого вы хотите? Когда закончите, напишите 'Готово':");
        String n = "";
        Scanner inp = new Scanner(System.in);

        ArrayList <Candy> zakaz = new ArrayList<>();

        while (!n.equals("Готово")) {
            n = inp.nextLine();
            i = 0;
            for (Object c: list) {
             if (n.equals(list.get(i).name)) {
                zakaz.add(list.get(i));
             }
             i++;
            }
        }

        i = 0;
        int ves = 0;
        int cena = 0;

        for (Object c: zakaz)
        { ves += zakaz.get(i).weight;
          cena += zakaz.get(i).price;
          i++;
        }

        System.out.println("Общий вес покупки: " + ves + " гр.");
        System.out.println("Общая стоимость покупки: " + cena + " руб.");
        System.out.println("Инфо о покупках:");

        i = 0;
        for (Object c: zakaz)
        {
            System.out.println("Позиция № " + (i+1) + ": " + zakaz.get(i).name + " " + zakaz.get(i).info);
            i++;
        }
    }
}