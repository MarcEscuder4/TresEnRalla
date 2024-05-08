import java.util.Scanner;
import javax.swing.JOptionPane;

public class TUI {


    Main main = new Main();

    Scanner sc = new Scanner(System.in);


    public void inici1() {
        // INTRODUCCIÓ AL JOC
        System.out.println("\nIniciant: 'TRES EN RATLLA'\n ");
    }


    public void inici2() {
        // MOSTRAR TEXT DE CARREGANT MENÚ
        System.out.println("Carregant Menú...\n");
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
            Carga.carga(2);
        }

        return menu;
    }

    public void nova_partida() {
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }

        Carga.carga(2);

        System.out.println("TRES EN RATLLA: NOVA PARTIDA");

        System.out.println(" \n \n \n \n \n \n ");


        // joc.jugar();

    }

    public void carregar_partida() {
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }

        Carga.carga(2);

        System.out.println("TRES EN RATLLA: CONFIGURACIÓ");

    }

    public void configuracioTUI() {
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }

        Carga.carga(2);

        System.out.println("TRES EN RATLLA: CONFIGURACIÓ\n\n\n\n\n\n\n\n");

        Carga.carga(1);

    }

    public int confi() {
        String[] o_confi = {"CANVIAR NOM", "CANVIAR FITXA", "CANVIAR TAULELL", "CANVIAR MIDES DE JOC", "ENRERE", "SORTIR"};
        var confi = JOptionPane.showOptionDialog(null, "                                                                                                         CONFIGURACIÓ",
                "TRES EN RATLLA", 0, 3, null, o_confi, o_confi[5]);
        if (confi == 0) {
            System.out.println("Carregant: 'CANVI DE NOM'...");
        } else if (confi == 1) {
            System.out.println("Carregant: 'CANVI DE FITXA'...");
        } else if (confi == 2) {
            System.out.println("Carregant: 'CANVIAR TAULELL'...");
        } else if (confi == 3) {
            System.out.println("Carregant: 'CANVIAR MIDES DE JOC'...");
        } else if (confi == 4) {
            System.out.println("TORNANT AL MENÚ...");
        } else {
            System.out.println("TANCANT 'TRES EN RATLLA'...");
            Carga.carga(2);
        }

        return confi;
    }



    public void sortir() {
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }
        System.out.println("TANCANT 'TRES EN RATLLA'...");
    }



}