import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Zadanie1 {

    public static void main(String[] args) {
        int[] tablica = {1, 3, 5, 2, 3, 2, 3, 1, 6};
        licz(tablica);

    }

    public static void licz(int[] elementy) {

        Map<Integer, Integer> zliczone = new HashMap<>();

        for (int i = 0; i < elementy.length; i++) {

            if (zliczone.containsKey(elementy[i])) {
                Integer value = zliczone.get(elementy[i]);
                zliczone.put(elementy[i], value + 1);
            } else {
                zliczone.put(elementy[i], 1);
            }

        }
        Set<Map.Entry<Integer, Integer>> entrySet = zliczone.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            System.out.println("Liczba: " + entry.getKey() + " Ilość: " + entry.getValue());
        }


    }
}
