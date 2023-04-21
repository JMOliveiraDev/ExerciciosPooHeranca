package models;

public class CorrenteBasica extends Conta {

    //atributos
    public CorrenteBasica(String nomeCompleto, int numeroDaConta, int numeroDaAgencia, double saldo, String documento) {
        super(nomeCompleto, numeroDaConta, numeroDaAgencia, saldo, documento);
    }

    //métodos
    public double transferirValor(double valorATransferir, CorrenteBasica conta) throws Exception { // "CorrenteBasica é um objeto"
        try {
            conta.depositarValor(this.sacarValor(valorATransferir));
            return this.saldo;
        } catch (Exception e) {
            throw new Exception("Não foi possível Tranferir o valor | " + e.getMessage()); // Tratamento de erros nos métodos utilizados
        }
    }

    
}
