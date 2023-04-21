package models;

public class PessoaFisica extends Pessoa {

    //atributos
    protected String CPF;
    protected String sexo;

    //metodos
    public PessoaFisica(String CPF, String sexo, String nome, String endereco, String telefone, String email, float rendaBruta) {
        super(nome, endereco, telefone, email, rendaBruta);
        this.CPF = CPF;
        this.sexo = sexo;
    }

    @Override
    public float calcularImpostoRenda() {
        if ((this.rendaBruta >= 0) && (this.rendaBruta <= 1400)) {
            return 0;
        } else if ((this.rendaBruta > 1400) && (this.rendaBruta <= 2100)) {
            return this.rendaBruta * (float)0.10;
        } else if ((this.rendaBruta > 2100) && (this.rendaBruta <= 2800)) {
            return this.rendaBruta * (float)0.15;
        } else if ((this.rendaBruta > 2800) && (this.rendaBruta <= 3600)) {
            return this.rendaBruta * (float)0.25;
        } else if (this.rendaBruta > 3600) {
            return this.rendaBruta * (float)0.3;
        } else {
            return 0;
        }

    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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
