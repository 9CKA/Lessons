import java.util.*;

public class WordCount {
  public static void main(String[] args) {
    ArrayList<String> words = new ArrayList<>(Arrays.asList("дом", "кот", "собака", "кошка", "дерево", "стол", "стул", "окно", "дверь", "книга"));

    Map<String, Integer> wordCounts = new HashMap<>();