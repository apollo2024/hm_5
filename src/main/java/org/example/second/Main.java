package org.example.second;

import java.util.HashMap;
import java.util.Map;
/**
 * 2) Подсчитать количество искомого слова, через map (наполнением значение,
 * где искомое слово будет являться ключом), вносить все слова не нужно
 */
public class Main {
    public static void main(String[] args) {
        String text = "Планета это наш дом, Дом наша планета".toLowerCase();
        String searchWord = "Планета".toLowerCase();
        Map<String, Integer> countgetter = new HashMap<>();
        for (String Word : text.split(" ")) {
            String word = Word.replaceAll("[^А-Яа-яЁё]", "");
            if (word.equals(searchWord)) {
                Integer item = countgetter.get(word);
                if (item == null) item = 0;
                countgetter.put(word, ++item);
            }
        }
        System.out.println(searchWord + ": " + countgetter);

    }

}