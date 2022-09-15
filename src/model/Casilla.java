package model;

public class Casilla {
    private Casilla next;
    private Casilla prev;
    private Casilla up;
    private Casilla down;
    private TipoTuberia tipo; // ||, =, o, source, drain
    private int row;
    private int col;

    public Casilla getNext() {return next;}
    public void setNext(Casilla next) {this.next = next;}

    public TipoTuberia getTipo() {return tipo;}
    public void setTipo(TipoTuberia tipo) {this.tipo = tipo;}
}
