import java.util.Map;

public class EmendaBancada extends Emenda {
    private String bancada;
    private Map<String, String> listaParlamentares;
    private String linkAta;
    private String sugeridoPor;

    public EmendaBancada(String id, int ano, String autor, double valorTotal,
                         Map<String, String> docs, Map<String, String> convs,
                         String bancada, Map<String, String> parlamentares,
                         String linkAta, String sugeridoPor) {
        super(id, ano, autor, valorTotal, docs, convs);
        this.bancada = bancada;
        this.listaParlamentares = parlamentares;
        this.linkAta = linkAta;
        this.sugeridoPor = sugeridoPor;
    }

    public String getBancada() { return bancada; }
    public void setBancada(String bancada) { this.bancada = bancada; }

    public Map<String, String> getListaParlamentares() { return listaParlamentares; }
    public void setListaParlamentares(Map<String, String> listaParlamentares) { this.listaParlamentares = listaParlamentares; }

    public String getLinkAta() { return linkAta; }
    public void setLinkAta(String linkAta) { this.linkAta = linkAta; }

    public String getSugeridoPor() { return sugeridoPor; }
    public void setSugeridoPor(String sugeridoPor) { this.sugeridoPor = sugeridoPor; }

    public String getDados() {
        return "Emenda de Bancada: " + bancada + ", Sugerido por: " + sugeridoPor;
    }
}
