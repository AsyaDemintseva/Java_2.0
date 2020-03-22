import java.util.ArrayList;

public class Cookies {

    String name;
    int weight;
    int price;
    String type;
    String maker;
    int count;
    String filling;

    public Cookies(String name, int weight, int price, String type, String maker, int count, String filling) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.type = type;
        this.maker = maker;
        this.count = count;
        this.filling = filling;
    }


    public static ArrayList<Cookies> makeCookiesList () {

        Cookies cookie1 = new Cookies
                ("Юбилейное", 120, 67, "Пшеничное", "Фабрика 'Большевик'", 8, "Без начинки");
        Cookies cookie2 = new Cookies
                ("Belvita", 150, 105, "Из злаков", "ООО МОН'Дэлис Русь", 12, "Какао, Йогурт");
        Cookies cookie3 = new Cookies
                ("Посиделкино", 230, 80, "Овсяное", "Кондитерское объединение 'Любимый Край'", 20, "С изюмом");
        Cookies cookie4 = new Cookies
                ("Bonte", 170, 60, "Кокосовое", "КФ «Филатов»", 20, "Без начинки");

        ArrayList<Cookies> list = new ArrayList<>();

        list.add(cookie1);
        list.add(cookie2);
        list.add(cookie3);
        list.add(cookie4);

        return list;
    }

    public static boolean checkCookies (String name){
        boolean q = false;
        int i = 0;
        for (Object c: makeCookiesList()){
            if (name.equals(makeCookiesList().get(i).name)){
                q = true;
                break;
            }
            i++;
        }
        return q;
    }
    public static int printCookiesInfo (ArrayList order, int k) {
        int i = 0;
        int j = 0;
        ArrayList<Cookies> cookiesInfoList = makeCookiesList();
        for (Object c: order) {
            for (Object d: cookiesInfoList) {
                if (order.get(i).equals(cookiesInfoList.get(j).name)) {
                    k++;
                    System.out.println("Позиция №" + k + ":");
                    System.out.println(
                            "Название печенья = " + cookiesInfoList.get(j).name + ", " +
                                    "Цена печенья = " + cookiesInfoList.get(j).price + " руб., " +
                                    "Вес печенья = " + cookiesInfoList.get(j).weight + " гр., " +
                                    "Тип печенья = " + cookiesInfoList.get(j).type + ", " +
                                    "Производитель = " + cookiesInfoList.get(j).maker + ", " +
                                    "Количество печенюшек в коробке = " + cookiesInfoList.get(j).count + " шт., " +
                                    "Начинка печенья = " + cookiesInfoList.get(j).filling
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
