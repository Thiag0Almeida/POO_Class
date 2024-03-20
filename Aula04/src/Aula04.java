public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic", "Azul", 0.5f, false);
        c1.status();

        Caneta c2 = new Caneta("Faber-Castel", "Vermalha", 0.3f, true);
        c2.status();
    }
}
