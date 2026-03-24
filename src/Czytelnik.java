public class Czytelnik {
    private String imie;
    private String nazwisko;
    private int numerKarty;
    private int liczbaWypozyczen;

    public Czytelnik(String imie, String nazwisko, int numerKarty, int liczbaWypozyczen) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerKarty = numerKarty;
        this.liczbaWypozyczen = liczbaWypozyczen;
    }

    public void printInfo() {
        System.out.println("Imię " + this.imie);
        System.out.println("Nazwisko " + this.nazwisko);
        System.out.println("Numer Karty: " + this.numerKarty);
        System.out.println("Liczba wypożyczeń: " + this.liczbaWypozyczen);


    }
}
