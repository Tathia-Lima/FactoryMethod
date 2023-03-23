package factoryMethod;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PagamentoBoletoTest {
    @Test
    void deveRealizarPagamento() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("Boleto");
        assertEquals("Pagamento com boleto realizado", pagamento.realizarPagamento());
    }

    @Test
    void deveCancelarPagamento() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("Boleto");
        assertEquals("Pagamento com boleto cancelado", pagamento.cancelarPagamento());
    }

}