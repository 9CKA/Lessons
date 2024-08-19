import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        words.add("дом");
        words.add("дерево");
        words.add("дерево");
        words.add("солнце");
        words.add("яблоко");
        words.add("стол");
        words.add("книга");
        words.add("ручка");
        words.add("яблоко");
        words.add("яблоко");
        words.add("карандаш");
        words.add("компьютер");
        words.add("телефон");

        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println("Уникальные слова: " + uniqueWords);
    }
}