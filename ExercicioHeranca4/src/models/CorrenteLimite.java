package models;

public class CorrenteLimite extends CorrenteBasica {

    //atributo
    protected double credito;

    public CorrenteLimite(double credito, String nomeCompleto, int numeroDaConta, int numeroDaAgencia, double saldo, String documento) {
        super(nomeCompleto, numeroDaConta, numeroDaAgencia, saldo, documento);
        this.credito = credito;
    }

    //métodos
    public double debitar(double valorDebitado) throws Exception {
        if (valorDebitado > credito) {
            this.credito -= valorDebitado;
            return this.credito;
        } else {
            throw new Exception("Valor indisponível");
        }

    }

    public double creditar(double valorCreditado) throws Exception {
        if (valorCreditado <= 0) {
            throw new Exception("Valor depositavo não pode ser negativo");
        } else {
            this.credito += valorCreditado;
            return this.credito;
        }

    }
    
}
