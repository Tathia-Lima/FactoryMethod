package factoryMethod;

public class PagamentoCartao implements IPagamento {
    public String realizarPagamento() {
        return "Pagamento com cartão realizado";
    }

    public String cancelarPagamento() {
        return "Pagamento com cartão cancelado";
    }
}
