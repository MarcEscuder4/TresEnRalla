public class Main {
    public static void main(String[] args) throws InterruptedException {

        // DE MAIN A JOC
        // DE JOC A MAIN
        // DE MAIN A TUI
        // DE TUI A MAIN


        // PRINT SCANNER A LA TUI NOMES


        // NOVA PARTIDA A MAIN I JOC

        // GUARDAR PARTIDA HO GESTIONA JOC

        TUI tui = new TUI();
        Joc joc = new Joc();

        tui.inici1();

        joc.carga(2);

        tui.inici2();

        // MENU
        int opciom = tui.menu();

        if (opciom == 0) {
            tui.nova_partida();
        }
        else if (opciom == 1) {
            tui.carregar_partida();
        }
        else if (opciom == 2) {
            tui.configuracioTUI();
            tui.confi();
        }
        else {
            tui.sortir();
        }

        int configure = tui.confi();

        if (configure == 0) {
            // joc.
        }
        else if (configure == 1) {
            // joc.
        }
        else if (configure == 2) {
            // joc.
        }
        else if (configure == 3) {
            // joc.
        }
        else if (configure == 4) {
            // joc.
        }
        else {
            tui.sortir();
        }




    }

}