package padroescomportamentais.mediator;

public class TrocaDevolucao implements Departamento {

    private static TrocaDevolucao instancia = new TrocaDevolucao();

    private TrocaDevolucao() {}

    public static TrocaDevolucao getInstancia(){
        return instancia;
    }

    public String receberDuvida(String msg) {
        return "O departamento de Troca e Devolução procurará a melhor maneira de responder sua dúvida. " +
                "Agradecemos desde já pela mensagem: " + msg;
    }

    public String receberRequisicaoServico(String msg) {
        return "O departamento de Troca e Devolução irá encaminhar a abertura do seu processo. " +
                "Em breve, o número do protocolo será enviado com as demais instruções para seu e-mail de contato. " +
                "Agradecemos desde já pela mensagem: " + msg;
    }

    public String receberAvaliacaoServico(String msg) {
        return "O departamento de Troca e Devolução agradece desde já pela sua avaliação. Faremos o melhor para atender " +
                "sua reclamação ou sugestão: " + msg;
    }
}
