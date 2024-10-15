package StreamApi_PracticeQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.stream.Collectors;

public class CountListOfWords
{
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple", "grape", "banana", "orange","mango","PineApple","mango",
                "PineApple","orange"};

        Map<String, Long> map = Arrays.stream(words)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));


        List<Map.Entry<String, Long>> top5Words = map.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(5) // Limit to top 5 entries
                .collect(Collectors.toList());

      //  map.forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
        System.out.println(map);

        top5Words.forEach(entry -> System.out.println("Top 5 Words:"+entry.getKey() + " -> " + entry.getValue()));


    }
}
