import java.util.Arrays;
import java.util.TreeMap;

public class main {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2},
                {3, 4}
        };
        int[][] b = {
                {5, 6},
                {7, 8}
        };
        System.out.println(Arrays.deepToString(mergeArrays(a, b)));

        System.out.println(isInArray(a, 1));
        System.out.println(isInArray(b, 2));

        System.out.println(getAlgebraicMean(a));
        System.out.println(getAlgebraicMean(b));

        System.out.println(isIncreasing(a));
        System.out.println(isIncreasing(b));

        System.out.println(findSecondSmallest(a));
        System.out.println(findSecondSmallest(b));
    }


        public static int[][] mergeArrays(int[][] arr1, int[][] arr2){
        //creating a new 2D array that is as long as the two first tables
        //the arrays in the 1st dimension are as long as the first element in the first table
        //sadly, this assumes that every array in of the provided tables is the same length
            int[][] arrReturned = new int[arr1.length + arr2.length][arr1[0].length];

        //looping through the first provided table
            for (int i = 0; i < arr1.length; i++) {
                //looping through each element of the first table, and adding it to the table that will be returned
                  for (int j = 0; j < arr1[i].length; j++) {
                      arrReturned[i][j] = arr1[i][j];
                  }
            }
        //looping through the second provided table
            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j < arr2[i].length; j++) {
                    //looping through each element of the first table, and adding it to the table that will be returned
                    //but now the code has to start where it ended previously
                    arrReturned[i + arr1.length][j] = arr2[i][j];
                }
            }

            return arrReturned;
        }


        public static boolean isInArray(int[][] arr, int num){
            boolean output = false;

            for (int i = 0; i < arr.length; i++) { //looping through the provided table
                for (int j = 0; j < arr[i].length; j++) { //looping through arrays
                    if (arr[i][j] == num) { //checking if the number at hand is equal to the number the code is searching for.
                        // Binary search would be very much useful here, however, there's no guarantee that the code is sorted
                        output = true;
                        return output;
                    }
                }
            }
            return output;
        }


        public static double getAlgebraicMean(int[][] arr){
            int arrlen = arr.length;
            double out = 0;

            for (int i = 0; i < arrlen; i++) {
                for (int j = 0; j < arr[i].length; j++)
                out += arr[i][j];
            }
            out /= arrlen;
            return out/arrlen;
    }


    public static boolean isIncreasing(int[][] arr){
        boolean output = false;
        if (arr[0][0] < arr[arr.length-1][arr[arr.length-1].length-1]) {
            //just a quick looksy at the first and last element of the list.
            // If the first is smaller than the last, the elements are not increasing. Just an attempt at optimisation
            output = true;
            return output;
        }

        //if the one value is not equal to or smaller than (or simply put bigger) the second value it is not increasing
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < arr[i-1][j-1]) {
                    return output;
                }
            }
        }
        // failing the condition above, it is increasing / all elements are equal
        output = true;
        return output;
    }


    public static int findSecondSmallest(int[][] arr){
        int smallest = arr[0][0];
        int ndsmallest = smallest;

        if (main.isIncreasing(arr)) {
            ndsmallest = arr[0][1];
            return ndsmallest;
        }


        //looping through the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < smallest) { //if the number in the array that is currently taken into consideration is smaller than the current smallest number
                    ndsmallest = smallest; //the second-smallest number is gonna be the previous last smallest number we saw
                    smallest = arr[i][j]; //the smallest number variable is now the actual smallest number the loop has seen yet
                }
            }
        }

        return ndsmallest;
    }
}
