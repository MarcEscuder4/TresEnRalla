public class Main {
    public static void main(String[] args) throws InterruptedException {

        TUI tui = new TUI();
        Joc joc = new Joc();

        tui.inici1();

        joc.carga(2);

        tui.inici2();

        // MENU
        int opcio = tui.menu();

        if (opcio == 0) {
            tui.nova_partida();
        } else if (opcio == 1) {
            tui.carregar_partida();
        } else if (opcio == 2) {
            tui.configuracio();
        } else {
        }

    }

}