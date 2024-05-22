import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Create_File {
    public void crear() {
        try {
            File myObj = new File("dadestr.txt");
            if (myObj.createNewFile()) {
                System.out.println("Arxiu creat: " + myObj.getName());
            }
            else {
                System.out.println("El arxiu ja existeix.");
            }
        } catch (IOException e) {
            System.out.println("Ha succeït un error.");
            e.printStackTrace();
        }

    }


    public void escriure () {
        try {
            FileWriter myWriter = new FileWriter ("dadestr.txt");
            myWriter.write("Dades intriduides al document!");
            myWriter.close();
            System.out.println("S'ha escrit en el fitxer amb èxit");
        } catch (IOException e) {
            System.out.println("Ha succeït un error.");
            e.printStackTrace();
        }

    }

    public void llegir() {
        try {
            File myObj = new File("dadestr.txt");
            Scanner sc = new Scanner(myObj);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ha succeït un error.");
            e.printStackTrace();
        }

    }

    public void obtenir_info() {
        File myObj = new File("dadestr.txt");
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Ruta absoluta: " + myObj.getAbsolutePath());
            System.out.println("Disponible per escriure: " + myObj.canWrite());
            System.out.println("Disponible per llegir: " + myObj.canRead());
            System.out.println("Tamany en bits: " + myObj.length());
        } else {
            System.out.println("El arxiu no existeix.");
        }
    }

    public void eliminar_arxiu() {
        File myObj = new File("dadestr.txt");
        if (myObj.delete()) {
            System.out.println("S'ha eliminat el arxiu: " + myObj.getName());
        } else {
            System.out.println("Error al eliminar el fitxer.");
        }
    }

}