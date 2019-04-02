package behavioral.strategy;

public class MediumSorter implements ISorter {
    @Override
    public int[] sort(int[] array) {
        System.out.println("Medium sorter was used!");
        return array;
    }
}
