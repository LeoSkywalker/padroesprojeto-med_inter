package padroescomportamentais.mediator;

public class Pessoa {

    public String enviarDuvidaTrocaDevolucao(String msg) {
        return SAC.getInstancia().receberDuvidaTrocaDevolucao(msg);
    }

    public String enviarRequisicaoServicoTrocaDevolucao(String msg) {
        return SAC.getInstancia().receberRequisicaoServicoTrocaDevolucao(msg);
    }

    public String enviarAvaliacaoServicoTrocaDevolucao(String msg) {
        return SAC.getInstancia().receberAvaliacaoServicoTrocaDevolucao(msg);
    }
}
