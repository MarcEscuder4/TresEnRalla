public class Main {
    public static void main(String[] args) {

        TUI tui = new TUI();
        Joc joc = new Joc();

        tui.inici1();

        joc.carga(2);

        tui.inici2();

        mostrarMenuPrincipal();

        return;

    }


    public static void mostrarMenuPrincipal() {

        TUI tui = new TUI();
        Joc joc = new Joc();

        while (true) {

            tui.menu_principal();

            switch (tui.opcio_mp()) {
                case 1:
                    joc.carga(2);
                    menu_nova_partida();
                    break;
                case 2:
                    joc.carga(2);
                    // menu_carregar_partida();
                    break;
                case 3:
                    joc.carga(1);
                    menu_configuracio();
                    break;
                default:
                    tui.sortir1();
                    joc.carga(2);
                    tui.sortir2();

            }

        }

    }


    public static void menu_nova_partida() {

        TUI tui = new TUI();
        Joc joc = new Joc();

        while (true) {

            tui.nova_partida();

            switch (tui.opcio_np()) {
                case 1:
                    joc.carga(1);
                    tui.m_1vs1();
                    break;
                case 2:
                    joc.carga(1);
                    tui.m_1vsia();
                    break;
                case 3:
                    tui.back();
                    joc.carga(1);
                    return;
                default:
                    tui.sortir1();
                    joc.carga(2);
                    tui.sortir2();

            }

        }

    }


    public static void menu_configuracio() {

        TUI tui = new TUI();
        Joc joc = new Joc();

        while (true) {

            tui.configuracio();

            switch (tui.opcio_configuracio()) {
                case 1:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\nAccedint a: CANVI DE NOM\n");
                    joc.carga(1);
                    joc.configuracio_cn();
                    joc.carga(1);
                    tui.back_configuracio_cn();
                    joc.carga(1);
                    menu_configuracio();
                    break;
                case 2:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\nAccedint a: CANVI DE FITXA");
                    joc.carga(1);
                    // config canvi fitxa
                    joc.carga(1);
                    tui.back_configuracio_cf();
                    joc.carga(1);
                    menu_configuracio();
                    return;
                case 3:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\nAccedint a: CANVI DE TAULELL");
                    joc.carga(1);
                    //
                    joc.carga(1);
                    tui.back_configuracio_ct();
                    joc.carga(1);
                    menu_configuracio();
                    break;
                case 4:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\nAccedint a: MIDES DE JOC");
                    joc.carga(1);
                    //
                    joc.carga(1);
                    tui.back_configuracio_mj();
                    joc.carga(1);
                    menu_configuracio();
                    break;
                case 5:
                    tui.back();
                    joc.carga(1);
                    return;
                default:
                    tui.sortir1();
                    joc.carga(2);
                    tui.sortir2();

            }

        }

    }

}
