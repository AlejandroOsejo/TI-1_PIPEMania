import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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
                case 1://StartGame
                    break;
                case 2://ScoreBoard
                    break;
                case 3://Exit
                    System.out.println("Nos vemos pronto querido jugador");
                    operator = false;
                    break;
            }
        }

    }
}
