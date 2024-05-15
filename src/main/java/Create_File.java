import java.io.*;
import java.util.Scanner;

public class Create_File {
    public static void main(String[] args) throws IOException {

        File txt_tres_en_ratlla = new File("~Desktop/git/TresEnRalla/Configuracio_TresEnRatlla.txt"); // RUTA ON GUARDAR EL FITXER DE TEXT
        FileWriter myWriter = new FileWriter("Configuracio_TresEnRatlla.txt");
        Scanner myReader = new Scanner(txt_tres_en_ratlla);


        if (txt_tres_en_ratlla.createNewFile()) {
            System.out.println("Arxiu creat: " + txt_tres_en_ratlla.getName());
        } else {
            System.out.println("El arxiu ja existeix.");
        }


        myWriter.write("Mides del taulell...");
        myWriter.close();

        System.out.println("Dades de configuració escrites correctament.");


        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }

        myReader.close();


        if (txt_tres_en_ratlla.delete()) {
            System.out.println("Arxiu: '" + txt_tres_en_ratlla.getName() + "' eliminat.");
        }
        else {
            System.out.println("El arxiu: '" + txt_tres_en_ratlla.getName() + "' no s'ha pogut eliminar.");
        }

    }

}
