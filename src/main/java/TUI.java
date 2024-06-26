import java.util.Scanner;

public class TUI {

    Scanner sc = new Scanner(System.in);


    public void inici1() {
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }
        System.out.print("\nIniciant: 'TRES EN RATLLA'...");
    }


    public void inici1_1() {
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }
        System.out.print("\nIniciant: 'TRES EN RATLLA'.");
    }


    public void inici1_2() {
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }

        System.out.print("\nIniciant: 'TRES EN RATLLA'..");
    }


    public void inici1_3() {
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }

        System.out.print("\nIniciant: 'TRES EN RATLLA'...");
    }


    public void inici2() {
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }

        System.out.print("Carregant Menú...");
    }


    public void inici2_3() {
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }

        System.out.print("Carregant Menú...");
    }

    public void inici2_1() {
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }

        System.out.print("Carregant Menú.");
    }

    public void inici2_2() {
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }

        System.out.print("Carregant Menú..");
    }


    public void tvoid() {
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }
    }

    // --- MENÚ PRINCIPAL AMB RETORN D'OPCIÓ --- //


    public void menu_principal() {
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }

        System.out.println("\nMENU PRINCIPAL:\n");
        System.out.println("1. NOVA PARTIDA");
        System.out.println("2. CARREGAR PARTIDA");
        System.out.println("3. CONFIGURACIÓ");
        System.out.println("4. SORTIR\n");
        System.out.print("Selecciona una opció: ");
    }


    public int opcio_mp() {

        return sc.nextInt();

    }

    // --- MENÚ NOVA PARTIDA AMB RETORN D'OPCIÓ --- //


    public void t_nova_partida() {

        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }

        System.out.print("Iniciant: NOVA PARTIDA...");
    }


    public void nova_partida() {

        // Carga.carga(1); temps d'espera de un sego
        // joc.restartvalues(); HA DE TORNAR AL MAIN O INICIAR QUAN S'OBRI JOC

        System.out.println("\n\n\n\n\n\n\n\n\n\n\nNOVA PARTIDA:\n");
        System.out.println("1. PARTIDA 1 VS 1 CLÀSSICA");
        System.out.println("2. PARTIDA 1 VS 1 PERSONALITZABLE");
        System.out.println("3. PARTIDA 1 VS IA");
        System.out.println("4. ENRERE");
        System.out.println("5. SORTIR\n");
        System.out.print("Selecciona una opció: ");
    }


    public int opcio_np() {

        return sc.nextInt();

    }


    public void infopartides() {
        // CREAR UN MARC PER LA INFO
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }

        System.out.println("          -  INFORMACIÓ DE LES PARTIDES  -      \n\n" +
                "           -  PARTIDA 1 VS 1 CLÀSSICA  -      " +
                "\nEn aquest mode de joc és juga amb un taulell,\n" +
                "de diseny a escollir a la secció: CONFIGURACIÓ, 3x3.\n" +
                "No es poden canviar els noms, ni les fitxes.\n");
        System.out.println("       - PARTIDA 1 VS 1 PERSONALITZABLE  -\n" +
                "Aquest mode permet canviar els noms, dissenys de\n" +
                "les fitxes, mides del taulell (de 3 a 10) i disseny\n" +
                "del taulell (només s'aplica si és 3x3).\n" +
                "Próximament per totes les mides del taulell\n" +
                "s'aplicaràn tots els dissenys disponibles.\n");
        System.out.println("            -  PARTIDA 1 VS IA  -\n" +
                "En aquest mode és juga contra la IA 'minimax'\n" +
                "en un taulell 3x3. Disseny del taulell personalitzable.\n" +
                "Podràs guanyar a una IA?\n");

    }


    public static void m_c1vs1() {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\nIniciant: PARTIDA CLÀSSICA 1 VS 1\n");
        // Carga.carga(1);
        // joc.nova_partida1vs1();

    }


    public static void m_c1vs1_1() {
        System.out.println("\nJUGADOR 1 (X) VS JUGADOR 2 (O)\n");
        // Carga.carga(1);
        // joc.nova_partida1vs1();

    }


    public static void m_1vs1() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\nIniciant: PARTIDA PERSONALITZABLE 1 VS 1");
        // Carga.carga(1);
        // joc.nova_partida1vs1();

    }


    public static void m_1vsia() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\nIniciant: PARTIDA 1 VS IA");
        // Carga.carga(1);
        // joc.partida1vsia();
    }


    // ------- Carregar partida aqui. S'HAN DE LLISTAR LES PARTIDES QUE S'HAN GUARDAT EN EL DOCUMENT CREAT AMB FILES

    public void t_carregar_partida() {

        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }

        System.out.print("Carregant: PARTIDES GUARDADES...");
    }


    public void opcions_carregar_partida() {

        // Carga.carga(1); temps d'espera de un sego
        // joc.restartvalues(); HA DE TORNAR AL MAIN O INICIAR QUAN S'OBRI JOC

        System.out.println("\n\n\n\n\n\n\n\n\n\n\nCARREGAR PARTIDA:\n");
        System.out.println("1. PARTIDES GUARDADES");
        System.out.println("2. ENRERE");
        System.out.println("3. SORTIR\n");
        System.out.print("Selecciona una opció: ");
    }


    public void carregar_partides_guardades() {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\nCarregant: PARTIDES GUARDADES");

    }


    // --- MENÚ CONFIGURACIÓ AMB RETORN D'OPCIÓ --- //


    public void t_configuracio() {

        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }

        System.out.print("Carregant: CONFIGURACIÓ...");
    }


    public void configuracio() {

        System.out.println("\n\n\n\n\n\n\n\n\n\n\nCONFIGURACIÓ:\n");
        System.out.println("1. CANVIAR NOM");
        System.out.println("2. CANVIAR FITXA");
        System.out.println("3. CANVIAR TAULELL");
        System.out.println("4. CANVIAR MIDES DE JOC");
        System.out.println("5. ENRERE");
        System.out.println("6. SORTIR\n");
        System.out.print("Selecciona una opció: ");
    }

    public int opcio_configuracio() {

        return sc.nextInt();

    }


    public void m_configuracio() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\nObrint: CONFIGURACIÓ...");
    }


    public void tconfiguracio_cn() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\nAccedint a: CANVI DE NOM\n");
    }


    public void tconfiguracio_cf() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\nAccedint a: CANVI DE FITXA\n");
    }


    public void tconfiguracio_mides_joc() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\nAccedint a: MIDES DE JOC\n");
    }


    public void tconfiguracio_ct_i() {
        for (int i = 0; i < 50; ++i) {

            System.out.println();

        }

        System.out.print("Accedint a: CANVI DE TAULELL");
    }


    public void tconfiguracio_ct() {
        for (int i = 0; i < 50; ++i) {

            System.out.println();

        }

        System.out.print("Escull amb quin taulell vols jugar:");
    }


    public void tconfiguracio_oe1() {
        System.out.println("\nHas seleccionat el taulell 'None':");
        System.out.println();
        System.out.println("    A   B   C  ");
        System.out.println("               ");
        System.out.println("1              ");
        System.out.println("               ");
        System.out.println("2              ");
        System.out.println("               ");
        System.out.println("3              ");
        System.out.println("               ");
    }


    public void tconfiguracio_ct_1() {
        for (int i = 0; i < 50; ++i) {

            System.out.println();

        }

        System.out.println("1. None\n");
        System.out.println("    A   B   C  ");
        System.out.println("               ");
        System.out.println("1              ");
        System.out.println("               ");
        System.out.println("2              ");
        System.out.println("               ");
        System.out.println("3              ");
        System.out.println("               ");
        System.out.println();
    }


    public void tconfiguracio_oe2() {
        System.out.println("\nHas seleccionat el taulell 'Simple':");
        System.out.println();
        System.out.println("    A   B   C  ");
        System.out.println("               ");
        System.out.println("1     |   |    ");
        System.out.println("    ─   ─   ─  ");
        System.out.println("2     |   |    ");
        System.out.println("    ─   ─   ─  ");
        System.out.println("3     |   |    ");
        System.out.println("               ");
    }


    public void tconfiguracio_ct_2() {
        System.out.println("\n2. Simple\n");
        System.out.println("    A   B   C  ");
        System.out.println("               ");
        System.out.println("1     |   |    ");
        System.out.println("    ─   ─   ─  ");
        System.out.println("2     |   |    ");
        System.out.println("    ─   ─   ─  ");
        System.out.println("3     |   |    ");
        System.out.println("               ");
        System.out.println();
    }


    public void tconfiguracio_oe3() {
        System.out.println("\nHas seleccionat el taulell 'Basic':");
        System.out.println();
        System.out.println("    A   B   C  ");
        System.out.println("    ─   ─   ─  ");
        System.out.println("1 |   |   |   |");
        System.out.println("    ─   ─   ─  ");
        System.out.println("2 |   |   |   |");
        System.out.println("    ─   ─   ─  ");
        System.out.println("3 |   |   |   |");
        System.out.println("    ─   ─   ─  ");
    }


    public void tconfiguracio_ct_3() {
        System.out.println("\n3. Basic\n");
        System.out.println("    A   B   C  ");
        System.out.println("    ─   ─   ─  ");
        System.out.println("1 |   |   |   |");
        System.out.println("    ─   ─   ─  ");
        System.out.println("2 |   |   |   |");
        System.out.println("    ─   ─   ─  ");
        System.out.println("3 |   |   |   |");
        System.out.println("    ─   ─   ─  ");
        System.out.println();
    }


    public void tconfiguracio_oe4() {
        System.out.println("\nHas seleccionat el taulell 'Complete':");
        System.out.println();
        System.out.println("    A   B   C  ");
        System.out.println("  ┌───┬───┬───┐");
        System.out.println("1 │   │   │   │");
        System.out.println("  ├───┼───┼───┤");
        System.out.println("2 │   │   │   │");
        System.out.println("  ├───┼───┼───┤");
        System.out.println("3 │   │   │   │");
        System.out.println("  └───┴───┴───┘");
    }


    public void tconfiguracio_ct_4() {
        System.out.println("\n4. Complete\n");
        System.out.println("    A   B   C  ");
        System.out.println("  ┌───┬───┬───┐");
        System.out.println("1 │   │   │   │");
        System.out.println("  ├───┼───┼───┤");
        System.out.println("2 │   │   │   │");
        System.out.println("  ├───┼───┼───┤");
        System.out.println("3 │   │   │   │");
        System.out.println("  └───┴───┴───┘");
        System.out.println();
    }


    public void tconfiguracio_oe5() {
        System.out.println("\nHas seleccionat el taulell 'Complex':");
        System.out.println();
        System.out.println("    A   B   C  " );
        System.out.println("  ╔═══╦═══╦═══╗");
        System.out.println("1 ║   ║   ║   ║");
        System.out.println("  ╠═══╬═══╬═══╣");
        System.out.println("2 ║   ║   ║   ║");
        System.out.println("  ╠═══╬═══╬═══╣");
        System.out.println("3 ║   ║   ║   ║");
        System.out.println("  ╚═══╩═══╩═══╝");
    }


    public void tconfiguracio_ct_5() {
        System.out.println("\n5. Complex\n");
        System.out.println("    A   B   C  " );
        System.out.println("  ╔═══╦═══╦═══╗");
        System.out.println("1 ║   ║   ║   ║");
        System.out.println("  ╠═══╬═══╬═══╣");
        System.out.println("2 ║   ║   ║   ║");
        System.out.println("  ╠═══╬═══╬═══╣");
        System.out.println("3 ║   ║   ║   ║");
        System.out.println("  ╚═══╩═══╩═══╝");
        System.out.println();

    }


    public void tconfiguracio_oerror() {
        System.out.print("\nNo existeix cap taulell amb la opció seleccionada.\n\n\nTornant a la CONFIGURACIÓ...");

    }


    public void tconfiguracio_ct_o() {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\nAmb quin taulell vols jugar? ");
    }


    public int opcio_taulell() {
        int n_taulell = sc.nextInt();
        return n_taulell;
    }


    public static void back_configuracio_ct() {

        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\nTaulell de la partida canviat amb èxit!");

    }


    public void tconfiguracio_mj() {
        System.out.println("Sóc la config");
    }


    // ----------------


    public static void back() {

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\nTornant al: MENÚ PRINCIPAL...\n");

    }


    public static void back_configuracio_cn() {

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\nNoms de Jugadors canviats amb èxit!\n");

    }


    public static void back_configuracio_cf() {

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\nFitxes de Jugadors canviats amb èxit!\n");

    }


    public static void back_configuracio_mj() {

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\nMida del taulell canviada amb èxit!\n");

    }


    public static void sortir1() {

        for (int i = 0; i < 50; ++i) {

            System.out.println();

        }

        System.out.println("TANCANT 'TRES EN RATLLA'...");

    }


}