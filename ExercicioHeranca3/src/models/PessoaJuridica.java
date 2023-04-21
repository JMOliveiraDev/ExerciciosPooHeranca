package models;

public class PessoaJuridica extends Pessoa {

    //atributos
    protected String CNPJ;
    protected String razaoSocial;

    public PessoaJuridica(String CNPJ, String razaoSocial, String nome, String endereco, String telefone, String email, float rendaBruta) {
        super(nome, endereco, telefone, email, rendaBruta);
        this.CNPJ = CNPJ;
        this.razaoSocial = razaoSocial;
    }

    //metodos
    @Override
    public float calcularImpostoRenda() {
        if (this.rendaBruta > 0) {
            return this.rendaBruta * (float)0.2;
        } else {
            return 0;
        }
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(float rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

}
