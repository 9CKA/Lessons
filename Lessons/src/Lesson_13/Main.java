public class Main {
    public static void main(String[] args) {
        // Создаём список слов
        ArrayList<String> words = new ArrayList<>();

        // Добавляем слова в список
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

        // Находим уникальные слова
        Set<String> uniqueWords = new HashSet<>(words);

        System.out.println("Уникальные слова: ");
        for (String word : uniqueWords) {
            System.out.print(word + " ");
        }

        System.out.println();
    }
}