import java.util.HashMap;
import java.util.Map;

class FrequencyCounter {
    // Method to count frequency of elements in the array
    Map<Integer, Integer> countFrequency(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count occurrences of each element
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        return frequencyMap;
    }
}

public class OccurenceOfElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3, 4};
        FrequencyCounter counter = new FrequencyCounter();

        // Get frequency of elements
        Map<Integer, Integer> frequencies = counter.countFrequency(arr);

        // Print the frequency of each element
        for (Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
            System.out.println("Element: " + entry.getKey() + "-> Frequency: " + entry.getValue());
        }
    }
}
