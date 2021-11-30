package major;

public class Major {
    public static int major(int[] llista) {
        int indice, max = Integer.MIN_VALUE;

        if (llista.length == 0) {
            throw new RuntimeException("Llista buida");
        }

        for (indice = 0; indice < llista.length; indice++) {
            if (llista[indice] > max) {
                max = llista[indice];
            }
        }
        return max;
    }
}