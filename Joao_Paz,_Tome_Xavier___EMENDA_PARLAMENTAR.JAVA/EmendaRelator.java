import java.util.Map;

public class EmendaRelator extends Emenda {
    private String nomeRelator;
    private String autorEmenda;
    private String beneficiarioFinal;

    public EmendaRelator(String id, int ano, String autor, double valorTotal,
                         Map<String, String> docs, Map<String, String> convs,
                         String nomeRelator, String autorEmenda, String beneficiarioFinal) {
        super(id, ano, autor, valorTotal, docs, convs);
        this.nomeRelator = nomeRelator;
        this.autorEmenda = autorEmenda;
        this.beneficiarioFinal = beneficiarioFinal;
    }

    public String getNomeRelator() { return nomeRelator; }
    public void setNomeRelator(String nomeRelator) { this.nomeRelator = nomeRelator; }

    public String getAutorEmenda() { return autorEmenda; }
    public void setAutorEmenda(String autorEmenda) { this.autorEmenda = autorEmenda; }

    public String getBeneficiarioFinal() { return beneficiarioFinal; }
    public void setBeneficiarioFinal(String beneficiarioFinal) { this.beneficiarioFinal = beneficiarioFinal; }

    public String getDados() {
        return "Emenda do Relator: Relator: " + nomeRelator + ", Beneficiário: " + beneficiarioFinal;
    }
}
