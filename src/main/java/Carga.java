public class Carga {
    public static void carga (int segons) {
        try {
            Thread.sleep(segons * 1000);
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();;
        }
    }
}

/*
import java.util.Scanner;

public class JuegoPorTurnos {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        // Definir jugadores y sus fichas
        String[] jugador = {"Jugador 1", "Jugador 2"};
        char[] fitxa = {'X', 'O'};

        // Tablero de juego
        int mides_taulell = 3;

        System.out.println("Vols canviar les mides del taulell? (Si / No");

        String r_mides_joc = sc.next();

        if (r_mides_joc.equals("Si") || r_mides_joc.equals("SI") || r_mides_joc.equals("si") || r_mides_joc.equals("S") || r_mides_joc.equals("s")) {
            System.out.println("Amb quines mides vols jugar? (3 mín. - 10 màx.)\n");

            mides_taulell = sc.nextInt();

        } else {

        }

        char[][] taulell = new char[mides_taulell][mides_taulell];

        // Bucle principal del juego
        for (int turno = 0; turno < 9; turno++) {
            System.out.println("Turno " + (turno + 1) + ": " + jugador[turno % 2]);
            mostrarTaulell(taulell);

            // Colocar la ficha en el tablero
            colocar_fitxa(taulell, fitxa[turno % 2]);

            // Verificar si hay un ganador
            if (hayGanador(taulell)) {
                System.out.println("¡" + jugador[turno % 2] + " ha ganado!");
                mostrarTaulell(taulell);
                return;
            }
        }

        // Si no hay ganador después de 9 turnos, el juego termina en empate
        System.out.println("El juego ha terminado en empate.");
        mostrarTaulell(taulell);

        sc.close();
    }

    // Método para mostrar el tablero
    public static void mostrarTaulell(char[][] taulell) {
        for (char[] fila : taulell) {
            for (char celda : fila) {
                System.out.print(celda + " ");
            }
            System.out.println();
        }
    }

    // Método para colocar una ficha en el tablero
    public static void colocar_fitxa(char[][] taulell, char fitxa) {
        Scanner scanner = new Scanner(System.in);
        int fila, columna;

        do {
            System.out.print("Ingrese la columna (0-2) para colocar su ficha: ");
            columna = scanner.nextInt();
            System.out.print("Ingrese la fila (0-2) para colocar su ficha: ");
            fila = scanner.nextInt();
            System.out.println();
        } while (fila < 0 || fila > 2 || columna < 0 || columna > 2 || taulell[fila][columna] != '\u0000');

        taulell[fila][columna] = fitxa;
    }

    // Método para verificar si hay un ganador
    public static boolean hayGanador(char[][] taulell) {
        // Verificar filas y columnas
        for (int i = 0; i < 3; i++) {
            if (taulell[i][0] != '\u0000' && taulell[i][0] == taulell[i][1] && taulell[i][0] == taulell[i][2]) {
                return true; // Ganador en una fila
            }
            if (taulell[0][i] != '\u0000' && taulell[0][i] == taulell[1][i] && taulell[0][i] == taulell[2][i]) {
                return true; // Ganador en una columna
            }
        }

        // Verificar diagonales
        if (taulell[0][0] != '\u0000' && taulell[0][0] == taulell[1][1] && taulell[0][0] == taulell[2][2]) {
            return true; // Ganador en diagonal principal
        }
        if (taulell[0][2] != '\u0000' && taulell[0][2] == taulell[1][1] && taulell[0][2] == taulell[2][0]) {
            return true; // Ganador en diagonal secundaria
        }

        return false; // No hay ganador
    }
}
 */
