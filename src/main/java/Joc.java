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


    public void carga(int segons) {
        try {
            Thread.sleep(segons * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}