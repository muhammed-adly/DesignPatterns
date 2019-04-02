package behavioral.strategy;

class SortingAlgorithmDecider {

    SortingAlgorithmDecider() {
    }

    static ISorter searchAlgorithm(int[] array) {
        ISorter sc;
        if (array.length <= 10) {
            sc = new SmallSorter();
        } else if (array.length <= 12) {
            sc = new MediumSorter();
        } else {
            sc = new LargerSorter();
        }
        return sc;
    }

}
