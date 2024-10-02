public class Sobremesa extends Produto{
    private String tamanho;

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + tamanho + ")";
    }
}
