import java.util.*;
import java.util.regex.Pattern;

public class FileReader {
    public static void main(String[] args) throws Exception {

        java.io.FileReader read = new java.io.FileReader("C:\\Users\\asdem\\Desktop\\forjava.txt");
        Scanner inp = new Scanner(read);

        Pattern check = Pattern.compile(" ");
        String[] line = check.split(inp.nextLine());
        ArrayList<String> words = new ArrayList();

        int i;
        for (i = 0; i <line.length; i++) {
            words.add(line[i]);
        }

        System.out.println("Отсортированный список слов: ");
        i = 0;
        Collections.sort(words);
        for (String c: words) {
            System.out.println(words.get(i));
            i++;
        }

        ArrayList<String> repeated = new ArrayList();
        ArrayList<Integer> count = new ArrayList();

        i = 0;
        for (Object c: words) {
            if (!repeated.contains(words.get(i))) {
                repeated.add(words.get(i));
                count.add(1);
            } else {
                count.set(repeated.indexOf(words.get(i)) , count.get(repeated.indexOf(words.get(i))) + 1);
            }
            i++;
        }

        System.out.println("");
        System.out.println("Сколько раз слова встречаются в файле: ");
        i = 0;
        for (Object c: count) {
            System.out.println("Слово: " + repeated.get(i) + ". Кол-во: " + count.get(i));
            i++;
        }

        System.out.println("");
        System.out.println("Самые часто повторяемые слова (" + Collections.max(count) + " повторения): ");

        for (i =0; i < count.size(); i++)
        {
            if (count.get(i) == Collections.max(count)) {
                System.out.println(repeated.get(i));
            }
        }
    }
}