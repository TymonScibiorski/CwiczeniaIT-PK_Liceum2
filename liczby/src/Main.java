import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
                FileReader fr = new FileReader("C:\\Users\\l0863\\Downloads\\binarne.txt");
                BufferedReader br = new BufferedReader(fr);

                String LongestDwuCykliczny = null;
                int AmountOfDwuCykliczny = 0;

                String line = br.readLine();

                while (line != null) {

                    if (CzyDwucykliczny(line)){
                        AmountOfDwuCykliczny++;
                        if (LongestDwuCykliczny == null) {
                            LongestDwuCykliczny = line;
                        }
                        if (LongestDwuCykliczny != null && line.length() > LongestDwuCykliczny.length()){
                            LongestDwuCykliczny = line;
                        }
                    }
                    line = br.readLine();
                }

                System.out.println(String.valueOf(AmountOfDwuCykliczny));
                System.out.println(LongestDwuCykliczny);
                System.out.println(LongestDwuCykliczny.length());

        }
        catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        catch (IOException e) {
            System.out.println(e);
        }
        catch (NullPointerException e) {
            System.out.println(e);
        }
    }



    public static boolean CzyDwucykliczny(String binStr) {
        if (binStr.length() % 2 != 0) {
            return false;
        }

        StringBuilder FirstHalfOfTheString = new StringBuilder("");
        StringBuilder SecondHalfOfTheString = new StringBuilder("");

        for (int i = 0; i < binStr.length(); i++) {
            if (i < binStr.length()/2) {
                FirstHalfOfTheString.append(binStr.charAt(i));
            }
            if (i >= binStr.length()/2) {
                SecondHalfOfTheString.append(binStr.charAt(i));
            }
        }

        if (FirstHalfOfTheString.toString().equals(SecondHalfOfTheString.toString())) {
            return true;
        }
        return false;
    }

//    public static String SplitEveryFour(String binStr){
//
//    }
//
//    public static int BinToDec(String binStr) {
//
//    }
}