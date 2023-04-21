package models;

public abstract class Pessoa {

    //atributos
    protected String nome;
    protected String endereco;
    protected String telefone;
    protected String email;
    protected float rendaBruta;

    //metodos
    public abstract float calcularImpostoRenda();

    public Pessoa(String nome, String endereco, String telefone, String email, float rendaBruta) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.rendaBruta = rendaBruta;
    }
    

}
