import java.util.Scanner;
import java.util.Locale;
import java.util.Random;
import javax.swing.JOptionPane;

public class TUI {

    Joc joc = new Joc();

    public void inici() {
        // INTRODUCCIÓ AL JOC
        System.out.println();
        System.out.println("Iniciant: 'TRES EN RATLLA'");
        System.out.println();


        // MÉTODE QUE FA VEURE QUE ESTÀ CARREGANT EL JOC 2 segons
        TUI.carga(2);
        // Thread.sleep(2000);


        // MOSTRAR TEXT DE CARREGANT MENÚ
        System.out.println("Carregant Menú...");
        System.out.println();


        // MÉTODE QUE FA VEURE QUE ESTÀ CARREGANT EL JOC 2 segons
        TUI.carga(4);
        // Thread.sleep(2000);
    }

    // MENU
    public int menu() {
        String[] o_menu = {"Nova Partida", "Carregar Partida", "Configuració", "Sortir"};
        var menu = JOptionPane.showOptionDialog(null, "                                                    MENÚ",
                "TRES EN RATLLA", 0, 3, null, o_menu, o_menu[0]);
        if (menu == 0) {
            System.out.println("Iniciant: 'NOVA PARTIDA'...");
        } else if (menu == 1) {
            System.out.println("Preparant: 'CARREGAR PARTIDA'");
        } else if (menu == 2) {
            System.out.println("Obrint: 'CONFIGURACIÓ'");
        } else {
            System.out.println("Sortint del 'TRES EN RATLLA'");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        return menu;
    }

    public void nova_partida() {

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(" \n \n \n \n \n \n ");


        joc.jugar();

    }
    public void carregar_partida() {
        System.out.println("Sóc carregar_partida");
    }
    public void configuracio() {
        System.out.println("Sóc la config");
    }
    public void sortir() {
        return;
    }

    // TAULELL DE JOC FENT ÚS DE ASCII CODE EXTENDED
    public static void taulell() {
        System.out.println("    A   B   C  " );
        System.out.println("  ╔═══╦═══╦═══╗");
        System.out.println("1 ║   ║   ║   ║");
        System.out.println("  ╠═══╬═══╬═══╣");
        System.out.println("2 ║   ║   ║   ║");
        System.out.println("  ╠═══╬═══╬═══╣");
        System.out.println("3 ║   ║   ║   ║");
        System.out.println("  ╚═══╩═══╩═══╝");


        // BORRAR MÉS TARD UN COP ESTIGUI ORGANITZAT EL PROJECTE
        Random aleatori = new Random();
        int num_aleatori = aleatori.nextInt(2);

        System.out.println("Comença partida el jugador " + num_aleatori + "!");


        // ARRAY PER LES POSICIONS DEL JOC
        // ARRAY[i][j] = ARRAY[fila][columna]
        String[][] pt = {
                {"", "", ""},
                {"", "", ""},
                {"", "", ""}
        };


        // TAULELL AMB POSICIONS
        System.out.println("    A   B   C  " );
        System.out.println("  ╔═══╦═══╦═══╗");
        System.out.println("1 ║ "+pt[0][0]+"  ║ "+pt[0][1]+"  ║ "+pt[0][2]+"  ║");
        System.out.println("  ╠═══╬═══╬═══╣");
        System.out.println("2 ║  "+pt[1][0]+" ║  "+pt[1][1]+" ║  "+pt[1][2]+" ║");
        System.out.println("  ╠═══╬═══╬═══╣");
        System.out.println("3 ║ "+pt[2][0]+"  ║ "+pt[2][1]+"  ║ "+pt[2][2]+"  ║");
        System.out.println("  ╚═══╩═══╩═══╝");
    }


    public static void carga(int segons) {
        try {
            Thread.sleep(segons * 1000);
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();;
        }
    }


    public void fiDePartida() {
    }


    public void confi() throws InterruptedException {
        String jugador1 = "Jugador1";
        String jugador2 = "Jugador2";

        String fj1 = "X";
        String fj2 = "O";

        // JOptionPane ---> Cambiar valor de fitxa? No / Si

        String[] s_n = {"Sí", "No"};
        var opt_s_n = JOptionPane.showOptionDialog(null, "\nVols cambiar el nom de:\n'" + jugador1 + "'  i  '" + jugador2 + "'?\n ", "TRES EN RATLLA", 0, 3, null, s_n, s_n[1]);
        System.out.println(opt_s_n);
        if (opt_s_n == 0) {
            jugador1 = JOptionPane.showInputDialog("Introdueix el nom del 'Jugador1'");
            JOptionPane.showMessageDialog(null, "Jugador1 ara és: " + jugador1 + ".", "TRES EN RATLLA", 1);

            Thread.sleep(500);
            // RECTIFICAR EL CONDICIONAL PERQUE NO FACI UN BUCLE INFINIT

            // NO POTS INTRODUIR UN NOM BUIT
            // boolean nj1 = jugador1.trim().isEmpty();
            // else if (nj1 = true));

            // SEPARAR IF PER TAL DE SEPARAR EL ERROR. 1. nom = jugador2 2. length + 10 3. no pot ser null ni sense no text
            // HAURIA DE SER UN WHILE

            while (jugador1.equals(jugador2) || jugador1.length() > 10 || jugador1.equals("")) {

            }
            if (jugador1.equals(jugador2) || jugador1.length() > 10 || jugador1.equals("")) {
                JOptionPane.showMessageDialog(null, "No pots introduir el mateix nom que '" + jugador2 + "',\nni pot tenir una llargada de més de 10 caràcters.", "TRES EN RATLLA", 0);
                jugador1 = JOptionPane.showInputDialog("Introdueix el nom del 'Jugador1'");
                Thread.sleep(1000);
                // QUAN SIGUI VÀLID EL NOM MOSTRAR AIXÓ:
                JOptionPane.showMessageDialog(null, "Jugador1 ara és: " + jugador1 + ".", "TRES EN RATLLA", 1);
            } else {}

            // —>

            jugador2 = JOptionPane.showInputDialog("Introdueix el nom del 'Jugador2'");
            JOptionPane.showMessageDialog(null, "Jugador2 ara és: " + jugador2 + ".", "TRES EN RATLLA", 1);
            // REPETIR BUCLE PER NOM CORRECTE
        } else {

        }

        System.out.println(jugador1 + " " + jugador2);

        String[] f_s_n = {"Sí", "No"};
        var opt_f_s_n = JOptionPane.showOptionDialog(null, "\nVols cambiar la fitxa de:\n\n -  '" + jugador1 + "': '" + fj1 + "'\n\n -  '" + jugador2 + "': '" + fj2 + "'?\n ", "TRES EN RATLLA", 0, 3, null, s_n, s_n[0]);
        System.out.println(opt_f_s_n);
        if (opt_s_n == 0) {

            fj1 = JOptionPane.showInputDialog(null, "Amb quina fitxa vols jugar " + jugador1 + "?", "TRES EN RATLLA", 1);
            if (fj1.equals(fj2) || fj1.length() > 1) {

            }
            // FER COMPARACIÓ DEL RESULTAT INTRODUIT QUE NO SIGUI EL MATEIX QUE EL DE fj2
            // MIRAR LA LONGITUD DE fj1 NOMÉS POT SER 1 DE LENGTH
            // MOSTRAR LA ELECCIÓ DEL jugador1

            JOptionPane.showMessageDialog(null, jugador1 + " has seleccionat jugar amb '" + fj1 + "'","TRES EN RATLLA", 1);

            fj2 = JOptionPane.showInputDialog("Amb quina fitxa vols jugar " + jugador2 + "?");
            // FER COMPARACIÓ DEL RESULTAT INTRODUIT QUE NO SIGUI EL MATEIX QUE EL DE fj2
            // MIRAR LA LONGITUD DE fj1 NOMÉS POT SER 1 DE LENGTH
            // MOSTRAR LA ELECCIÓ DEL jugador1

            JOptionPane.showMessageDialog(null, jugador2 + " has seleccionat jugar amb '" + fj2 + "'","TRES EN RATLLA", 1);

        } else {

        }

        String[] o_menu = {"Nova Partida", "Carregar Partida", "Configuració", "Sortir"};
        var menu = JOptionPane.showOptionDialog(null, "                                                    MENÚ", "TRES EN RATLLA", 0, 3, null, o_menu, o_menu[0]);
        if (menu == 0) {
            System.out.println("Iniciant 'NOVA PARTIDA'");
        } else if (menu == 1) {
            System.out.println("Preparant: 'CARREGAR PARTIDA'");
        } else if (menu == 2) {
            System.out.println("Obrint: 'CONFIGURACIÓ'");
        } else {
            System.out.println("Sortint del 'TRES EN RATLLA'");
            return;
        }

       /*
        if () {



        } else {

        }

        */
    }

    public void partida_win() {
    // PARTIDA
    int ronda = 0;
    boolean win = false;

        while (win = false) {
        // mentre no es guanyi
        //
        if (ronda %2 == 0) {
            // ronda par jugadorx
            // VALOR INTRODUIT .toUpperCase comparació
            ronda ++;
        } else {
            // ronda impar jugadory
            ronda ++;
        }

        ronda ++;
    }

    String jugada1 = "";
    String jugada2 = "";

    String[][] posicions = {
            {"", "", ""},
            {"", "", ""},
            {"", "", ""}
    };

    // CANVI DE ENTRADA A FITXA
        if (1A || A1) {

    }
        else if (1B || B1) {

    }
        else if (1C || C1) {

    }
        else if (2A || A2) {

    }
        else if (2B || B2) {

    }
        else if (2C || C2) {

    }
        else if (3A || A3) {

    }
        else if (3B || B3) {

    }
        else if (3C || C3) {

    }
        else {
        JOptionPane.showMessageDialog(null, "L'entrada no és vàlida, introdueix una posició correcte.",  "TRES EN RATLLA", 0, null );
    }


        if (ronda  % 2 != 0 && win == false ) {
        jugada1 = sc.next();
    } else {

    }

}


/*
    public static void jugadaGuanyadora () {
        if (    pt[0][0].equals(fj1) && pt[1][0].equals(fj1) && pt[2][0].equals(fj1) || // HORITZONTAL 0
                pt[0][1].equals(fj1) && pt[1][1].equals(fj1) && pt[2][1].equals(fj1) || // HORITZONTAL 1
                pt[0][2].equals(fj1) && pt[1][2].equals(fj1) && pt[2][2].equals(fj1) || // HORITZONTAL 2
                pt[0][0].equals(fj1) && pt[0][1].equals(fj1) && pt[0][2].equals(fj1) || // VERTICAL 0
                pt[1][0].equals(fj1) && pt[1][1].equals(fj1) && pt[1][2].equals(fj1) || // VERTICAL 1
                pt[2][0].equals(fj1) && pt[2][1].equals(fj1) && pt[2][2].equals(fj1) || // VERTICAL 2
                pt[0][0].equals(fj1) && pt[1][1].equals(fj1) && pt[2][2].equals(fj1) || // DIAGONAL \
                pt[0][2].equals(fj1) && pt[1][1].equals(fj1) && pt[2][0].equals(fj1)) // DIAGONAL /
        {
            JOptionPane.showMessageDialog(null,"");
            // break ronda;
        }
        // COM GUANYAR UNA PARTIDA NO RECURSIU - JUGADOR "O"
        else if (    pt[0][0].equals(fj2) && pt[1][0].equals(fj2) && pt[2][0].equals(fj2) || // HORITZONTAL 0
                pt[0][1].equals(fj2) && pt[1][1].equals(fj2) && pt[2][1].equals(fj2) || // HORITZONTAL 1
                pt[0][2].equals(fj2) && pt[1][2].equals(fj2) && pt[2][2].equals(fj2) || // HORITZONTAL 2
                pt[0][0].equals(fj2) && pt[0][1].equals(fj2) && pt[0][2].equals(fj2) || // VERTICAL 0
                pt[1][0].equals(fj2) && pt[1][1].equals(fj2) && pt[1][2].equals(fj2) || // VERTICAL 1
                pt[2][0].equals(fj2) && pt[2][1].equals(fj2) && pt[2][2].equals(fj2) || // VERTICAL 2
                pt[0][0].equals(fj2) && pt[1][1].equals(fj2) && pt[2][2].equals(fj2) || // DIAGONAL \
                pt[0][2].equals(fj2) && pt[1][1].equals(fj2) && pt[2][0].equals(fj2)) // DIAGONAL /
        {
            JOptionPane.showMessageDialog(null,"O");
            //  break ronda;
        }
    }

 */
