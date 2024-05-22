import java.util.Scanner;

public class Joc {



    public void joc() {
        Scanner scanner = new Scanner(System.in);

        // Definir jugadores y sus fichas
        String[] jugadores = {"Jugador 1", "Jugador 2"};
        char[] fichas = {'X', 'O'};


        // Tablero de juego
        int mides_taulell;

        char[][] tablero = new char[3][3];

        // Bucle principal del juego
        for (int turno = 0; turno < 9; turno++) {
            System.out.println("Turno " + (turno + 1) + ": " + jugadores[turno % 2]);
            mostrarTablero(tablero);

            // Colocar la ficha en el tablero
            colocarFicha(tablero, fichas[turno % 2]);

            // Verificar si hay un ganador
            if (hayGanador(tablero)) {
                System.out.println("¡" + jugadores[turno % 2] + " ha ganado!");
                mostrarTablero(tablero);
                return;
            }
        }



        // Si no hay ganador después de 9 turnos, el juego termina en empate
        System.out.println("\nEl juego ha terminado en empate.\n");
        mostrarTablero(tablero);

        scanner.close();
    }

    // Método para mostrar el tablero
    public static void mostrarTablero(char[][] tablero) {
        System.out.println("    A   B   C  ");
        System.out.println("  ┌───┬───┬───┐");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + 1 + " │ ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " │ ");
            }
            System.out.println();
            if (i < 2) {
                System.out.println("  ├───┼───┼───┤");
            }
        }
        System.out.println("  └───┴───┴───┘");
    }

    // Método para colocar una ficha en el tablero
    public static void colocarFicha(char[][] tablero, char ficha) {
        Scanner scanner = new Scanner(System.in);
        int fila, columna;

        do {
            System.out.print("Ingrese la fila (1-3) para colocar su ficha: ");
            fila = scanner.nextInt();
            System.out.print("Ingrese la columna (A-C) para colocar su ficha: ");
            char letraColumna = scanner.next().toUpperCase().charAt(0);
            columna = letraColumna - 'A';
        } while (fila < 1 || fila > 3 || columna < 0 || columna > 2 || tablero[fila - 1][columna] != '\u0000');

        tablero[fila - 1][columna] = ficha;
    }

    // TEST
    public void sumar() {
        int a = 20;
        int b= 29;

        int suma = a + b;
    }

    // Método para verificar si hay un ganador
    public static boolean hayGanador(char[][] tablero) {
        // Verificar filas y columnas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] != '\u0000' && tablero[i][0] == tablero[i][1] && tablero[i][0] == tablero[i][2]) {
                return true; // Ganador en una fila
            }
            if (tablero[0][i] != '\u0000' && tablero[0][i] == tablero[1][i] && tablero[0][i] == tablero[2][i]) {
                return true; // Ganador en una columna
            }
        }

        // Verificar diagonales
        if (tablero[0][0] != '\u0000' && tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2]) {
            return true; // Ganador en diagonal principal
        }
        if (tablero[0][2] != '\u0000' && tablero[0][2] == tablero[1][1] && tablero[0][2] == tablero[2][0]) {
            return true; // Ganador en diagonal secundaria
        }

        return false; // No hay ganador
    }


    public void carga(int segons) {
        try {
            Thread.sleep(segons * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }


    public void carga_mili(int milisegons) {
        try {
            Thread.sleep(milisegons * 1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }


    public static void sortir2() {

        System.exit(0);

    }

}


