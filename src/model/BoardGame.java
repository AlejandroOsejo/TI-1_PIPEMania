package model;
import java.util.Random;

import java.util.Random;

public class BoardGame {
    private Casilla head;
    private Casilla tail;
    private String[][] board; //tablero con matriz
    private Random random;

<<<<<<< HEAD

    public BoardGame(){
=======
    public void boardGame(){
>>>>>>> f39987f2bf70bd925eb8b99c4b52955ace6ebc6b
        board = new String[8][8];
    }

    public void generateBoard(){ //generar el board
<<<<<<< HEAD

        for (int x = 0; x<board.length;x++){
            for(int y = 0; y<board[x].length;y++){
                board[x][y]="x";
            }
        }
        board[random.nextInt(8)][random.nextInt(8)]="F";
        board[random.nextInt(8)][random.nextInt(8)]="D";




=======
        for (int x=0; x< board.length; x++){
            for (int y=0; y< board.length; y++){
                board[x][y] = "x";
            }
        }
        board[random.nextInt(8)][random.nextInt(8)] = "F";
        board[random.nextInt(8)][random.nextInt(8)] = "D";
>>>>>>> f39987f2bf70bd925eb8b99c4b52955ace6ebc6b
    }


    public void showBoaard(){ // mostrar board --> 2 ciclos for
        System.out.println("TABLERO");
        for (int x=0; x<8; x++){
            for (int y=0; y<8; y++){
                System.out.println(board[x][y] + "  ");
            }
            System.out.println();
        }

    }


    public void putPipe(){ // poner tubo

    }


    public void simulate(){ //Simular juego --> recursividad

    }


    public void calculateScore(){

    }


}
