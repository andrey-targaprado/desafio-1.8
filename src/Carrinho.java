import java.util.ArrayList;

public class Carrinho implements Checagem {

    private ArrayList<Produto> carrinhoCompras = new ArrayList<>();
    private Produto produto;
    private int totalQuantidade = 0;
    private double totalPreco = 0;
    private Descontos desconto;

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

public void setDesconto(Descontos desconto) {
    this.desconto = desconto;
}

@Override
public void checarDesconto() {
    
}

}
