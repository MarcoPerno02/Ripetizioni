public class TipoTriangolo {
    public static void main(String[] args) {
        // Definizione dei tre lati
        double a = 5.0;
        double b = 5.0;
        double c = 8.0;

        // Verifica se i lati possono formare un triangolo (Disuguaglianza triangolare)
        boolean isTriangolo = (a + b > c) && (a + c > b) && (b + c > a);

        if (isTriangolo) {
            System.out.println("I lati formano un triangolo.");
            
            // Determinazione del tipo di triangolo
            if (a == b && b == c) {
                System.out.println("È un triangolo EQUILATERO.");
            } else if (a == b || b == c || a == c) {
                System.out.println("È un triangolo ISOSCELE.");
            } else {
                System.out.println("È un triangolo SCALENO.");
            }
        } else {
            System.out.println("I lati inseriti NON possono formare un triangolo.");
        }
    }
}