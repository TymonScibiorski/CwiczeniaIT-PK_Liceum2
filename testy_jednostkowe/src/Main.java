import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String Miasto = getUserCity();
        String DzienTygodnia = getWeekday();
        int wiek = getUserAge();


        double Prise = 40;
        double ZnizkaOut = 0;

        String ZnizkowyDzienTygodnia = "Czwartek";
        double ZnizkaDniaTygodnia = 100;

        String ZnizkoweMiasto = "Warszawa";
        double ZnizkaMiasto = 10;

        int WiekNaP

    }
    public static double PriseCalculator(String Miasto, String DzienTygodnia, int wiek, String ZnizkowyDzienTygodnia, double Prise) {
        DzienTygodnia = DzienTygodnia.toLowerCase();
        ZnizkowyDzienTygodnia = ZnizkowyDzienTygodnia.toLowerCase();
        if(DzienTygodnia.equals(ZnizkowyDzienTygodnia) || wiek < 10) {
            Prise = 0;

        } else if (wiek < 18) {
            Prise -= 40 - 0.5*Prise;
        }
        if (Miasto.equals("Warszawa")) {

        }
    }

    public static int getUserAge() throws Exception{
        int wiek;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj swoj wiek: ");
            wiek = scanner.nextInt();
        } catch (Exception exception) {
            throw new Exception("Niepoprawny wiek. ");
        }

        if(wiek<1 || wiek>150){
            throw new Exception("Wiek musi byc z zakresu 1 i 150");
        }
        return wiek;
    }

    public static String getUserCity() throws Exception {
        String Miasto;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj swoje miasto: ");
            Miasto = scanner.next();
        } catch (Exception exception) {
            throw new Exception("Niepoprawne miasto. ");
        }

        return Miasto;
    }
    public static String getWeekday() throws Exception {
        String DzienTygodnia;

        HashSet<String> weekdays = new HashSet<>();
        weekdays.add("monday");
        weekdays.add("tueday");
        weekdays.add("wednesday");
        weekdays.add("thursday");
        weekdays.add("friday");
        weekdays.add("saturday");
        weekdays.add("sunday");
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj dzien tygodnia: ");
            DzienTygodnia = scanner.next();
            DzienTygodnia = DzienTygodnia.trim();
            DzienTygodnia = DzienTygodnia.toLowerCase();
        } catch (Exception exception) {
            throw new Exception("Niepoprawny dzien tygodnia. ");
        }

        return Miasto;
    }

}