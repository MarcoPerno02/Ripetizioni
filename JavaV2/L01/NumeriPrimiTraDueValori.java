public class NumeriPrimiTraDueValori {
    public static void main(String[] args) {
        // Definizione dei due numeri interi (il primo minore del secondo)
        int min = 10;
        int max = 30;

        System.out.println("Numeri primi compresi tra " + min + " e " + max + ":");

        // Ciclo attraverso tutti i numeri nel range
        for (int i = min; i <= max; i++) {
            if (isPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Metodo di supporto per verificare se un numero è primo
    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}