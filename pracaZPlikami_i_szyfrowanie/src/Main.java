import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> studentLines = new ArrayList<>(); //an array of lines containing strings read from the file specified below
        String filePath = "src\\data.csv"; //path from which the data will be read

        try { //file reader reads from the file specified above and appends the read lines into the studentLines array
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                studentLines.add(line);
            }

            bufferedReader.close(); //closes the fileReader as well

        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<Student> objectListStudent = new ArrayList<>();
        objectListStudent = Student.readAndWrite(studentLines);

        System.out.println(objectListStudent);
        //this line will print objects Student; the readAndWrite method returns an ArrayList of objects Student;
        //the readAndWrite method intakes an ArrayList of Strings, which is supposed to be the data read from the file


        for (Student student :objectListStudent) {
            System.out.print(student.imie + ", ");
            System.out.print(student.nazwisko + ", ");
            System.out.print(student.zaszyfrowaneHaslo + ", ");
            System.out.println(student.haslo + "\n");
        }
        }
    }

