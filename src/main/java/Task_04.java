import java.util.Random;

public class Task_04 {
    public static void main(String[] args) {
        int[] mas = new int[20];
        int i;
        final Random random = new Random();
        for (i = 0; i < 20; i++){
            mas[i] = random.nextInt(21)-10;
        }
        System.out.println("Это исходный массив:");
        for (i = 0; i < 20; i++){
            System.out.println("Элемент №"+ (i+1) + " = " + mas[i]);
        }
        int n = -11;
        int m = 11;
        int j = 0;
        int k = 0;
        for (i = 0; i < 20; i++){
            if (mas[i] < 0 && mas [i] > n){
                n = mas[i];
                j = i;
            } else if (mas[i] > 0 && mas [i] < m) {
                m = mas[i];
                k = i;
            }
            }
           System.out.println("Максимальное среди минимальных = " + mas[j]);
        System.out.println("Минимальное среди максимальных = " + mas[k]);
            mas[k] = mas[j]*mas[k];
            mas[j] = mas[k]/mas[j];
            mas[k] = mas[k]/mas[j];

            System.out.println("Это обновлённый массив, где мы поменяли местами элементы:");
            for (i = 0; i < 20; i++){
                System.out.println("Элемент №"+ (i+1) + " = " + mas[i]);
            }
        }
    }
