import java.util.Scanner;
import javax.swing.JOptionPane;

public class TUI {

    Joc joc = new Joc();
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
            joc.carga(2);
        }

        return menu;
    }

    public void nova_partida() {

        joc.carga(2);

        System.out.println(" \n \n \n \n \n \n ");


        // joc.jugar();

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

}