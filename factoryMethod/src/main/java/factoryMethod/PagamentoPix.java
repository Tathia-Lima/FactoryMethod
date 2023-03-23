package factoryMethod;

public class PagamentoPix implements IPagamento {
    public String realizarPagamento() {

        return "Pagamento com Pix realizado";
    }

    public String cancelarPagamento() {
        return "Pagamento com Pix cancelado";
    }
}
