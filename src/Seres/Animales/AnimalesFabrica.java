package Seres.Animales;

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
    UNKNOWN;

    static public AnimalesFabrica fromClass(Class<?> clazz){
        if(clazz == Boa.class) return BOA;
        if(clazz == Caballo.class) return CABALLO;
        if(clazz == Ciervo.class) return CIERVO;
        if(clazz == Conejo.class) return CONEJO;
        if(clazz == Lobo.class) return LOBO;
        if(clazz == Oruga.class) return ORUGA;
        if(clazz == Oso.class) return OSO;
        if(clazz == Pato.class) return PATO;
        if(clazz == Raton.class) return RATON;
        if(clazz == Zorro.class) return ZORRO;
        return UNKNOWN;
    }
}
