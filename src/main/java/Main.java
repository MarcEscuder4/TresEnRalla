public class Main {
    public static void main(String[] args) {

        TUI tui = new TUI();
        Joc joc = new Joc();


        char[] fitxa = {'O', 'X'};

        tui.inici1();

        joc.carga(2);

        tui.inici2();

        mostrarMenuPrincipal(joc,tui);

    }

    // ELS MENUS FAN UN LOOP DE CRIDES INFINIT AMB EL WHILE (TRUE) PER FER UN RETRUN S'HA DE TRENCAR EL WHILE TRUE ASIGNANT UN BOOLEAN A ALGO I EN EL RETURN S'HA DE TRENCAR EL TRUE

    public static void mostrarMenuPrincipal(Joc joc, TUI tui) {

        while (true) {

            tui.menu_principal();

            switch (tui.opcio_mp()) {
                case 1:
                    joc.carga(1);
                    tui.t_nova_partida();
                    joc.carga(2);
                    menu_nova_partida(tui, joc);
                    break;
                case 2:
                    joc.carga(1);
                    tui.t_carregar_partida();
                    joc.carga(2);
                    menu_carregar_partida(tui, joc);
                    break;
                case 3:
                    joc.carga(1);
                    tui.t_configuracio();
                    joc.carga(1);
                    menu_configuracio(tui, joc);
                    break;
                default:
                    tui.sortir1();
                    joc.carga(2);
                    joc.sortir2();

            }

        }

    }


    public static void menu_nova_partida(TUI tui, Joc joc) {
        
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
                    joc.sortir2();

            }

        }

    }


    public static void menu_carregar_partida(TUI tui, Joc joc) {

        while (true) {

            tui.opcions_carregar_partida();

            switch (tui.opcio_np()) {
                case 1:
                    joc.carga(1);
                    tui.carregar_partides_guardades();
                    // LLISTA DE LES PARTIDES GUARDADES
                    joc.carga(1);
                    // CARGAR LA PARTIDA GUARDADA
                    return;
                case 2:
                    tui.back();
                    joc.carga(1);
                    return;
                default:
                    tui.sortir1();
                    joc.carga(2);
                    joc.sortir2();

            }

        }

    }


    public static void menu_configuracio(TUI tui, Joc joc) {
        
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
                    break;
                case 2:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\nAccedint a: CANVI DE FITXA\n");
                    joc.carga(1);
                    // config canvi fitxa
                    joc.carga(1);
                    tui.back_configuracio_cf();
                    joc.carga(1);
                    return;
                case 3:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\nAccedint a: CANVI DE TAULELL\n");
                    joc.carga(1);
                    //
                    joc.carga(1);
                    tui.back_configuracio_ct();
                    joc.carga(1);
                    return;
                case 4:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\nAccedint a: MIDES DE JOC\n");
                    joc.carga(1);
                    //
                    joc.carga(1);
                    tui.back_configuracio_mj();
                    joc.carga(1);
                    return;
                case 5:
                    tui.back();
                    joc.carga(1);
                    return;
                default:
                    tui.sortir1();
                    joc.carga(2);
                    joc.sortir2();

            }

        }

    }

}
