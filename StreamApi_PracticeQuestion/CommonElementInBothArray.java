package StreamApi_PracticeQuestion;

import com.sun.source.tree.BreakTree;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementInBothArray {

    public static List<Integer> commonElements(List<Integer> list1, List<Integer> list2) {
        return list1.stream()
                //.filter(list2::contains)
                .filter(element -> list2.contains(element))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 4, 6, 8);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 7, 9);

        List<Integer> result = commonElements(list1, list2);
        System.out.println(result);

    }
}