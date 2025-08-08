package E14;

public class StudenteUniversitario extends Studente {
    private String corsoDiLaurea;

    public StudenteUniversitario(String nome, String cognome, int annoNascita, String corsoDiLaurea) {
        super(nome, cognome, annoNascita);
        this.corsoDiLaurea = corsoDiLaurea;
    }

    @Override
    public String tipo() {
        return "Universitario";
    }

    @Override
    public String scheda() {
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(tipo()).append("] ")
          .append(nome).append(" ").append(cognome)
          .append(" (").append(annoNascita).append(") - Corso di Laurea: ").append(corsoDiLaurea)
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
