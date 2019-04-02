package behavioral.strategy;

import java.util.Arrays;
import java.util.function.Function;

public class StrategyTester {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1};
        ISorter sorter = SortingAlgorithmDecider.searchAlgorithm(arr);
        sorter.sort(arr);

        int[] arr2 = {1, 3, 2, 1, 2, 3, 11, 2, 2, 1};
        ISorter sorter2 = SortingAlgorithmDecider.searchAlgorithm(arr2);
        sorter2.sort(arr2);

        Integer[] arr3 = {1, 3, 2, 1, 6, 5, 3, 2, 21, 2, 1, 2, 3, 11, 2, 2, 1};
        Function<Integer[], Integer[]> sortingFunction = a -> {
            Arrays.sort(a);
            return a;
        };
        LargerSorter.sort(arr3, sortingFunction);
        System.out.println(Arrays.toString(arr3));
    }
}
