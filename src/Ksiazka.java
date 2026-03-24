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

    public void wypiszInfo() {
        System.out.println("Tytuł: " + this.tytul);
        System.out.println("Autor: " + this.autor);
        System.out.println("Liczba stron: " + this.LiczbaStron);
        System.out.println("Dostępna: " + this.dostepna);
    }

    public void wypozycz() {
        if (dostepna) {
            dostepna = false;
            System.out.println("Książka została wypożyczona.");
        } else {
            System.out.println("Książka jest już wypożyczona.");
        }
    }

    public void zwroc() {
        dostepna = true;
        System.out.println(tytul + " została zwrócona.");
    }

    public boolean isDostepna() {
        return dostepna;
    }

    public String getTytul() {
        return tytul;
    }

    public String getAutor() {
        return autor;
    }
}


