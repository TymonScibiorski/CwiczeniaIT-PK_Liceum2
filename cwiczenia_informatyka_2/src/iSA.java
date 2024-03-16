public class iSA {
    public static boolean isInArray(double[] arr, double num){
        int arrlen = arr.length;
        for (int i = 0; i < arrlen; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
