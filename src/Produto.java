public class Produto {
    
    private String tipo;
    private int quantidade;
    private double preco;

    public Produto(String tipo, int quantidade, double preco){

        this.tipo = tipo;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    

    
}
