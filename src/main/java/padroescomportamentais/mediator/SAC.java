package padroescomportamentais.mediator;

public class SAC{

    private static SAC instancia = new SAC();

    private SAC() {}

    public static SAC getInstancia() {
        return instancia;
    }

    public String receberDuvidaTrocaDevolucao(String msg){
        return "O SAC agradece seu contato. \n" +
                "O departamento de Troca e Devolução respondeu sua mensagem que se encontra abaixo: \n" +
                 TrocaDevolucao.getInstancia().receberDuvida(msg);
    }

    public String receberRequisicaoServicoTrocaDevolucao(String msg){
        return "O SAC agradece seu contato. \n" +
                "O departamento de Troca e Devolução respondeu sua mensagem que se encontra abaixo: \n" +
                TrocaDevolucao.getInstancia().receberRequisicaoServico(msg);
    }

    public String receberAvaliacaoServicoTrocaDevolucao(String msg){
        return "O SAC agradece seu contato. \n" +
                "O departamento de Troca e Devolução respondeu sua mensagem que se encontra abaixo: \n" +
                TrocaDevolucao.getInstancia().receberAvaliacaoServico(msg);
    }
}
