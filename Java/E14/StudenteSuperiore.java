package E14;

public class StudenteSuperiore extends Studente {
    private String indirizzo;

    public StudenteSuperiore(String nome, String cognome, int annoNascita, String indirizzo) {
        super(nome, cognome, annoNascita);
        this.indirizzo = indirizzo;
    }

    @Override
    public String tipo() {
        return "Superiore";
    }

    @Override
    public String scheda() {
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(tipo()).append("] ")
          .append(nome).append(" ").append(cognome)
          .append(" (").append(annoNascita).append(") - Indirizzo: ").append(indirizzo)
          .append("\nVoti: ");
        if (voti.isEmpty()) {
            sb.append("Nessun voto registrato");
        } else {
            for (Voto v : voti) {
                sb.append(v).append("; ");
            }
            sb.append("\nMedia: ").append(String.format("%.2f", mediaVoti()));
        }
        return sb.toString();
    }
}
