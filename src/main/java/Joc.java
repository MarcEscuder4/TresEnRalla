public class Joc {

    char[][] taulell;
    int torn;


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

    public void carregar_partida() {

    }

    public void restartvalues() {
        String jugador1 = "Jugador 1";
        String jugador2 = "Jugador 2";
        String jugadorIA = "Jugador IA";

        char fj1 = 'X';
        char fj2 = 'O';

    }



    /*
    // MENÚ DE CONFIGURACIÓ
    int confi = tui.confi();

        if (confi == 0) {
        // joc.
    }
        else if (confi == 1) {
        // joc.
    }
        else if (confi == 2) {
        // joc.
    }
        else if (confi == 3) {
        // joc.
    }
        else if (confi == 4) {
        tui.menu();
    }
        else {
        return;
    }

     */

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

    public void configuracio_cn() {

        String jugador1 = "Jugador 1";
        String jugador2 = "Jugador 2";
        String jugadorIA = "Jugador IA";

    }

    public void configuracio_cf() {

        char fj1 = 'X';
        char fj2 = 'O';



    }

    public void configuracio_ct() {
        System.out.println("Sóc la config");
    }

    public void configuracio_mj() {
        System.out.println("Sóc la config");
    }

    public void configuracio_back() {
        System.out.println("Sóc la config");
    }


    public void sortir() {
        return;
    }



    public void carga(int segons) {
        try {
            Thread.sleep(segons * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void clean() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /*No hacer nada*/
        }
    }

}