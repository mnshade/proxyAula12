import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<Integer, Mago> magos = new HashMap<>();

    public static Mago getMago(int digitoUnico){
        return magos.get(digitoUnico);
    }
    public static void addMago(Mago mago){
        magos.put(mago.getDigitoUnico(), mago);
    }
}
