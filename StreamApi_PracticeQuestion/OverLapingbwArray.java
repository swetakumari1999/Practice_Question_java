package StreamApi_PracticeQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OverLapingbwArray
{
public static List<int[]> overlap(List<int[]>intervals) {
    

    List<int[]> al = new ArrayList<>();
    for (int[] interval:intervals) {

        }

    return al;

}

    public static void main(String[] args) {
        List<int[]> intervals = Arrays.asList(
                new int[]{1, 3},
                new int[]{2, 6},
                new int[]{8, 10},
                new int[]{15, 18}
        );


        List<int[]> overlapped = overlap(intervals);

        // Print merged intervals
        for (int[] interval : overlapped) {
            System.out.println(Arrays.toString(interval));
        }
    }
    }

