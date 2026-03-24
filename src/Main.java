//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ksiazka harryPotter = new Ksiazka( "Harry Potter", "J.K. Rowling", 300, true);

           harryPotter.wypiszInfo();
           harryPotter.wypozycz();
           harryPotter.wypiszInfo();
           harryPotter.zwroc();
           harryPotter.wypiszInfo();

        Czytelnik janKowalski=new Czytelnik("Jan","Kowalski", 445,4);
        janKowalski.printInfo();

    }
}