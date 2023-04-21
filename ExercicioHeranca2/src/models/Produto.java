package models;

public abstract class Produto {

    //atributos
    protected float codigo;
    protected float precoDeVenda;
    protected String tipoProduto;

    public Produto(float codigo, float precoDeVenda, String tipoProduto) {
        this.codigo = codigo;
        this.precoDeVenda = precoDeVenda;
        this.tipoProduto = tipoProduto;
    }

    // metodos
    public abstract String getDescricaoCompleta();

}
