public class Aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.abrirConta("CC");
        p1.setNumConta(1254);
        p1.setDono("Jubileu");
        p1.depositar(300);

        ContaBanco p2 = new ContaBanco();
        p2.setDono("Jurema");
        p2.setNumConta(1236);
        p2.abrirConta("CP");

        p2.depositar(500);

        p2.sacar(150);

        p1.estadoAtual();
        p2.estadoAtual();
    }
}
