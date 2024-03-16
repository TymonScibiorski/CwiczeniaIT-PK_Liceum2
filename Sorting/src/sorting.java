import java.util.ArrayList;

public class sorting {

    public static int[] bubbleSort(int[] array, int n) {

        for (int j = 0; j < n - 1; j++){
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i+1]) {
                    int temporaryStoring = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temporaryStoring;
                }
            }
        }


        return array;
        }

    public static ArrayList<Integer> SelectionSort(int[] array){
        ArrayList<Integer> outage = new ArrayList<>();
        int num1 = array[0];

        for (int i : array) {
            if (i < num1) {
                num1 = i;
            }
        }
        outage.add(num1);
        num1 = array[0];

        int c = 0;
        for (int i : array) {
            for (int j : array) {
                if (j > outage.get(c) && j < num1) {
                    num1 = j;
                }
            }
            c++;
            outage.add(num1);
        }
        return outage;
    }
}
