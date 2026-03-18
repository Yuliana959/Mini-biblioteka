public class Ksiazka {
    private String tytul;
    private String autor;
    private int LiczbaStron;
    private boolean dostepna;

    public Ksiazka(String tytul, String autor, int LiczbaStron, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.LiczbaStron = LiczbaStron;
        this.dostepna = dostepna;
    }

    public void printInfo() {
        System.out.println("Tytuł: " + this.tytul);
        System.out.println("Autor: " + this.autor);
        System.out.println("Liczba stron: " + this.LiczbaStron);
        System.out.println("Dostępna: " + this.dostepna);
    }
}
