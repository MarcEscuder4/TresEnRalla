// import static tresenralla.Files.*;

public class Main {
    public static void main(String[] args) {


        TUI tui = new TUI();
        Joc joc = new Joc();
        Create_File files = new Create_File();

        files.crear();

        files.escriure();

        files.llegir();

        files.obtenir_info();

        // files.eliminar_arxiu();

/*  CARGA DE APP ESTIL RETRO
        for (int i = 0 ; i < 3 ; i++){
            tui.inici1_1();
            joc.carga(1);
            tui.inici1_2();
            joc.carga(1);
            tui.inici1_3();
            joc.carga(1);
        }


        tui.tvoid();
        joc.carga_mili(500);


        for (int i = 0 ; i < 3 ; i++) {
            tui.inici2_3();
            joc.carga_mili(750);
            tui.inici2_1();
            joc.carga_mili(750);
            tui.inici2_2();
            joc.carga_mili(750);

        }


        tui.tvoid();


        joc.carga_mili(750);


        menu_principal(joc,tui);

 */

        // CARGA DE APP "RÁPIDA"

        tui.inici1();

        joc.carga(2);

        tui.inici2();

        menu_principal(joc,tui);


    }

    // ELS MENUS FAN UN LOOP DE CRIDES INFINIT AMB EL WHILE (TRUE) PER FER UN RETRUN S'HA DE TRENCAR EL WHILE TRUE ASIGNANT UN BOOLEAN A ALGO I EN EL RETURN S'HA DE TRENCAR EL TRUE

    public static void menu_principal(Joc joc, TUI tui) {

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

            tui.infopartides();

            joc.carga(7);

            tui.nova_partida();

            switch (tui.opcio_np()) {
                case 1:
                    joc.carga(1);
                    tui.m_c1vs1();
                    joc.carga(1);
                    tui.m_c1vs1_1();
                    joc.carga(1);
                    joc.joc(); // TORNAR A MODIFICAR

                    break;
                case 2:
                    joc.carga(1);
                    tui.m_1vs1();
                    break;
                case 3:
                    joc.carga(1);
                    tui.m_1vsia();
                    break;
                case 4:
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
                    tui.tconfiguracio_cn();
                    joc.carga(1);
                    // joc.configuracio_canvi_nom();
                    joc.carga(1);
                    tui.back_configuracio_cn();
                    joc.carga(1);
                    break;
                case 2:
                    tui.tconfiguracio_cf();
                    joc.carga(1);
                    // config canvi fitxa
                    joc.carga(1);
                    tui.back_configuracio_cf();
                    joc.carga(1);
                    return;
                case 3:
                    tui.tconfiguracio_ct_i();
                    joc.carga(1);
                    tui.tconfiguracio_ct();
                    joc.carga(2);
                    tui.tconfiguracio_ct_1();
                    joc.carga(2);
                    tui.tconfiguracio_ct_2();
                    joc.carga(2);
                    tui.tconfiguracio_ct_3();
                    joc.carga(2);
                    tui.tconfiguracio_ct_4();
                    joc.carga(2);
                    tui.tconfiguracio_ct_5();
                    joc.carga(2);
                    tui.tconfiguracio_ct_o();
                    switch (tui.opcio_taulell()) {
                        case 1:
                            tui.tconfiguracio_oe1();
                            joc.carga(2);
                            tui.back_configuracio_ct();
                            menu_configuracio(tui, joc);
                            break;
                        case 2:
                            tui.tconfiguracio_oe2();
                            joc.carga(2);
                            tui.back_configuracio_ct();
                            menu_configuracio(tui, joc);
                            break;
                        case 3:
                            tui.tconfiguracio_oe3();
                            joc.carga(2);
                            tui.back_configuracio_ct();
                            menu_configuracio(tui, joc);
                            break;
                        case 4:
                            tui.tconfiguracio_oe4();
                            joc.carga(2);
                            tui.back_configuracio_ct();
                            menu_configuracio(tui, joc);
                            break;
                        case 5:
                            tui.tconfiguracio_oe5();
                            joc.carga(2);
                            tui.back_configuracio_ct();
                            menu_configuracio(tui, joc);
                            break;
                        default:
                            joc.carga(1);
                            tui.tconfiguracio_oerror();
                            joc.carga(2);
                            menu_configuracio(tui, joc);
                            break;
                    }
                    joc.carga(1);
                    return;
                case 4:
                    tui.tconfiguracio_mides_joc();
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
