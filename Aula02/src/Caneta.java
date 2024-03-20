public class Caneta {
    String modelo;
    String cor;
    String qualidade;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Uma caneta: " + this.modelo);
        System.out.println("De cor: " + this.cor);
        System.out.println("Qualidade da escrita: " +this.qualidade);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga %: " + this.carga);
        System.out.println("Fechada: " + this.tampada);
    }
    void rabiscar(){
        if(this.tampada){
            System.out.println("Tampada eu não rabisco!");
        } else {
            System.out.println("agora sim papai!!");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }


}
