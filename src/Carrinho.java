import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Produto> carrinhoCompras = new ArrayList<>();
    private Produto produto;
    private int totalQuantidade = 0;
    private double totalPreco = 0;

    public Carrinho(Produto produto){
        adicionarCompra(produto);
    }

 public void adicionarCompra(Produto produto){
    this.carrinhoCompras.add(produto);

 }

 public void visualizarCarrinho(){

    for(Produto item : carrinhoCompras) {
        System.out.println(item.getTipo() + "   " + item.getQuantidade() + "   " + item.getPreco());

    }
 }
 
 public double obterQuantidadeTotal (){
    for(Produto item : carrinhoCompras){
        totalQuantidade += item.getQuantidade();
    }

    System.out.println(totalQuantidade);
    return totalQuantidade;

 }

 public double obterPrecoTotal(){
    for(Produto item : carrinhoCompras){
        totalPreco += item.getPreco() * item.getQuantidade();
    }

    System.out.println(totalPreco);
    return totalPreco;

 }

public void setDesconto(double desconto) {
    totalPreco = totalPreco * desconto;
    System.out.println(totalPreco);
}

public void checarDesconto(){
        
    if(this.totalQuantidade > 15){
        this.setDesconto(0.9);
        System.out.println("Desconto de 10% ");

    } else if (this.totalQuantidade > 10 && this.totalQuantidade <= 15) {
        this.setDesconto(0.92);
        System.out.println("Desconto de 8% ");

    } else if (this.totalQuantidade > 5 && this.totalQuantidade <= 10) {
        this.setDesconto(0.95);
        System.out.println("Desconto de 5% ");

    } else {
        this.setDesconto(1);
        System.out.println("Sem desconto ");
    }

}

}
