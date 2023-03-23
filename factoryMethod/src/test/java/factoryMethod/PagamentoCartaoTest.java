package factoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoCartaoTest {
    @Test
    void deveRealizarPagamento() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("Cartao");
        assertEquals("Pagamento com cartão realizado", pagamento.realizarPagamento());
    }

    @Test
    void deveCancelarPagamento() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("Cartao");
        assertEquals("Pagamento com cartão cancelado", pagamento.cancelarPagamento());
    }

}