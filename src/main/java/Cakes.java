import java.util.ArrayList;

public class Cakes {

    String name;
    int weight;
    int price;
    String taste;
    int preparation;


    public Cakes(String name, int weight, int price, String taste, int preparation) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.taste = taste;
        this.preparation = preparation;
    }

    public static ArrayList<Cakes> makeCakesList() {

        Cakes cake1 = new Cakes
                ("Осетинский", 600, 500, "Рыбный", 3);
        Cakes cake2 = new Cakes
                ("Итальянский", 300, 490, "Вишнёвый", 2);
        Cakes cake3 = new Cakes
                ("Австрийский", 140, 83, "Яблочный", 4);

        ArrayList<Cakes> list = new ArrayList<>();

        list.add(cake1);
        list.add(cake2);
        list.add(cake3);

        return list;
    }
    public static boolean checkCakes (String name){
        boolean q = false;
        int i = 0;
        for (Object c: makeCakesList()){
            if (name.equals(makeCakesList().get(i).name)){
                q = true;
                break;
            }
            i++;
        }
        return q;
    }
    public static int printCakesInfo (ArrayList order, int k) {
        int i = 0;
        int j = 0;
        ArrayList<Cakes> cakesInfoList = makeCakesList();
        for (Object c: order) {
            for (Object d: cakesInfoList) {
                if (order.get(i).equals(cakesInfoList.get(j).name)) {
                    k++;
                    System.out.println("Позиция №" + k + ":");
                    System.out.println(
                            "Название пирога = " + cakesInfoList.get(j).name + ", " +
                                    "Цена пирога = " + cakesInfoList.get(j).price + " руб., " +
                                    "Вес пирога = " + cakesInfoList.get(j).weight + " гр., " +
                                    "Вкус пирога = " + cakesInfoList.get(j).taste + ", " +
                                    "Время приготовления пирога = " + cakesInfoList.get(j).preparation + " часа"
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
