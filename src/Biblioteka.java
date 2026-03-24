public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;


    public Biblioteka(int pojemnosc) {
        ksiazki = new Ksiazka[pojemnosc];
        liczbaKsiazek = 0;
    }


    public void dodajKsiazke(Ksiazka ksiazka) {
        if (liczbaKsiazek < ksiazki.length) {
            ksiazki[liczbaKsiazek] = ksiazka;
            liczbaKsiazek++;
        } else {
            System.out.println("Nie można dodać więcej książek, brak miejsca.");
        }
    }


    public void wypiszDostepneKsiazki() {
        System.out.println("Dostępne książki:");
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].isDostepna()) {
                System.out.println((i+1) + ". " + ksiazki[i].getTytul() + " - " + ksiazki[i].getAutor());
            }
        }
    }


    public Ksiazka znajdzKsiazkePoTytule(String tytul) {
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].getTytul().equals(tytul)) {
                return ksiazki[i];
            }
        }
        return null;
    }


    public int policzDostepneKsiazki() {
        int licznik = 0;
        for (int i = 0; i < liczbaKsiazek; i++) {
            if (ksiazki[i].isDostepna()) {
                licznik++;
            }
        }
        return licznik;
    }

    public void wypozyczKsiazke(String tytul, Czytelnik czytelnik) {
        Ksiazka ksiazka = znajdzKsiazkePoTytule(tytul);
        if (ksiazka != null && ksiazka.isDostepna()) {
            ksiazka.wypozycz();
            czytelnik.zwiekszLiczbeWypozyczen();
        } else if (ksiazka != null) {
            System.out.println("Książka jest już wypożyczona.");
        } else {
            System.out.println("Nie znaleziono książki o tytule: " + tytul);
        }
    }

    public void zwrocKsiazke(String tytul, Czytelnik czytelnik) {
        Ksiazka ksiazka = znajdzKsiazkePoTytule(tytul);
        if (ksiazka != null && !ksiazka.isDostepna()) {
            ksiazka.zwroc();
            czytelnik.zmniejszLiczbeWypozyczen();
        } else if (ksiazka != null) {
            System.out.println("Książka była już dostępna.");
        } else {
            System.out.println("Nie znaleziono książki o tytule: " + tytul);
        }
    }
}
