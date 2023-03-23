package factoryMethod;

public class PagamentoBoleto implements IPagamento {
    public String realizarPagamento() {

        return "Pagamento com boleto realizado";
    }

    public String cancelarPagamento() {

        return "Pagamento com boleto cancelado";
    }
}