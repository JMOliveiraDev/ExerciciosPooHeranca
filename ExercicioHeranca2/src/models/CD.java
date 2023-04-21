package models;

public class CD extends Produto {

    //atributos
    protected String nomeDoAlbum;
    protected String banda;
    protected String cantor;
    protected String generoMusical;

    public CD(String nomeDoAlbum, String banda, String cantor, String generoMusical, float codigo, float precoDeVenda, String tipoProduto) {
        super(codigo, precoDeVenda, tipoProduto);
        this.nomeDoAlbum = nomeDoAlbum;
        this.banda = banda;
        this.cantor = cantor;
        this.generoMusical = generoMusical;
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

    public String getNomeDoAlbum() {
        return nomeDoAlbum;
    }

    public void setNomeDoAlbum(String nomeDoAlbum) {
        this.nomeDoAlbum = nomeDoAlbum;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
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

        return this.banda + " | " + this.nomeDoAlbum + " | " + this.cantor + " | " + this.generoMusical;
        //nome do album, banda, cantor e gênero musical.
    }

}
