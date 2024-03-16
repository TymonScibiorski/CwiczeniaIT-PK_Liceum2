import java.util.ArrayList;

public class Student {
    public String imie;
    public String nazwisko;
    public String zaszyfrowaneHaslo;
    public String haslo;


    //this method will take the contents of the file and transform them into an array of objects Student
    public static ArrayList<Student> readAndWrite(ArrayList<String> lista) {
        ArrayList<Student> studentList = new ArrayList<>(); //list of objects students

        for (String line : lista) { //taking a line read from the file
            String[] info = line.split(",", 3); //splitting the line on commas
            studentList.add(new Student(info[0], info[1], info[2])); //adding to the resultant array of Students a new Student, whose info the program just read
        }

        return studentList;
    }

    //konstruktor Studenta
    Student(String imie, String nazwisko, String zaszyfrowaneHaslo) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.zaszyfrowaneHaslo = zaszyfrowaneHaslo;
        this.haslo = cezarCipher.decodeString(zaszyfrowaneHaslo, 5);
    }

}
