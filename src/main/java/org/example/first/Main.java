package org.example.first;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> text = new HashMap<>();
        String in = "Россия идет вперед всей планеты. Планета — это не Россия.".toLowerCase();
        String[] sort = in.split("\\s+|\\.|,|\\?|:|;|—");
        for (String word : sort){
            String sortedword = word.toLowerCase();
            if (text.containsKey(sortedword)){
                text.replace(sortedword, text.get(sortedword) + 1);
            }
            else{
                text.put(sortedword, 1);
            }

        }
        for (var item:text.entrySet()) {
            System.out.println(item.getKey() + ": " + item.getValue());
        }
    }
}