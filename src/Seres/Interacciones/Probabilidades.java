package Seres.Interacciones;

import Seres.Animal;
import Seres.Animales.Carnivorous.*;
import Seres.Animales.Herviborous.*;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

// Esta clase lo que hace es que da la probabilidad en la que un Animal puede ser comido, y de una vez la calcula,
// comiendose al animal o no.
public class Probabilidades {

    static int probabilidad;

    public static final Map<Class<?>, Map<Class<?>, Integer>> PROBABILIDADES_ALIMANTACION = new HashMap<>();

    static {
        PROBABILIDADES_ALIMANTACION.put(Boa.class, Map.of(
                Zorro.class, 15,
                Conejo.class, 20,
                Raton.class, 40,
                Pato.class, 10
        ));

        PROBABILIDADES_ALIMANTACION.put(Oso.class, Map.of(
                Ciervo.class, 80,
                Conejo.class, 80,
                Boa.class, 80,
                Caballo.class, 40,
                Raton.class, 90,
                Pato.class, 10
        ));

        PROBABILIDADES_ALIMANTACION.put(Lobo.class, Map.of(
                Caballo.class, 10,
                Ciervo.class, 15,
                Conejo.class, 60,
                Raton.class, 80,
                Pato.class, 40
        ));

        PROBABILIDADES_ALIMANTACION.put(Zorro.class, Map.of(
                Conejo.class, 70,
                Raton.class, 90,
                Pato.class, 60,
                Oruga.class, 40
        ));

        PROBABILIDADES_ALIMANTACION.put(Raton.class, Map.of(
                Oruga.class, 90,
                Plantas.class, 100
        ));

        PROBABILIDADES_ALIMANTACION.put(Pato.class, Map.of(
                Oruga.class, 90,
                Plantas.class, 100
        ));

        PROBABILIDADES_ALIMANTACION.put(Ciervo.class, Map.of(
                Plantas.class, 100
        ));


        PROBABILIDADES_ALIMANTACION.put(Caballo.class, Map.of(
                Plantas.class, 100
        ));

        PROBABILIDADES_ALIMANTACION.put(Conejo.class, Map.of(
                Plantas.class, 100
        ));

        PROBABILIDADES_ALIMANTACION.put(Oruga.class, Map.of(
                Plantas.class, 100
        ));
    }
}
