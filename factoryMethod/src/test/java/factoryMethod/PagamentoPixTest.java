package factoryMethod;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PagamentoPixTest {

        @Test
        void deveRealizarPagamento() {
            IPagamento pagamento = PagamentoFactory.obterPagamento("Pix");
            assertEquals("Pagamento com Pix realizado", pagamento.realizarPagamento());
        }

        @Test
        void deveCancelarPagamento() {
            IPagamento pagamento = PagamentoFactory.obterPagamento("Pix");
            assertEquals("Pagamento com Pix cancelado", pagamento.cancelarPagamento());
        }

    }
