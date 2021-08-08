package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    void deveEnviarDuvidaTrocaDevolucao() {
        Cliente cliente = new Cliente();
        assertEquals("O SAC agradece seu contato. \n" +
        "O departamento de Troca e Devolução respondeu sua mensagem que se encontra abaixo: \n" +
        "O departamento de Troca e Devolução procurará a melhor maneira de responder sua dúvida. " +
        "Agradecemos desde já pela mensagem: Bom dia! Preciso pagar a taxa de envio para devolver o produto?",
        cliente.enviarDuvidaTrocaDevolucao("Bom dia! Preciso pagar a taxa de envio para devolver o produto?"));
    }

    @Test
    void deveEnviarRequisicaoServicoTrocaDevolucao(){
        Cliente cliente = new Cliente();
        assertEquals("O SAC agradece seu contato. \n" +
        "O departamento de Troca e Devolução respondeu sua mensagem que se encontra abaixo: \n" +
        "O departamento de Troca e Devolução irá encaminhar a abertura do seu processo. " +
        "Em breve, o número do protocolo será enviado com as demais instruções para seu e-mail de contato. " +
        "Agradecemos desde já pela mensagem: Bom dia! Gostaria de efetuar uma troca!",
         cliente.enviarRequisicaoServicoTrocaDevolucao("Bom dia! Gostaria de efetuar uma troca!"));
    }
    @Test
    void deveEnviarAvaliacaoServicoTrocaDevolucao(){
        Cliente cliente = new Cliente();
        assertEquals("O SAC agradece seu contato. \n" +
        "O departamento de Troca e Devolução respondeu sua mensagem que se encontra abaixo: \n" +
        "O departamento de Troca e Devolução agradece desde já pela sua avaliação. Faremos o melhor para atender " +
        "sua reclamação ou sugestão: Bom dia! Gostei muito do serviço, rápido e com burocracia 0.",
        cliente.enviarAvaliacaoServicoTrocaDevolucao("Bom dia! Gostei muito do serviço, rápido e com burocracia 0."));
    }
}
