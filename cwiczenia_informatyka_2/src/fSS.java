public class fSS {
    public static int findSecondSmallest(int[] arr){
        int arrlen = arr.length;
        int smallest = arr[0];
        int ndsmallest = arr[0];

        //looping through the array
        for (int i = 0; i < arrlen; i++) {
            if (arr[i] < smallest) { //if the number in the array that is currently taken into consideration is smaller than the current smallest number
               ndsmallest = smallest; //the second-smallest number is gonna be the previous last smallest number we saw
                smallest = arr[i]; //the smallest number variable is now the actual smallest number the loop has seen yet
            }
        }


        if (iA.isIncreasing(arr)) {
            ndsmallest = arr[1];
        }


        return ndsmallest;
    }
}
