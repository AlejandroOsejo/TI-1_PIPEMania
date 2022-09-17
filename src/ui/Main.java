package ui;

import model.BoardGame;
import model.ScoreBoard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BoardGame boardGame = new BoardGame();
        ScoreBoard scoreBoard = new ScoreBoard();

        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();
        Boolean operator;
        operator = true;


        while (operator){
            System.out.println("Buenas querido jugador, que desea hacer en el juego de PIPE MANIA. Teniendo en cuenta el menu escoja la opcicion que desea accionar: " +
                                "1. Empezar el juego \n" +
                                "2. Ver puntajes \n" +
                                "3. Salir");

            switch (menu){
                case 1://StartGame: crear tablero, crear jugador
                    System.out.println("Haz escogido empezar el juego.");
                    System.out.println("Buenas jugador, antes de empezar tenemos que dejar algo en claro, ¿Cual es su nombre?");
                    String name = sc.nextLine();
                    System.out.println("Hola!" +name + " vamos a empezar el juego");

                    break;
                case 2://model.ScoreBoard

                    System.out.println("Haz escogido ver puntajes");
                    scoreBoard.listPoints();

                    break;
                case 3://Exit
                    System.out.println("Nos vemos pronto querido jugador");
                    operator = false;
                    break;
            }
        }

    }
}
