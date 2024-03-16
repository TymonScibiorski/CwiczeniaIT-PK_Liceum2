
public class Main {
    public static void main(String[] args) {
        int[] Z = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        System.out.println(binarySearch(Z, 90));
    }
    public static int binarySearch(int[] Z, int key) {
        int ip = 0;
        int ik = Z.length;
        int p = -1; //(assumes that the key is not in the list


        while (ip <= ik ) { //while the beginning is still before the ending
            int isr = (ip + ik)/2; //the middle of the segment which the code is searching


            if (key != Z[isr]) { //if the key hasn't been found
                if (key < Z[isr]) { //if the value of the key is smaller than the value of isr
                    ik = isr - 1; //the code searches values smaller than the isr
                }

                if (key > Z[isr]) { //if the value of the key is bigger than the value of isr
                    ip = isr + 1; //the code searches values bigger than the isr
                }
            }


            else { //if the key is in fact the value of isr
                p = isr; //we set the value to be returned to the isr
                break; //and the end
            }
            }


        return p;
    }
}