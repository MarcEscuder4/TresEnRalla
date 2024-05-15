import java.io.File;

public class Joc {

    public void jugadors(Joc joc) {

        String[] jugador = {"Jugador 1", "Jugador 2"};

    }

    public void fitxes(Joc joc) {

        char[] fitxa = {'X', 'O'};

    }


    public void tauell(Joc joc) {


        int mides_taulell = 3;

        System.out.println("Vols canviar les mides del taulell? (Si / No)");
        String resposta_mides_joc = "Si";
        if (resposta_mides_joc.equals("Si")) {
            mides_taulell = 10;

        } else {

        }

    }


    public void crear_taulell(Joc joc) {

        char[][] taulell_joc = new char[mides_taulell][mides_taulell];

        for (int i = 0 ; i < mides_taulell ; i++ ) {
            for (int j = 0 ; j < mides_taulell ; j++ ) {
            taulell_joc[i][j] = " ";

    };



        // String r_mides_joc = sc.next();

        // if (r_mides_joc.equals("Si") || r_mides_joc.equals("SI") || r_mides_joc.equals("si") || r_mides_joc.equals("S") || r_mides_joc.equals("s")) {
        //     System.out.println("Amb quines mides vols jugar? (3 mín. - 10 màx.)\n");

        //    mides_taulell = sc.nextInt();

        // }
        // else {

        // }



        /*
        // Bucle principal del juego
        for (int torn = 0; torn < 9; torn++) {
            System.out.println("Torn " + (torn + 1) + ": " + jugador[torn % 2]);
            mostrarTaulell(taulell);

            // Colocar la ficha en el tablero
            colocar_fitxa(taulell, fitxa[torn % 2]);

            // Verificar si hay un ganador
            if (hayGanador(taulell)) {
                System.out.println("¡" + jugador[torn % 2] + " ha ganado!");
                mostrarTaulell(taulell);
                return;
            }
        }


         */
        // Si no hay ganador después de 9 turnos, el juego termina en empate
        System.out.println("El juego ha terminado en empate.");
        mostrarTaulell(taulell);

        //    sc.close();
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

        /*
        // Método para colocar una ficha en el tablero
        public static void colocar_fitxa(char[][] taulell, char fitxa) {
            Scanner scanner = new Scanner(System.in);
            int fila, columna;

            do {
                System.out.print("Ingrese la columna (0- /* + mides_taulell + */ /* ) para colocar su ficha: ");
                columna = scanner.nextInt();
                System.out.print("Ingrese la fila (0-" + mides_taulell + ") para colocar su ficha: ");
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



    public void configuracio_canvi_nom() {

    }


    public void configuracio_canvi_fitxa() {

    }


    public void configuracio_canvi_taulell() {

    }


    public void configuracio_mides_taulell() {

    }

*/
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


    public void carregar_partida() {

    }

    public void restartvalues() {
        String jugador1 = "Jugador 1";
        String jugador2 = "Jugador 2";
        String jugadorIA = "Jugador IA";

        char fj1 = 'X';
        char fj2 = 'O';


        char[][] taulell;
        int torn;



    }

 /*
    // CLASSE JUGADOR PERMETRÀ PODER SELECCIONAR NOM I FITXA, TANT PER JUGADOR1 COM JUGADOR2
    public class Jugador {
        private String nom;
        private String fitxa;

        public Jugador() {
            this.nom = nom;
            this.fitxa = fitxa;
        }

        public String getNom() {
            return nom;
        }

        public String getFitxa() {
            return fitxa;
        }
    }

    public int getTorn() {
        return torn;
    }


    public char[][] getTaulell() {
        return taulell;
    }

    // REINICI DE TAULELL I TORN
    public void novaPartida() {
        torn = 1;
    }


  */

}

