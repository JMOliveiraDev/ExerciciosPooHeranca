package modelos;

public class Aviao implements IInterfaceVeículo {

    //atributos
    protected boolean ligado;
    protected boolean voar;

    public Aviao(boolean ligado, boolean voar) {
        this.ligado = ligado;
        this.voar = voar;
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
        this.voar = false;
    }

    public void frear() {
        this.voar = true;
    }

    @Override
    public String toString() {
        return "Aviao{" + "ligado=" + ligado + ", voar=" + voar + '}';
    }



}
