public class CheckDesconto implements Checagem{

    private Carrinho carrinho;

    public void checarDesconto(){

        if(carrinho.obterQuantidadeTotal() > 15){
            carrinho.setDesconto(Descontos.QUINZE_OU_MAIS);
            System.out.println("Desconto de 10% ");

        } else if (carrinho.obterQuantidadeTotal() > 10) {
            carrinho.setDesconto(Descontos.DEZ_A_QUINZE);
            System.out.println("Desconto de 8% ");

        } else if (carrinho.obterQuantidadeTotal() > 5) {
            carrinho.setDesconto(Descontos.CINCO_A_DEZ);
            System.out.println("Desconto de 5% ");

        } else {
            carrinho.setDesconto(Descontos.ATE_CINCO);
            System.out.println("Sem desconto ");
        }

    }
}
