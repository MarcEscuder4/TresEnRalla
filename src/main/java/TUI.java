import java.util.Scanner;

public class TUI {

    Scanner sc = new Scanner(System.in);


    public void inici1() {
        System.out.println("\nIniciant: 'TRES EN RATLLA'\n ");
    }


    public void inici2() {
        System.out.println("Carregant Menú...\n");
    }


    // --- MENÚ PRINCIPAL AMB RETORN D'OPCIÓ --- //


    public void menu_principal() {
        System.out.println("\nMENU PRINCIPAL:\n");
        System.out.println("1. NOVA PARTIDA");
        System.out.println("2. CARREGAR PARTIDA");
        System.out.println("3. CONFIGURACIÓ");
        System.out.println("4. SORTIR\n");
        System.out.print("Selecciona una opción: ");
    }


    public int opcio_mp() {

        return sc.nextInt();

    }

    // --- MENÚ NOVA PARTIDA AMB RETORN D'OPCIÓ --- //


    public void nova_partida() {
        System.out.println("Iniciant: NOVA PARTIDA...");

        // Carga.carga(1); temps d'espera de un sego
        // joc.restartvalues(); HA DE TORNAR AL MAIN O INICIAR QUAN S'OBRI JOC

        System.out.println("\n\n\n\n\n\n\n\n\n\n\nNOVA PARTIDA:\n");
        System.out.println("1. PARTIDA 1 VS 1");
        System.out.println("2. PARTIDA 1 VS IA");
        System.out.println("3. ENRERE");
        System.out.println("4. SORTIR\n");
        System.out.print("Selecciona una opción: ");
    }


    public int opcio_np() {

        return sc.nextInt();

    }

    // --- MENÚ CONFIGURACIÓ AMB RETORN D'OPCIÓ --- //


    public void configuracio() {
        System.out.println("Carregant: CONFIGURACIÓ...");

        // Carga.carga(1); temps d'espera d'un segon

        System.out.println("\n\n\n\n\n\n\n\n\n\n\nCONFIGURACIÓ:\n");
        System.out.println("1. CANVIAR NOM");
        System.out.println("2. CANVIAR FITXA");
        System.out.println("3. CANVIAR TAULELL");
        System.out.println("4. CANVIAR MIDES DE JOC");
        System.out.println("5. ENRERE");
        System.out.println("6. SORTIR\n");
        System.out.print("Selecciona una opción: ");
    }

    public int opcio_configuracio() {

        return sc.nextInt();

    }

    // ----------------


    public static void m_1vs1() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\nIniciant: PARTIDA 1 VS 1");
        // Carga.carga(1);
        // joc.nova_partida1vs1();

    }


    public static void m_1vsia() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\nIniciant: PARTIDA 1 VS IA");
        // Carga.carga(1);
        // joc.partida1vsia();
    }


    public void m_carregar_partida() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\nCarregant: PARTIDES GUARDADES...");
        Carga.carga(2);

    }


    public void m_configuracio() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\nObrint: CONFIGURACIÓ...");
        Carga.carga(1);
    }


    public void m_sortir() {
        System.out.println("Sortint del 'TRES EN RATLLA'...");
    }


    public void tconfiguracio_cn() {
        System.out.println("-");
    }


    public void tconfiguracio_cf() {
        System.out.println("Sóc la config");
    }


    public void tconfiguracio_ct() {
        System.out.println("Sóc la config");
    }


    public void tconfiguracio_mj() {
        System.out.println("Sóc la config");
    }


    public void nova_partida1() {
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


    public static void back() {

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\nTornant al: MENÚ PRINCIPAL...\n");

    }


    public static void back_configuracio_cn() {

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\nNoms de Jugadors canviats amb èxit!\n");

    }


    public static void back_configuracio_cf() {

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\nFitxes de Jugadors canviats amb èxit!\n");

    }


    public static void back_configuracio_ct() {

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\nTaulell de la partida canviat amb èxit!\n");

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


    public static void sortir2() {

        System.exit(0);

    }


}