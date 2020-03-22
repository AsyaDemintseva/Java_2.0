import java.util.ArrayList;

public class Waffles {

    String name;
    int weight;
    int price;
    String form;
    int energy;
    String pack;

    public Waffles(String name, int weight, int price, String form, int energy, String pack) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.form = form;
        this.energy = energy;
        this.pack = pack;
    }

    public static ArrayList<Waffles> makeWafflesList() {

        Waffles waffle1 = new Waffles
                ("Коломенское", 70, 76, "Квадратные", 213,  "Жестяная банка");
        Waffles waffle2 = new Waffles
                ("Milka", 80, 102, "Круглые", 543, "Полиэтилен");
        Waffles waffle3 = new Waffles
                ("Bahlsen", 140, 83, "Овальные", 337, "Фольга");
        Waffles waffle4 = new Waffles
                ("Kinder", 170, 60, "В форме зверюшек", 190, "Картонная коробка");
        Waffles waffle5 = new Waffles
                ("Яшкино", 170, 60, "В форме ", 246,  "Картонная коробка");

        ArrayList<Waffles> list = new ArrayList<>();

        list.add(waffle1);
        list.add(waffle2);
        list.add(waffle3);
        list.add(waffle4);
        list.add(waffle5);

        return list;
    }
    public static boolean checkWaffles (String name){
        boolean q = false;
        int i = 0;
        for (Object c: makeWafflesList()){
            if (name.equals(makeWafflesList().get(i).name)){
                q = true;
                break;
            }
            i++;
        }
        return q;
    }
    public static int printWafflesInfo (ArrayList order, int k) {
        int i = 0;
        int j = 0;
        ArrayList<Waffles> wafflesInfoList = makeWafflesList();
        for (Object c: order) {
            for (Object d: wafflesInfoList) {
                if (order.get(i).equals(wafflesInfoList.get(j).name)) {
                    k++;
                    System.out.println("Позиция №" + k + ":");
                    System.out.println(
                            "Название вафель = " + wafflesInfoList.get(j).name + ", " +
                                    "Цена вафель = " + wafflesInfoList.get(j).price + " руб., " +
                                    "Вес вафель = " + wafflesInfoList.get(j).weight + " гр., " +
                                    "Форма вафель = " + wafflesInfoList.get(j).form + ", " +
                                    "Тип упаковки вафель = " + wafflesInfoList.get(j).pack + ", " +
                                    "Калорийность вафель = " + wafflesInfoList.get(j).energy + " ккал"
                    );
                }
                j++;
            }
            i++;
            j = 0;
        }
        return k;
    }
}
