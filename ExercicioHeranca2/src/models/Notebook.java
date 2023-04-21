package models;

public class Notebook extends Produto {

//atributos
    protected String marca;
    protected String modelo;
    protected int RAM;
    protected float HDeSSD;
    protected String processador;
    protected String sistema;
    protected float tamanhoTela;

    public Notebook(String marca, String modelo, int RAM, float HDeSSD, String processador, String sistema, float tamanhoTela, float codigo, float precoDeVenda, String tipoProduto) {
        super(codigo, precoDeVenda, tipoProduto);
        this.marca = marca;
        this.modelo = modelo;
        this.RAM = RAM;
        this.HDeSSD = HDeSSD;
        this.processador = processador;
        this.sistema = sistema;
        this.tamanhoTela = tamanhoTela;
    }

 

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public float getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(float tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    
    public float getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(float precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public float getHDeSSD() {
        return HDeSSD;
    }

    public void setHDeSSD(float HDeSSD) {
        this.HDeSSD = HDeSSD;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
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
     return this.marca + " | " + this.modelo + " | " + this.processador+ " | " + this.RAM + " | " + this.HDeSSD + " | " + this.tamanhoTela + " | " + this.sistema;
        //  marca, modelo, memória RAM, capacidade do HD/SSD, processador, tamanho da tela e sistema operacional;
       
    }

}
