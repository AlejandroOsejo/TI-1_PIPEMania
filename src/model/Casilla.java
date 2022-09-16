package model;

public class Casilla {
    private Casilla next;
    private Casilla prev;
    private TipoTuberia tipo; // ||, =, o, source, drain
    private int row;
    private int col;

    public Casilla(TipoTuberia tipo, int row, int col) {
        this.tipo = tipo;
        this.row = row;
        this.col = col;
    }

    public Casilla getPrev() {return prev;}
    public void setPrev(Casilla prev) {this.prev = prev;}

    public int getRow() {return row;}
    public void setRow(int row) {this.row = row;}

    public int getCol() {return col;}
    public void setCol(int col) {this.col = col;}

    public Casilla getNext() {return next;}
    public void setNext(Casilla next) {this.next = next;}

    public TipoTuberia getTipo() {return tipo;}
    public void setTipo(TipoTuberia tipo) {this.tipo = tipo;}
}
