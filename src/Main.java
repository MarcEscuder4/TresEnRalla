import javax.swing.JOptionPane;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        /*
        COMENTAR TOT EL CODI
         */

         //TEST

        // COMENTAR TOT EL CODI


        // INTRODUCCIÓ AL JOC
        System.out.println();
        System.out.println("Iniciant: 'TRES EN RATLLA'");
        System.out.println();

        // MÉTODE QUE FA VEURE QUE ESTÀ CARREGANT EL JOC 2 segons
        Carga.carga(2);
        // Thread.sleep(2000);


        // MOSTRAR TEXT DE CARREGANT MENÚ
        System.out.println("Carregant MENÚ...");
        System.out.println();


        // TEMPS D'ESPERA
        Carga.carga(4);


        // MessageType CANVIA LA IMATGE DEL POPUP
        // MENÚ EN FORMA DE POP-UP. SEGONS LA OPCIÓ DEL MENÚ ESCOLLIDA INICIA UNA ACCIÓ.
        // CREEM UN ARRAY PER ESTABLIR AQUESTS VALORS COM A BOTONS DEL JOPtionPane
        String[] o_menu = {"Nova Partida", "Carregar Partida", "Configuració", "Sortir"};
        var menu = JOptionPane.showOptionDialog(null, "                                                    MENÚ", "TRES EN RATLLA", 0, 3, null, o_menu, o_menu[0]);
        if (menu == 0) {
            System.out.println("Iniciant 'NOVA PARTIDA'");
        }
        else if (menu == 1) {
            System.out.println("Preparant: 'CARREGAR PARTIDA'");
        }
        else if (menu == 2) {
            System.out.println("Obrint: 'CONFIGURACIÓ'");
        }
        else {
            System.out.println("Sortint del 'TRES EN RATLLA'");
            Carga.carga(2);
            return;
        }


        // MÉTODE QUE FA VEURE QUE ESTÀ CARREGANT EL JOC 4 segons
        Carga.carga(4);


        // SI S'ESCULL NOVA PARTIDA DEMANEM LA INFORMACIÓ DE QUI jugador1 "X" I QUI ÉS jugador2 "O"
        String jugador1 = JOptionPane.showInputDialog("Nom del jugador 1 (X)");
        System.out.println("Benvingut " + jugador1 + " ets el JUGADOR 1, jugues amb les 'X'.");


        // TEMPS D'ESPERA PERQUE ELS JUGADORS PUGUIN LLEGIR EL TERMINAL
        Carga.carga(3);


        String jugador2 = JOptionPane.showInputDialog("Nom del jugador 2 (O)");
        System.out.println("Benvingut " + jugador2 + " ets el JUGADOR 2, jugues amb les 'O'.");


        // SELECCIONA QUIN JUGADOR COMENÇARÀ EL PRIMER TORN EN FUNCIÓ D'UN NÚMERO GENERAT ALEATORIAMENT DEL 0 al 1
        Random aleatori = new Random();
        int num_aleatori = aleatori.nextInt(2);


        // DECLARO ELS JUGADORS I LES FITXES QUE UTILITZARÀ CADA UN
        char jugador11 = 'X';
        char jugador22 = 'O';


        // SI num_aleatori ÉS PARELL INICIARÀ PARTIDA jugador2
        if (num_aleatori % 2 == 0 ) {
            jugador11 = 'O';
            jugador22 = 'X';
        }
        else {
        }


        // ARRAY PER LES POSICIONS DEL JOC
        // ARRAY[i][j] = ARRAY[fila][columna]
        String[][] pt = {
                {"", "", ""},
                {"", "", ""},
                {"", "", ""}
        };



        // TAULELL DE JOC FENT ÚS DE ASCII CODE EXTENDED
        /*
        System.out.println("╔═══╦═══╦═══╗");
        System.out.println("║   ║   ║   ║");
        System.out.println("╠═══╬═══╬═══╣");
        System.out.println("║   ║   ║   ║");
        System.out.println("╠═══╬═══╬═══╣");
        System.out.println("║   ║   ║   ║");
        System.out.println("╚═══╩═══╩═══╝");
         */

        /* TAULELL AMB LES POSICIONS DEL ARRAY ESTABLERTES
        System.out.println("╔═══╦═══╦═══╗");
        System.out.println("║ pt[0][0] ║ pt[0][1] ║ pt[][2] ║");
        System.out.println("╠═══╬═══╬═══╣");
        System.out.println("║ pt[1][0] ║ pt[1][1] ║ pt[1][2] ║");
        System.out.println("╠═══╬═══╬═══╣");
        System.out.println("║ pt[2][0] ║ pt[2][1] ║ pt[2][2] ║");
        System.out.println("╚═══╩═══╩═══╝");
         */

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
}


// BASE DE NOVA CLASSE

// CRIDA A LA CLASSE