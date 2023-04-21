package modelos;

public class Automovel implements IInterfaceVeículo {

    //atributos
    protected boolean ligado;
    protected boolean andar;

    public Automovel(boolean ligado, boolean andar) {
        this.ligado = ligado;
        this.andar = andar;
    }
    
    
    
    
    @Override
    public void ligar() {
       this.ligado = true;
    }

    @Override
    public void desligar() {
        this.ligado = false;
    }

    @Override
    public void acelerar() {
        this.andar = false;
    }
    
    public void frear(){
        this.andar = true;
    }

    @Override
    public String toString() {
        return "Automovel{" + "ligado=" + ligado + ", andar=" + andar + '}';
    }

 
    

}
