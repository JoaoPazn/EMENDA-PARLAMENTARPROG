import java.util.Map;

public class EmendaIndividual extends Emenda {
    private String tipoTransferencia;
    private String planoTrabalho;

    public EmendaIndividual(String id, int ano, String autor, double valorTotal,
                            Map<String, String> docs, Map<String, String> convs,
                            String tipoTransferencia, String planoTrabalho) {
        super(id, ano, autor, valorTotal, docs, convs);
        this.tipoTransferencia = tipoTransferencia;
        this.planoTrabalho = planoTrabalho;
    }

    public String getTipoTransferencia() { return tipoTransferencia; }
    public void setTipoTransferencia(String tipoTransferencia) { this.tipoTransferencia = tipoTransferencia; }

    public String getPlanoTrabalho() { return planoTrabalho; }
    public void setPlanoTrabalho(String planoTrabalho) { this.planoTrabalho = planoTrabalho; }

    public String getDados() {
        return "Emenda Individual: " + getAutor() + ", Plano: " + planoTrabalho;
    }
}
