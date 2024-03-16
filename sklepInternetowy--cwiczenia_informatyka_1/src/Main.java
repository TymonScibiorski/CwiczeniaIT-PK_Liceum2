class Main {
    public static void main(String[] args) {
        User u1 = new User("Tymon", "Ścibiorski", "l0863@pjwstk.edu.pl", "Password123"); // utworzenie pierwszego Usera, który nie jest gościem
        User u2 = new User("l0869@pjwstk.edu.pl"); //utworzenie drugiego usera, który jest gościem
        User u3 = new User("Adam", "Mickiewicz", u2, "admin"); //zmienił zdanie


        Product p1 = new Product("Glany", 499.99, 69, -420); //ten produkt ma ustawioną ilość poniżej zera, ale kod na to nie pozwoli więc będzie po prostu 0
        Product p2 = new Product("Zemby Babci", 49.99, 555755, 6699); //konstruktor dla którego jest ilość
        Product p3 = new Product("Buty Dziadka", 49.99, 66657676); //konstruktor dla którego nie ma ilości

        p2.cena = 987.876; //zmiana ceny
        p2.ilosc = 5; //zmiana ilości

        System.out.println(p1.draft()); //Pobranie i wydrukowanie wszystkich parametrów
    }
}