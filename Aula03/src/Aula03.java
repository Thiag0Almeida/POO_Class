public class Aula03 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC - 4/1";
        c1.cor = "4 Cores";
        //c1.ponta = 0.5f;
        c1.carga = 76;
        //c1.tampada = true;

        c1.tampar();
        c1.status();

        c1.rabiscar();
    }
}
