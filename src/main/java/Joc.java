import java.util.Scanner;
import java.util.Locale;
import java.util.Random;
import javax.swing.JOptionPane;


public class Joc {

    char[][] taulell;
    int torn;


    public int getTorn() {
        return torn;
    }


    public char[][] getTaulell() {
        return taulell;
    }

    // REINICI DE TAULELL I TORN
    public void novaPartida() {
        torn = 1;
    }

    public void carregar_partida() {

    }

    public void configuracio_cn() {
        System.out.println("Sóc la config");
    }

    public void configuracio_cf() {
        System.out.println("Sóc la config");
    }

    public void configuracio_ct() {
        System.out.println("Sóc la config");
    }

    public void configuracio_mj() {
        System.out.println("Sóc la config");
    }

    public void configuracio_back() {
        System.out.println("Sóc la config");
    }


    public void sortir() {
        return;
    }



    public void carga(int segons) {
        try {
            Thread.sleep(segons * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}