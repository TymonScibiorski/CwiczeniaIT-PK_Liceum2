import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 23, 4, 6, 7, 0};
        ArrayList<Integer> array1 = sorting.SelectionSort(array);
        System.out.println(array1);

        for (Integer i : array1) {
            System.out.println(i);
        }



    }
}
