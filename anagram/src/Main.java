import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> slowa = new Stack<>();
        // Reading data
        slowa = read_data("C:\\Users\\l0863\\Downloads\\slowa.txt");

        // How many words end in the letter "a"?
        System.out.println(HowManyWordsEndInTheLetterA(slowa));

        // Ile linii tekstu, gdziwe piewsze slowo zawiera sie w drugim
        int AmountOfLinesWhereTheFirstWordContainsTheSecond = 0;
        for (String line : slowa) {
            String[] words = line.split(" ");
            if (DoesItContain(words) == true) {
                AmountOfLinesWhereTheFirstWordContainsTheSecond += 1;
            }
        }
        System.out.println(AmountOfLinesWhereTheFirstWordContainsTheSecond);

        int AnnagramCount = 0;
        for (String line : slowa){

        }


    }

    public static boolean AreTheWordsAnagrams(String[] line) {
        if (line[0].length() != line[1].length()) {
            return false;
        }

        HashMap<Character, Integer> frequency = new HashMap<>();
        for(char c : line[0].toCharArray()) {
            if (frequency.containsKey(c)) {
                frequency.put(c, frequency.get(c)+1);
            }
            else {
                frequency.put(c, 1);
            }
        }

        for(char c : line[1].toCharArray()) {
            if (frequency.containsKey(c)) {
                frequency.put(c, frequency.get(c) - 1);
            }
            else {
                return false;
            }
        }
        for(char c : )
        return false;
    }

    public static boolean DoesItContain(String[] line) {
        return line[1].contains(line[0]);
    }

    private static int HowManyWordsEndInTheLetterA(Stack<String> slowa) {
        int AmountOfWordsEndingInA = 0;

        for (String line : slowa) {
            String[] words = line.split(" ");

            for (String i : words) {
                if (DoesItEndInA(i) == true){
                    AmountOfWordsEndingInA += 1;
                }

            }
        }
        return AmountOfWordsEndingInA;
    }

    public static boolean DoesItEndInA(String word) {
        return word.charAt(word.length()-1) == 'A';
    }
    private static Stack<String> read_data(String path) {
        FileReader fr = null;
        try {
            //This code can throw multiple errors, so try_catch has to be implemented
            fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);

            Stack<String> lines = new Stack<>();

            String line = br.readLine();
            while(line != null) {
                lines.push(line);
                line = br.readLine();
//                System.out.println(line);
            }
            System.out.println("Size " + lines.size());

            return lines;
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(fileNotFoundException);
        }
        catch (IOException IOException) {
            System.out.println(IOException);
        }
        return null;
    }
}