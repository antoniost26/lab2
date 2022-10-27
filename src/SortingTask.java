import java.util.Arrays;
import java.util.Vector;

public class SortingTask extends Task {
    int[] integers;

    public SortingTask(Long id, String desc) {
        super(id, desc);
    }

    public SortingTask(int[] vector) {
        super(0L,"");
        integers = vector;
    }

    public int[] getIntegers() {
        return this.integers;
    }

    public void setIntegers(int[] _integers){
        this.integers = _integers;
    }

    @Override
    public void execute() {
        int[] temp = integers.clone();

        boolean greater = temp.length > 10;

        // Vom folosi quicksort/bubblesort in functie de cate elemente sunt
        switch (String.valueOf(greater)) {
            case "true" -> // vom folosi Quicksort
            {
                Utils.QuickSort.sort(temp, 0, temp.length-1);
            }
            case "false" -> // vom folosi Bubblesort
            {
                for (int i = 0; i < temp.length - 1; i++) {
                    for (int j = 0; j < temp.length - i - 1; j++){
                        if (temp[j] > temp[j + 1]) {
                            Utils.QuickSort.swap(temp, j, j+1);
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
