package behavioral.strategy;

public class SmallSorter implements ISorter {
    @Override
    public int[] sort(int[] array) {
        System.out.println("Small sorter was used!");
        return array;
    }
}
