//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ksiazka harryPotter = new Ksiazka( "Harry Potter", "J.K. Rowling", 300, true);
        Ksiazka wiedzmin = new Ksiazka("Wiedźmin", "Andrzej Sapkowski", 350, true);
        Ksiazka hobbit = new Ksiazka("Hobbit", "J.R.R. Tolkien", 250, true);

           harryPotter.wypiszInfo();
           harryPotter.wypozycz();
           harryPotter.wypiszInfo();
           harryPotter.zwroc();
           harryPotter.wypiszInfo();

        Czytelnik janKowalski=new Czytelnik("Jan","Kowalski", 445,4);
        janKowalski.printInfo();

        Biblioteka biblioteka = new Biblioteka(10);
        biblioteka.dodajKsiazke(harryPotter);
        biblioteka.dodajKsiazke(wiedzmin);
        biblioteka.dodajKsiazke(hobbit);

        biblioteka.wypiszDostepneKsiazki();

        Ksiazka szukana = biblioteka.znajdzKsiazkePoTytule("Hobbit");
        if (szukana != null) {
            System.out.println("Znaleziono książkę: " + szukana.getTytul());
        }

        System.out.println("Dostępne książki: " + biblioteka.policzDostepneKsiazki());
    }
}