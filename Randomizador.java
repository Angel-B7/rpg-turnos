package util;

import java.util.Random;

public class Randomizador {
    private static final Random random = new Random();

    public static boolean sorteioTurno() {
        return random.nextBoolean();
    }
}
