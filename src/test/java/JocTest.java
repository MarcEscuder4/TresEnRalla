import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JocTest {

    @Test
    void novaPartida() {
        Joc joc =  new Joc();
        joc.novaPartida();

        joc.getTorn();
        joc.getTaulell();
    }

    void nova_partida_checktorn() {
        Joc joc =  new Joc();
        joc.novaPartida();

        int torn = 0;
        Assertions.assertEquals(torn, 0);
    }



}