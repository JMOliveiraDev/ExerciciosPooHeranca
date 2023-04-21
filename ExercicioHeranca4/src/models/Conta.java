package models;

public class Conta {

    //atributos
    protected String nomeCompleto;
    protected int numeroDaConta;
    protected int numeroDaAgencia;
    protected double saldo;
    protected String documento;

    public Conta(String nomeCompleto, int numeroDaConta, int numeroDaAgencia, double saldo, String documento) {
        this.nomeCompleto = nomeCompleto;
        this.numeroDaConta = numeroDaConta;
        this.numeroDaAgencia = numeroDaAgencia;
        this.saldo = saldo;
        this.documento = documento;
    }
    //métodos

    public double depositarValor(double valorDepositado) throws Exception {
        if (valorDepositado > 0) {
            this.saldo += valorDepositado;  // this.saldo = this.saldo + valordepositado;
            return this.saldo;
        } else {
            throw new Exception("Valor depositado deve ser positivo para a conta: " + this.numeroDaAgencia);
        }

    }

    public double sacarValor(double valorSacado) throws Exception {
        if (valorSacado <= this.saldo) {
            this.saldo -= valorSacado;
            return valorSacado;
        } else {
            throw new Exception("Saldo indisponível na conta de número: " + this.numeroDaAgencia);
        }

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
        return "Conta{" + "nomeCompleto = " + nomeCompleto + ", numeroDaConta = " + numeroDaConta + ", numeroDaAgencia = " + numeroDaAgencia + ", saldo = " + saldo + ", documento = " + documento + '}';
    }

    
}
