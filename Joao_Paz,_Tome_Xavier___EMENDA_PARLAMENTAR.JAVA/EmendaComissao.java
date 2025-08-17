import java.util.Map;

public class EmendaComissao extends Emenda {
    private String linkPaginaComissao;
    private Map<String, String> listaParlamentares;
    private String linkRelatorioAtividades;
    private String sugeridoPor;

    public EmendaComissao(String id, int ano, String autor, double valorTotal,
                          Map<String, String> docs, Map<String, String> convs,
                          String linkPagina, Map<String, String> parlamentares,
                          String relatorio, String sugeridoPor) {
        super(id, ano, autor, valorTotal, docs, convs);
        this.linkPaginaComissao = linkPagina;
        this.listaParlamentares = parlamentares;
        this.linkRelatorioAtividades = relatorio;
        this.sugeridoPor = sugeridoPor;
    }

    public String getLinkPaginaComissao() { return linkPaginaComissao; }
    public void setLinkPaginaComissao(String linkPaginaComissao) { this.linkPaginaComissao = linkPaginaComissao; }

    public Map<String, String> getListaParlamentares() { return listaParlamentares; }
    public void setListaParlamentares(Map<String, String> listaParlamentares) { this.listaParlamentares = listaParlamentares; }

    public String getLinkRelatorioAtividades() { return linkRelatorioAtividades; }
    public void setLinkRelatorioAtividades(String linkRelatorioAtividades) { this.linkRelatorioAtividades = linkRelatorioAtividades; }

    public String getSugeridoPor() { return sugeridoPor; }
    public void setSugeridoPor(String sugeridoPor) { this.sugeridoPor = sugeridoPor; }

    public String getDados() {
        return "Emenda de Comissão: Link página: " + linkPaginaComissao + ", Sugerido por: " + sugeridoPor;
    }
}
