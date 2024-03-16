import java.util.Arrays;

public class tests {
    public static void main(String[] args) {
        //testing the merging arrays method
        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {50, 60, 70, 5464650};

        int[] arr3 = mA.margeArrays(arr1, arr2);
        System.out.println(Arrays.toString(arr3));

        //testing the isInArray method
        double[] arr4 = {6.0, 6.1, 6.2, 6.3, 6.4, 6.5, 6.6, 6.7, 6.8, 6.9, 7.0};
        double num = 6.9;
        double num2 = 7.1;
        System.out.println(iSA.isInArray(arr4, num));
        System.out.println(iSA.isInArray(arr4, num2));

        //testing the getAlgebraicMean method
        System.out.println(gAM.getAlgebraicMean(arr4));

        //testing the isIncreasing method
        System.out.println(iA.isIncreasing(arr1));

        //testing the findSecondSmallest method
        System.out.println(fSS.findSecondSmallest(arr3));
    }
}