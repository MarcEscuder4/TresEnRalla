import java.util.Scanner;
import java.util.Locale;
import java.util.Random;
import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        /*
        COMENTAR TOT EL CODI
        */


        // COMENTAR TOT EL CODI


        TUI tui = new TUI();
        Joc joc = new Joc();


        tui.inici();


        int opcio = tui.menu();

        if (opcio == 0) {
            // NOVA PARTIDA
            // MOSTRAR JUGADOR 1 i 2 I PREGUNTAR SI VOLEN JUGAR AMB FITXES X i O O  AMB SELECTOR DE FITXA.
            // MOSTRAR REGLES I INICIAR PARTIDA
            tui.nova_partida();
        } else if (opcio == 1) {
            // CARREGAR PARTIDA
            // UNA PARTIDA INICIADA I NO ACABADA ÉS PODRÀ TORNAR SEGUIR QUAN VOLGUEM REPRENDRE LA PARTIDA.
            tui.carregar_partida();
        } else if (opcio == 2) {
            // CONFIGURACIÓ
            // OPCIONS: SELECTOR DE FITXA, NOMS
            tui.configuracio();
        } else {
        }



        /*
        COMENTAR TOT EL CODI
         */


        // COMENTAR TOT EL CODI






/*
        // INTRODUCCIÓ AL JOC
        System.out.println();
        System.out.println("Iniciant: 'TRES EN RATLLA'");
        System.out.println();


        // MÉTODE QUE FA VEURE QUE ESTÀ CARREGANT EL JOC 2 segons
        Carga.carga(2);
        // Thread.sleep(2000);


        // MOSTRAR TEXT DE CARREGANT MENÚ
        System.out.println("Carregant Menú...");
        System.out.println();
*/

        // TEMPS D'ESPERA
        // Thread.sleep(2000);
        // TUI2.carga(4);



        // MÉTODE QUE FA VEURE QUE ESTÀ CARREGANT EL JOC 4 segons
        // Thread.sleep(4000);
        // Carga.carga(4);


        // -------------------------------------------------------------------------------
        // ARRAY 3X3 + COM GUANYAR UNA PARTIDA


        // ASSIGNAR VALORS A JUGADORS
        String fj1 = "X";
        String fj2 = "O";


        String[][] pt = {
                {"", "", ""},
                {"", "", ""},
                {"", "", ""}
        };


        // COMPTADOR DE RONDES
        int ronda = 0;


        // COM GUANYAR UNA PARTIDA NO RECURSIU - JUGADOR "X"
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
        else if (
                pt[0][0].equals(fj2) && pt[1][0].equals(fj2) && pt[2][0].equals(fj2) || // HORITZONTAL 0
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
        // -----------------------------------------------------------------------------------------------------------


    }
    public static void crearPartida(){

    }


    // CONFIGURACIÓ

    // FALTA CORRETGIR LA COMPARACIÓ DE FJ1 AMB FJ2 PER EVITAR QUE J1 NO PUGUI SELECCIONAR LA FITXA DE J2 I VICEVERSA
    private static void configuracio () {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);


        // ASSIGNAR VALORS A JUGADORS
        String fj1 = "X";
        String fj2 = "O";

        // MODIFICAR FITXA DES DE CONFIGURACIÓ
        System.out.println("Jugador 1, amb quin caràcter vols jugar? (Només es permet 1 caràcter, i no pot ser el mateix que el del jugador 2 " + fj2 + ")");
        fj1 = sc.next();
        if (fj1.equals(fj2) || fj1.length() > 1) {
            fj1 = sc.next();
        }
        System.out.println("Jugador 2, amb quin caràcter vols jugar? (Només es permet 1 caràcter, i no pot ser el mateix que el del jugador 2 " + fj1 + ")");
        fj2 = sc.next();
        if (fj2.equals(fj1) || fj2.length() > 1) {
            fj2 = sc.next();
        }
    }


    private static void novaPartida () {

    }

}


/*
        int regles_a;
        String[] i_regles = {"Acceptar"};
        String[] a_regles = {"Acceptar"};
        var regles = JOptionPane.showOptionDialog(null, "\nPer torns, s'ha d'aconseguir posar el teu símbol\ntres cops seguits en una línia recte o diagonal.\nEl que primer ho aconsegueixi guanya.\n ", "REGLES: TRES EN RATLLA", 0, 1, null, i_regles, i_regles[0]);
        do {
     //       do {
              //   int regles_a = JOptionPane.showOptionDialog(null, "\nPer poder continuar has d'acceptar les regles del joc!\n ", "REGLES: TRES EN RATLLA", 0,0,null, a_regles, a_regles[0]);
       //     } while (a_regles != 0);
        } while (regles != 0);

*/


// BASE DE NOVA CLASSE

// CRIDA A LA CLASSE