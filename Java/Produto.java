public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    public Produto somar(Produto outroProduto) {
        return new Produto(this.nome + " + " + outroProduto.nome, this.preco + outroProduto.preco);
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: " + String.format("%.2f", preco);
    }
}

