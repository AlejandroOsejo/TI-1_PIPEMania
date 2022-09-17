package model;
import java.util.Random;

public class BoardGame {
    private Casilla head;
    private Casilla tail;
    private String[][] board; //tablero con matriz
    private Random random;


    public BoardGame(){
        board = new String[8][8];
    }

    public void generateBoard(){ //generar el board

        for (int x = 0; x<board.length;x++){
            for(int y = 0; y<board[x].length;y++){
                board[x][y]="x";
            }
        }
        board[random.nextInt(8)][random.nextInt(8)]="F";
        board[random.nextInt(8)][random.nextInt(8)]="D";




    }


    public void showBoaard(){ // mostrar board --> 2 ciclos for

    }


    public void putPipe(){ // poner tubo

    }


    public void simulate(){ //Simular juego --> recursividad

    }


    public void calculateScore(){

    }


}
