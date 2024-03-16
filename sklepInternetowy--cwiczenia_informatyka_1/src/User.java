public class User {
    private String imie;
    private String nazwisko;
    private String email;
    private String haslo;
    private Boolean gosc;

    User(String imie, String nazwisko, String email, String haslo) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.haslo = haslo;
        gosc = Boolean.FALSE; // well nie jest gościem bo podał coś więcej niż e-mail
    }
    User(String email) { // gość
        this.email = email;
        gosc = Boolean.TRUE;
    }

    User(String imie, String nazwisko, User p, String haslo) { //Gość -> nie gość
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = p.email;
        this.haslo = haslo;
        gosc = Boolean.FALSE;
    }
}
