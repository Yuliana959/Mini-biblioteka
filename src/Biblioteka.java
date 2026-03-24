public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    // Konstruktor przyjmujący maksymalny rozmiar tablicy
    public Biblioteka(int pojemnosc) {
        ksiazki = new Ksiazka[pojemnosc];
        liczbaKsiazek = 0;
    }

    // Dodawanie ksiazki do tablicy
    public void dodajKsiazke(Ksiazka ksiazka) {
        if (liczbaKsiazek < ksiazki.length) {
            ksiazki[liczbaKsiazek] = ksiazka;
            liczbaKsiazek++;
        } else {
            System.out.println("Nie można dodać więcej książek, brak miejsca.");
        }
    }

    // Wypisanie dostępnych książek
    public void wypiszDostepneKsiazki() {
        System.out.println("Dostępne książki:");
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].isDostepna()) {
                System.out.println((i+1) + ". " + ksiazki[i].getTytul() + " - " + ksiazki[i].getAutor());
            }
        }
    }

    // Znalezienie książki po tytule
    public Ksiazka znajdzKsiazkePoTytule(String tytul) {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].getTytul().equals(tytul)) {
                return ksiazki[i];
            }
        }
        return null; // nie znaleziono
    }

    // Policz dostępne książki
    public int policzDostepneKsiazki() {
        int licznik = 0;
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].isDostepna()) {
                licznik++;
            }
        }
        return licznik;
    }
}
