public class gAM {
    public static double getAlgebraicMean(double[] arr){
        int arrlen = arr.length;
        double out = 0;
        for (int i = 0; i < arrlen; i++) {
            out = out + arr[i];
            }
        return out/arrlen;
    }
}
