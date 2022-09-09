package model;

public class Casilla {
    private Casilla next;
    private TipoTuberia tipo;

    public Casilla getNext() {return next;}
    public void setNext(Casilla next) {this.next = next;}

    public TipoTuberia getTipo() {return tipo;}
    public void setTipo(TipoTuberia tipo) {this.tipo = tipo;}
}
