public class App {
    public static void main(String[] args) throws Exception {
        
        Produto pedido1 = new Produto("Tenis", 1, 150);
        Produto pedido2 = new Produto("Camisa", 1, 35);
        Produto pedido3 = new Produto("Calça", 1, 55);

        Carrinho carrinho = new Carrinho(pedido1);
        carrinho.adicionarCompra(pedido2);
        carrinho.adicionarCompra(pedido3);

        carrinho.visualizarCarrinho();
        carrinho.obterQuantidadeTotal();
        carrinho.obterPrecoTotal();

        carrinho.checarDesconto();

    }
}
