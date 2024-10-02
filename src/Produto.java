public class Produto {
    private String descricao;
    private double preco;

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao + " - R$" + preco;
    }
}
