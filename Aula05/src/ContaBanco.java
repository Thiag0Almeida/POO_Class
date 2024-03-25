public class ContaBanco {
    public int numConta ;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("______________---_______________");
        System.out.println("Dono:" + this.getDono());
        System.out.println("Conta:" + this.getNumConta());
        System.out.println("Tipo:" + this.getTipo());
        System.out.println("Saldo:" + this.getSaldo());
        System.out.println("Status:" + this.isStatus());
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus (true);
        if (t == "CC")
            this.setSaldo(50f);
        else if (t == "CP")
            this.setSaldo(150f);
    }
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Sua conta ainda tem saldo");
        } else if (this.getSaldo() < 0){
            System.out.println("Sua conta possui débitos");
        } else{
            System.out.println("Conta encerrada com sucesso");
            setStatus(false);
        }
    }
    public void depositar(float v){
        if (this.isStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito feito!");
        } else{
            System.out.println("Conta Inativa");
        }
    }
    public void sacar(float v){
        if (this.isStatus() && this.getSaldo() >= v){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Saque realizado com sucesso");
        }else{
            System.out.println("Verifique o seu saldo ou o status da conta");
        }
    }
    public void taxaMensal(){
        float v;
        if(this.getTipo() == "CC")
            v = 12;
        else
            v = 20;
        if(this.isStatus() && this.getSaldo() >= v)
            this.setSaldo(this.getSaldo() - v);
         else
            System.out.println("Impossível cobra taxa, conta inativa ou saldo insulficiente.");
    }

    public void ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
