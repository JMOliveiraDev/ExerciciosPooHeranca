package models;

public class Poupanca extends Conta {

    //atributos
    protected float rendimento;
    

    public Poupanca(float rendimento, String nomeCompleto, int numeroDaConta, int numeroDaAgencia, double saldo, String documento) {
        super(nomeCompleto, numeroDaConta, numeroDaAgencia, saldo, documento);
        this.rendimento = rendimento;
    }
    
    //metodos
    public float calculoRendimento(){
        return (float) (saldo * (rendimento/100));
    }

    public float getRendimento() {
        return rendimento;
    }

    public void setRendimento(float rendimento) {
        this.rendimento = rendimento;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getNumeroDaAgencia() {
        return numeroDaAgencia;
    }

    public void setNumeroDaAgencia(int numeroDaAgencia) {
        this.numeroDaAgencia = numeroDaAgencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Poupanca{" + "rendimento=" + rendimento + '}';
    }
    

    
    
}
