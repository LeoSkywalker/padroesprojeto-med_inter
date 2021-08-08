package padroescomportamentais.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FormaPagamentoTest {

    @Test
    void deveRetornarDebito(){
        Interpretador interpretador = new InterpretarFormaPagamento();
        assertEquals("Debito", interpretador.interpretar("Debito"));
    }

    @Test
    void deveRetornarCredito(){
        Interpretador interpretador = new InterpretarFormaPagamento();
        assertEquals("Credito", interpretador.interpretar("Credito"));
    }

    @Test
    void deveRetornarExcecaoPagamentoNaoExistente() {
        try{
            Interpretador interpretador = new InterpretarFormaPagamento();
            assertEquals("Pix.", interpretador.interpretar("Pix"));
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Forma de pagamento não existente.", e.getMessage());

        }
    }
}
