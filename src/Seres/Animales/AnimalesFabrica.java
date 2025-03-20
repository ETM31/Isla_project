package Seres.Animales;

import Seres.Animales.Carnivorous.*;
import Seres.Animales.Herviborous.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Este ENUM nos sirve para poder asociar los valores de una clase al enum.
 * Además nos permite crear animales en la clase Fabrica.
 */

public enum AnimalesFabrica {
    BOA,
    CABALLO,
    CIERVO,
    CONEJO,
    LOBO,
    ORUGA,
    OSO,
    PATO,
    RATON,
    ZORRO,
    PLANTA;

    private static final Map<Class<?>, AnimalesFabrica> CLASS_ANIMALES_FABRICA_MAP = new HashMap<>();

    static {
        CLASS_ANIMALES_FABRICA_MAP.put(Boa.class, BOA);
        CLASS_ANIMALES_FABRICA_MAP.put(Caballo.class, CABALLO);
        CLASS_ANIMALES_FABRICA_MAP.put(Ciervo.class, CIERVO);
        CLASS_ANIMALES_FABRICA_MAP.put(Conejo.class, CONEJO);
        CLASS_ANIMALES_FABRICA_MAP.put(Lobo.class, LOBO);
        CLASS_ANIMALES_FABRICA_MAP.put(Oruga.class, ORUGA);
        CLASS_ANIMALES_FABRICA_MAP.put(Oso.class, OSO);
        CLASS_ANIMALES_FABRICA_MAP.put(Pato.class, PATO);
        CLASS_ANIMALES_FABRICA_MAP.put(Raton.class, RATON);
        CLASS_ANIMALES_FABRICA_MAP.put(Zorro.class, ZORRO);
        CLASS_ANIMALES_FABRICA_MAP.put(Plantas.class, PLANTA);
    }

    public static AnimalesFabrica fromClass(Class<?> clazz) {
        AnimalesFabrica result = CLASS_ANIMALES_FABRICA_MAP.get(clazz);
        if (result == null){
            throw new RuntimeException("No se detecto ninguna clase perteneciente al objeto pedido, nos papeo el sistema");
        }
        return result;
    }
}
