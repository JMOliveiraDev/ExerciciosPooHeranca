package models;

public class Livro extends Produto {

    //atributos
    protected String titulo;
    protected String autor;
    protected String tradutor;
    protected String editora;
    protected int anoDePublicacao;

    public Livro(String titulo, String autor, String tradutor, String editora, int anoDePublicacao, float codigo, float precoDeVenda) {
        super(codigo, precoDeVenda,"Livro");
        this.titulo = titulo;
        this.autor = autor;
        this.tradutor = tradutor;
        this.editora = editora;
        this.anoDePublicacao = anoDePublicacao;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTradutor() {
        return tradutor;
    }

    public void setTradutor(String tradutor) {
        this.tradutor = tradutor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
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
        return this.titulo + " | De " + this.autor + " | " + this.editora + " | " + this.anoDePublicacao;
        //  título, autor, tradutor, editora e ano de publicação.
    }

}
