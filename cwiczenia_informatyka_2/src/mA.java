public class mA {
    public static int[] margeArrays(int[] arr1, int[] arr2) {
        //determining the length of the first and second array
        int a1 = arr1.length;
        int b1 = arr2.length;

        //size of the resultant array
        int c1 = a1 + b1;

        //creating the new array
        int[] c = new int[c1];


        //Looping through the elements of first array to store them in the resultant array
        for (int i = 0; i < a1; i++) {
            //Storing the elements of the first array in the resultant array
            c[i] = arr1[i];
        }

        //Looping through the elements of second array to store them in the resultant array
        for (int i = 0; i < b1; i++) {
            //Storing the elements of the first array in the resultant array
            c[a1 + i] = arr2[i];
        }

        return c;
    }
}