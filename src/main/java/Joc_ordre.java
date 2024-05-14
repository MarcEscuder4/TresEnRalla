import javax.swing.*;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Joc_ordre {


    public void inici_torn_aleatori() {
        // BORRAR MÉS TARD UN COP ESTIGUI ORGANITZAT EL PROJECTE
        Random aleatori = new Random();
        int num_aleatori = aleatori.nextInt(2);
    }

    public void taulell() {
        System.out.println("    A   B   C  ");
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
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "}
        };


        // TAULELL AMB POSICIONS
        System.out.println("    A   B   C  ");
        System.out.println("  ╔═══╦═══╦═══╗");
        System.out.println("1 ║ " + pt[0][0] + "  ║ " + pt[0][1] + "  ║ " + pt[0][2] + "  ║");
        System.out.println("  ╠═══╬═══╬═══╣");
        System.out.println("2 ║  " + pt[1][0] + " ║  " + pt[1][1] + " ║  " + pt[1][2] + " ║");
        System.out.println("  ╠═══╬═══╬═══╣");
        System.out.println("3 ║ " + pt[2][0] + "  ║ " + pt[2][1] + "  ║ " + pt[2][2] + "  ║");
        System.out.println("  ╚═══╩═══╩═══╝");
    }




    public void joc() {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);


        // MOSTRA EN UN POPUP L'OBJECTIU / REGLES DEL JOC
        JOptionPane.showMessageDialog(null, "Per torns, s'ha d'aconseguir posar el teu símbol\ntres cops seguits en una línia recte o diagonal.\nEl que primer ho aconsegueixi guanya. ", "REGLES: TRES EN RATLLA", 1, null);


        // DECLARO ELS JUGADORS I LES FITXES QUE UTILITZARÀ CADA UN
        char jugador11 = 'X';
        char jugador22 = 'O';


        // SELECCIONA QUIN JUGADOR COMENÇARÀ EL PRIMER TORN EN FUNCIÓ D'UN NÚMERO GENERAT ALEATORIAMENT DEL 0 al 1
        Random aleatori = new Random();
        int num_aleatori = aleatori.nextInt(2);


        // SI num_aleatori ÉS PARELL INICIARÀ PARTIDA jugador2
        if (num_aleatori % 2 == 0) {
            jugador11 = 'O';
            jugador22 = 'X';
        } else {
        }

        // SI S'ESCULL NOVA PARTIDA DEMANEM LA INFORMACIÓ DE QUI jugador1 "X" I QUI ÉS jugador2 "O"
        String jugador1 = JOptionPane.showInputDialog("Nom del jugador 1 (X)");
        System.out.println("Benvingut " + jugador1 + " ets el JUGADOR 1, jugues amb les 'X'.");


        // TEMPS D'ESPERA PERQUE ELS JUGADORS PUGUIN LLEGIR EL TERMINAL
        Carga.carga(3);



        String jugador2 = JOptionPane.showInputDialog("Nom del jugador 2 (O)");
        System.out.println("Benvingut " + jugador2 + " ets el JUGADOR 2, jugues amb les 'O'.");


    }

    /*
    // REINICI DE TAULELL I TORN
    public void novaPartida() {
        torn = 1;
    }

     */


    public void jugar() {
        // ARRAY PER LES POSICIONS DEL JOC
        // ARRAY[i][j] = ARRAY[fila][columna]
        String[][] pt = {
                {"\uD83D\uDC37", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "}
        };


        // TAULELL AMB POSICIONS
        System.out.println("    A   B   C  ");
        System.out.println("  ┌───┬───┬───┐");
        System.out.println("1 │ " + pt[0][0] + " │ " + pt[0][1] + " │ " + pt[0][2] + " │");
        System.out.println("  ├───┼───┼───┤");
        System.out.println("2 │ " + pt[1][0] + " │ " + pt[1][1] + " │ " + pt[1][2] + " │");
        System.out.println("  ├───┼───┼───┤");
        System.out.println("3 │ " + pt[2][0] + " │ " + pt[2][1] + " │ " + pt[2][2] + " │");
        System.out.println("  └───┴───┴───┘");

        /*

        fer IF sobre valors del taulell, l'entrada de la posició es dona per un JOptionPane

        TRANSFORMAR PRIMER L'ENTRADA EN UPPERCASE PER EVITAR ENTRADES EN MINÚSCULA

        if ("1A" || "A1" || "1a" || "a1" && equals.("") o UPPERCASE{
        }
        else if ("2A" || "A2") {
       }
       else if ("3A" || "A3") {
       }
       else if ("1B" || "B1") o UPPERCASE{
        }
        else if ("2B" || "B2") {
       }
       else if ("3B" || "B3") {
       }
       else if ("1C" || "C1") o UPPERCASE{
       }
        else if ("2C" || "C2") {
       }
       else if ("3C" || "C3") {
       }
       else {
       sout "POSICIÓ NO VÀLIDA, INTRODUEIXI UNA POSICIÓ CORRECTE"
       }

         */

    }

    /*
    public void jugadaGuanyadora() {
        TUI.taulell();
    }

     */

    //  ----------------------------
    // CONFIGURACIÓ DE MIDA DE TAULELL

    public void midapartida() {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        System.out.println("Amb quina mida de taulell vols jugar? ( min. 3 - max. 10 )");

        int xpx = sc.nextInt();

        String[][] posicions = new String[xpx][xpx];

        for (int i = 0; i < xpx; i++) {
            for (int j = 0; j < xpx; j++) {
                posicions[i][j] = "";
            }
        }
    }
    // Array per allargar el taulell de joc

    //  ----------------------------


}
