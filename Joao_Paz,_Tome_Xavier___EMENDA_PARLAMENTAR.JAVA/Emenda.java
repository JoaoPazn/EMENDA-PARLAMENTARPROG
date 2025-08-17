import java.util.Map;

public class Emenda {
    private String id;
    private int ano;
    private String autor;
    private double valorTotal;
    private Map<String, String> listaDocumentos;
    private Map<String, String> listaConvenios;

    public Emenda(String id, int ano, String autor, double valorTotal,
                  Map<String, String> listaDocumentos, Map<String, String> listaConvenios) {
        this.id = id;
        this.ano = ano;
        this.autor = autor;
        this.valorTotal = valorTotal;
        this.listaDocumentos = listaDocumentos;
        this.listaConvenios = listaConvenios;
    }

    // Get
    public String getId() { return id; }
    public int getAno() { return ano; }
    public String getAutor() { return autor; }
    public double getValorTotal() { return valorTotal; }
    public Map<String, String> getListaDocumentos() { return listaDocumentos; }
    public Map<String, String> getListaConvenios() { return listaConvenios; }

    // Set
    public void setId(String id) { this.id = id; }
    public void setAno(int ano) { this.ano = ano; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setValorTotal(double valorTotal) { this.valorTotal = valorTotal; }
    public void setListaDocumentos(Map<String, String> listaDocumentos) { this.listaDocumentos = listaDocumentos; }
    public void setListaConvenios(Map<String, String> listaConvenios) { this.listaConvenios = listaConvenios; }

    public double getValorPorFase(String fase) {
        if (listaDocumentos != null && listaDocumentos.containsKey(fase)) {
            String valorString = listaDocumentos.get(fase);
            try {
                return Double.parseDouble(valorString);
            } catch (NumberFormatException e) {
                return 0.0;
            }
        }
        return 0.0;
    }
}
