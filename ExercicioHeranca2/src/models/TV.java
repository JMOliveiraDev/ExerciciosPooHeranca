package models;

public class TV extends Produto {

    //atributos
    protected String modelo;
    protected String marca;
    protected String sistemaOperacional;
    protected float tamanhoDeTela;

    public TV(String modelo, String marca, String sistemaOperacional, float tamanhoDeTela, float codigo, float precoDeVenda, String tipoProduto) {
        super(codigo, precoDeVenda, tipoProduto);
        this.modelo = modelo;
        this.marca = marca;
        this.sistemaOperacional = sistemaOperacional;
        this.tamanhoDeTela = tamanhoDeTela;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public float getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(float precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public float getTamanhoDeTela() {
        return tamanhoDeTela;
    }

    public void setTamanhoDeTela(float tamanhoDeTela) {
        this.tamanhoDeTela = tamanhoDeTela;
    }

    public float getCodigo() {
        return codigo;
    }

    public void setCodigo(float codigo) {
        this.codigo = codigo;
    }

    //metodos
    @Override
    public String getDescricaoCompleta() {
        return this.marca + " | " + this.modelo + " | " + this.sistemaOperacional + " | " + this.tamanhoDeTela;
        // modelo, marca, sistema operacional e tamanho da tela.
    }

}
