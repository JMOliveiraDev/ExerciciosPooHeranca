package modelos;

public class Barco implements IInterfaceVeículo {

    //atributos
    protected boolean ligado;
    protected boolean navegar;

    public Barco(boolean ligado, boolean navegar) {
        this.ligado = ligado;
        this.navegar = navegar;
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
        this.navegar = false;
    }

    public void frear() {
        this.navegar = true;
    }

    @Override
    public String toString() {
        return "Barco{" + "ligado=" + ligado + ", navegar=" + navegar + '}';
    }

}
