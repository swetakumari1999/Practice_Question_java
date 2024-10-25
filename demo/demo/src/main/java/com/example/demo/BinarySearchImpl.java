package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl
{
    @Autowired
    private SortAlgorithm sortAlgorithm;   // Field Injection


  //  Contructor Injection
 // @Autowired
//    public BinarySearchImpl(BubbleSortAlgorithm bubbleSortAlgorithm) {
//        super();
//        this.bubbleSortAlgorithm = bubbleSortAlgorithm;
//    }

   // Setter Injection
  /*  @Autowired
    public void setBubbleSortAlgorithm(SortAlgorithm sortAlgorithm)
    {
        this.sortAlgorithm = sortAlgorithm;
    }
*/
    public int binarySearch(int[] numbers, int searchedNumber) {
        // BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        int[] sortedNumbers = SortAlgorithm.sort(numbers);
        System.out.println(sortedNumbers);
        return 3;

//        int start =0;
//        int end = sortedNumbers.length-1;
//        while(start<=end)
//        {
//            int mid = start + (end - start)/2;
//            if(sortedNumbers[mid] == searchedNumber)
//            {
//                return mid;
//            }
//            if(sortedNumbers[mid]<searchedNumber)
//            {
//                return mid+1;
//            }
//            else
//            {
//                return mid-1;
//            }
//        }
//        return -1;

    }
}
