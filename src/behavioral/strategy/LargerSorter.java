package behavioral.strategy;

import java.util.function.Function;

public class LargerSorter implements ISorter {
    @Override
    public int[] sort(int[] array) {
        System.out.println("Larger sorter was used!");
        return array;
    }

    // implemented it functionally also,
    static void sort(Integer[] arr, Function<Integer[], Integer[]> sortingAlgorithm) {
        sortingAlgorithm.apply(arr);
    }
}
