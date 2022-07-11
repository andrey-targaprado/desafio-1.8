public enum Descontos {
    
    QUINZE_OU_MAIS(0.1),
    DEZ_A_QUINZE(0.8),
    CINCO_A_DEZ(0.05),
    ATE_CINCO(0);

    private double valorDesconto;

    Descontos(double valorDesconto){
        this.valorDesconto = valorDesconto;
    }

}
