package factoryMethod;

public class PagamentoFactory {
    public static IPagamento obterPagamento(String pagamento) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("factoryMethod.Pagamento" + pagamento);
            objeto = classe.newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Erro ao obter pagamento");
        }
        if (!(objeto instanceof IPagamento)) {
            throw new IllegalArgumentException("Pagamento inválido");
        }
        return (IPagamento) objeto;
    }
}
