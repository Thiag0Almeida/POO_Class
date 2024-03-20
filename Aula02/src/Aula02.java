public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic 4 em 1";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.qualidade = "Boa";
        c1.carga = 87;

        c1.tampar();
        c1.status();

        c1.rabiscar();

        System.out.println("--------------------");

        Caneta c2 = new Caneta();
        c2.modelo = "Caneta Régua";
        c2.cor = "Azul";
        c2.ponta = 0.7f;
        c2.qualidade = "Excelente";
        c2.carga = 79;

        c2.status();

        c2.rabiscar();
    }
}
