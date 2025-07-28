import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n=0;
        int contPositivi = 0;
        int contNegativi = 0;
		Scanner scanner = new Scanner(System.in);

		do {
            System.out.println("Inserire un numero: ");

            while(scanner.hasNextInt() == false) {
                scanner.nextLine();
                System.out.println("Non hai inserito un numero valido.");
                System.out.println("Inserire il numero di numeri da analizzare: ");

            }

            n = scanner.nextInt();

            if (n != 0) {
                if(n > 0) {
                    contPositivi++;
                }
                else {
                    contNegativi++;
                }
            }
        } while (n != 0);

		System.out.println("Numeri positivi: " + contPositivi);
		System.out.println("Numeri negativi: " + contNegativi);

		scanner.close();
    }
}
