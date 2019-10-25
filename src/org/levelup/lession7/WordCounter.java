package org.levelup.lession7;

import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Laptop", 10000);
        map.put("Phone", 1000);
        map.put("Monitor", 20000);
        map.put("Keyboard", 231);
        map.put("Mouse", 111);

        Integer value = map.get("Laptop1");
        Map<String, Integer> doubleCollinit = new HashMap<String, Integer>(){{
            put("Laptop", 10000);
            put("Phone", 1000);
            put("Monitor", 20000);
            put("Keyboard", 231);
            put("Mouse", 111);
        }};

        String text = "Lorem Ipsum - это текст-\"рыба\", часто используемый в печати и вэб-дизайне. Lorem Ipsum является стандартной \"рыбой\" для текстов на латинице с начала XVI века. В то время некий безымянный печатник создал большую коллекцию размеров и форм шрифтов, используя Lorem Ipsum для распечатки образцов. Lorem Ipsum не только успешно пережил без заметных изменений пять веков, но и перешагнул в электронный дизайн. Его популяризации в новое время послужили публикация листов Letraset с образцами Lorem Ipsum в 60-х годах и, в более недавнее время, программы электронной вёрстки типа Aldus PageMaker, в шаблонах которых используется Lorem Ipsum.";
        String forattedText = text.replace(",","")
                .replace(".","")
                .replace("\"","")
                .replace("\'","")
                .replace("?","")
                .replace("!","")
                .replace(";","");

        String[] words = forattedText.split(" ");
        Map<String, Integer> wordsMap = new HashMap<>();

        for (String word : words) {
            Integer wordCount = wordsMap.get(word);
            if(wordCount==null){
                wordsMap.put(word,1);
            }else{
                wordsMap.put(word, wordCount+1);
            }
        }
        Set<String> keys = wordsMap.keySet();
        for (String key : keys) System.out.println(key + " " + wordsMap.get(key));
//        Collection<Map.Entry<String, Integer>> topWords = new ArrayList<>();
//        for (Map.Entry<String, Integer> entry : entries) {
//
//        }

    }
}
