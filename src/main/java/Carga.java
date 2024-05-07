public class Carga {
    public static void carga (int segons) {
        try {
            Thread.sleep(segons * 1000);
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();;
        }
    }
}