public class Caneta {
    public String modelo;
    public String cor;
    public String qualidade;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.println("Uma caneta: " + this.modelo);
        System.out.println("De cor: " + this.cor);
        System.out.println("Qualidade da escrita: " +this.qualidade);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga %: " + this.carga);
        System.out.println("Fechada: " + this.tampada);
    }
    public void rabiscar(){
        if(this.tampada){
            System.out.println("Tampada eu não rabisco!");
        } else {
            System.out.println("agora sim papai!!");
        }
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }


}


