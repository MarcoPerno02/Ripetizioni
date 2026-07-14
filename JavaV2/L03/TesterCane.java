package L03;

public class TesterCane {
    public static void main(String[] args) {
        // Istanzio il primo cane passando nome, razza ed età
        Cane primoCane = new Cane("Fido", "Golden Retriever", 3);
        
        // Istanzio il secondo cane
        Cane secondoCane = new Cane("Rex", "Pastore Tedesco", 5);

        // Faccio abbaiare entrambi i cani richiamando il loro metodo
        primoCane.abbaia();
        secondoCane.abbaia();
    }
}